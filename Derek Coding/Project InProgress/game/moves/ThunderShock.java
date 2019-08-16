package game.moves;

import game.core.DamageCategory;
import game.core.Element;
import game.core.Move;

public class ThunderShock extends Move {
	public ThunderShock() {
	this.type = Element.ELECTRIC;
	this.power = 40;
	this.accuracy = 100;
	this.category = DamageCategory.SPECIAL;
}
	}
