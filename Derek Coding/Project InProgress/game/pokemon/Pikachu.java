package game.pokemon;

import game.core.Element; 
import game.core.Pokemon;
import game.moves.ThunderShock;
import game.moves.QuickAttack;

public class Pikachu extends Pokemon {
	public Pikachu() {
		this.types = new Element[] { Element.ELECTRIC };
			
		// base stats
		this.base.hp = 35;
		this.base.attack = 55;
		this.base.defence = 40;
		this.base.specialAttack = 50;
		this.base.specialDefense = 50;
		this.base.speed = 90;
			
		// moves this Pokemon starts with
		this.moves[0] = new ThunderShock();
		this.moves [2] = new QuickAttack();
		// this.moves[1] = new Growl();
			
		fullRestore();
		}

	}


