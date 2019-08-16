package game.trainer;

import game.Game;
import game.battle.SingleBattle;
import game.core.Action;
import game.core.Battle;
import game.core.MoveAction;
import game.core.Pokemon;
import game.core.Trainer;

// TODO: testing, needs extra functionality
// TODO: assumes single battle
public class PlayerTrainer extends Trainer {

	public Action takeTurn(Battle b) {
		SingleBattle battle = (SingleBattle) b;
		Pokemon pokemon = battle.getActivePokemon(this);
		
		System.out.println(name + "'s turn.");
		while (true) {
			System.out.print("(M)ove or (S)tats: ");
			char letter = Character.toUpperCase( Game.scanner.next().charAt(0) );
			switch(letter) {
				case 'S':
				{
					for (Trainer trainer : battle.trainers) {
						System.out.println("Trainer: " + trainer.name);
						for (Pokemon p : trainer.party)
							if (p != null)
								System.out.println(p.name + ": " + p.currentHP + "/" + p.getMaxHP());
						System.out.println();
					}
					break;
				}		
				
				case 'M':
				default:
				{
					System.out.println("Pick a move:");
					for (int i = 0; i < pokemon.moves.length; i++)
						if (pokemon.moves[i] != null)
							System.out.println(i + ". " + pokemon.moves[i].name);
					System.out.print("> ");
					int i = Game.scanner.nextInt();
					
					MoveAction action = new MoveAction();
					action.move = pokemon.moves[i];
					action.attacker = pokemon;
					action.target = battle.getActivePokemon( battle.getOpponent(this) );
					return action;
				}		
			}
		}
	}

	public Pokemon onPokemonKO(Battle battle) {
		System.out.println("Switch to which pokemon: ");
		boolean cont = false;
		for (int i = 0; i < party.length; i++)
			if (party[i] != null && party[i].currentHP > 0) {
				System.out.println(i + ". " + party[i]);
				cont = true;
			}
		if (!cont) {
			System.out.println("No more pokemon.");
			return null;
		}
		System.out.print("> ");
		int i = Game.scanner.nextInt();
		return party[i];
	}
	
}
