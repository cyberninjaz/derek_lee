package game.moves;

	import game.core.DamageCategory;
	import game.core.Element;
	import game.core.Move;

	public class WaterGun extends Move {
		public WaterGun() {
			this.type = Element.WATER;
			this.power = 40;
			this.accuracy = 100;
			this.category = DamageCategory.SPECIAL;
		}

	}
