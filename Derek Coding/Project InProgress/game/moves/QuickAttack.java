package game.moves;

import game.core.DamageCategory;
import game.core.Element;
import game.core.Move;

public class QuickAttack extends Move {
	public QuickAttack() {
		this.type = Element.NORMAL;
		this.power = 40;
		this.accuracy = 100;
		this.category = DamageCategory.PHYSICAL;
	}
}