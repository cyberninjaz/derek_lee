package game.battle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import game.core.Action;
import game.core.Battle;
import game.core.Move;
import game.core.Pokemon;
import game.core.Trainer;

public class SingleBattle extends Battle {
	
	private Map<Trainer, Pokemon> active = new HashMap<>(8);
	
	public Pokemon getActivePokemon(Trainer trainer) {
		return active.get(trainer);
	}
	
	public Trainer getOpponent(Trainer me) {
		if (me == trainers[0])
			return trainers[1];
		else if (me == trainers[1])
			return trainers[0];
		else
			throw new IllegalArgumentException("Trainer not in single battle");
	}
	
	private boolean checkKO(Trainer attacker, Trainer defender) {
		Pokemon a = getActivePokemon(attacker);
		Pokemon b = getActivePokemon(defender);
		boolean ko;
		
		if (a.currentHP <= 0)
			a = attacker.onPokemonKO(this);
		if (ko = b.currentHP <= 0)
			b = defender.onPokemonKO(this);
		
		active.put(attacker, a);
		active.put(defender, b);
		return ko;
	}
	
	public void start() {
		// both trainers start with their first pokemon
		active.put(trainers[0], trainers[0].party[0]);
		active.put(trainers[1], trainers[1].party[0]);
		
		// battle loop
		while(true) {
			// is battle over?
			for (Pokemon pokemon : active.values())
				if (pokemon == null)
					break;
			
			List<Action> actions = new ArrayList<>();
			boolean allMoves = true;
			
			// let each trainer take their turn
			for (Trainer trainer : trainers) {
				Action action = trainer.takeTurn(this);
				actions.add(action);
				if (!(action instanceof Move))
					allMoves = false;
			}
			
			// order actions correctly
			if (allMoves) {
				// figure out which order the pokemon should move in based on speed
				int ds = getActivePokemon(trainers[0]).getSpeed() - getActivePokemon(trainers[1]).getSpeed();
				if (ds == 0 && Math.random() < 0.50)
					ds = -1;
				if (ds < 0)
					Collections.swap(actions, 0, 1);
			} else
				Collections.sort(actions, (a, b) -> {
					return a.getPriority() - b.getPriority();
				});
			
			// do actions
			actions.get(0).act();
			if (!checkKO(trainers[0], trainers[1])) {
				actions.get(1).act();
				checkKO(trainers[1], trainers[0]);
			}
		}
	}

}
