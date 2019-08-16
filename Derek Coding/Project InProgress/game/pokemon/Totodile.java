package game.pokemon;

import game.core.Element;
import game.core.Pokemon;
import game.moves.Scratch;
import game.moves.WaterGun;

public class Totodile extends Pokemon {
	public Totodile() {
		this.types = new Element[] { Element.WATER };
		
		// base stats
		this.base.hp = 50;
		this.base.attack = 65;
		this.base.defence = 64;
		this.base.specialAttack = 44;
		this.base.specialDefense = 48;
		this.base.speed = 43;
		
		// moves this Pokemon starts with
		this.moves[0] = new Scratch();
		this.moves[2] = new WaterGun();
		// this.moves[1] = new Leer();
		
		fullRestore();
	}
	
}
