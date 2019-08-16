package game.pokemon;

import game.core.Element; 
import game.core.Pokemon;
import game.moves.Ember;
import game.moves.Scratch;

public class Charmander extends Pokemon {
	public Charmander() {
		this.types = new Element[] { Element.FIRE };
		
		// base stats
		this.base.hp = 39;
		this.base.attack = 52;
		this.base.defence = 43;
		this.base.specialAttack = 60;
		this.base.specialDefense = 50;
		this.base.speed = 65;
		
		// moves this Pokemon starts with
		this.moves[0] = new Scratch();
		this.moves [2] = new Ember();
		// this.moves[1] = new Growl();
		
		fullRestore();
	}

}
