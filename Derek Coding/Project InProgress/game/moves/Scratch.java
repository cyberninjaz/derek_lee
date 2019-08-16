package game.moves;

import game.core.DamageCategory;
import game.core.Element;
import game.core.Move;

public class Scratch extends Move {
	public Scratch() {
		this.type = Element.NORMAL;
		this.power = 40;
		this.accuracy = 100;
		this.category = DamageCategory.PHYSICAL;
	}
}
