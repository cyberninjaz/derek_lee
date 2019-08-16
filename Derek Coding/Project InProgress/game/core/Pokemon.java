package game.core;

public class Pokemon {
	public String name;
	public int level = 1;
	public Stats base = new Stats();
	public Stats iv = new Stats();
	public Stats ev = new Stats();
	public Move[] moves = new Move[4];
	public Element [] types = null;
	public Nature nature = null;
	public int currentHP = 1;
	
	public Pokemon() {
		// by default, name of Pokemon match the class name
		this.name = getClass().getSimpleName();
		
		// generate random IV's
		this.iv.attack = (int) (Math.random() * 32);
		this.iv.defence = (int) (Math.random() * 32);
		this.iv.specialAttack = (int) (Math.random() * 32);
		this.iv.specialDefense = (int) (Math.random() * 32);
		this.iv.speed = (int) (Math.random() * 32);
		// TODO ...
		
		// EV's start at 0
		this.ev.hp = 0;
		this.ev.attack = 0;
		this.ev.defence = 0;
		this.ev.specialAttack = 0;
		this.ev.specialDefense = 0;
		this.ev.speed = 0;
		// TODO ...
		
		// assign random nature by default
		this.nature = Nature.values()[(int) (Math.random() * Nature.values().length)];
	}
	
	public int getMaxHP() {
		return ((2 * base.hp + iv.hp + ev.hp / 4) * level) / 100 + level + 10;
	}
	public int getAttack() {
		return (int) ((((2 * base.hp + iv.hp + ev.hp / 4) * level) / 100 + 5) * nature.attack);
	}
	public int getDefence() {
		return (int) ((((2 * base.hp + iv.hp + ev.hp / 4) * level) / 100 + 5) * nature.defence);
	}
	public int getSpecialAttack() {
		return (int) ((((2 * base.hp + iv.hp + ev.hp / 4) * level) / 100 + 5) * nature.specialAttack);
	}
	public int getSpecialDefence() {
		return (int) ((((2 * base.hp + iv.hp + ev.hp / 4) * level) / 100 + 5) * nature.specialDefence);
	}
	public int getSpeed() {
		return (int) ((((2 * base.hp + iv.hp + ev.hp / 4) * level) / 100 + 5) * nature.speed);
	}
	
	public boolean hasType(Element type) {
		for (Element e : types)
			if (e == type)
				return true;
		return false;
	}
	
	public void fullRestore() {
		currentHP = getMaxHP();
	}
}
