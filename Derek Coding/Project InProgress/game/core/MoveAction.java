package game.core;

public class MoveAction implements Action {

	public Move move;
	public Pokemon attacker;
	public Pokemon target;
	
	public boolean act() {
		if (Math.random() * 100 < move.accuracy) {
			target.currentHP -= move.damage(attacker, target);
			move.effect(attacker, target);
			return true;
		}
		return false;
	}

	public int getPriority() {
		return move.priority;
	}

}
