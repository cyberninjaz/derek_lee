package game.moves;

import game.core.DamageCategory;
import game.core.Element;
import game.core.Move;

public class Ember extends Move {
	public Ember() {
		this.type = Element.FIRE;
		this.power = 40;
		this.accuracy = 100;
		this.category = DamageCategory.SPECIAL;
	}
}
