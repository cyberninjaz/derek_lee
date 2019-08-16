package game.core;

public class Move {
	public String name;
	public int power = 0;
	public int accuracy = 0;
	public Element type = null;
	public DamageCategory category = null;
	public int priority = 0;
	
	public Move() {
		// by default, name of move is name of class
		this.name = getClass().getSimpleName();
	}
	
	public int damage(Pokemon attacker, Pokemon defender) {
		double ad;  // attack/defence ratio
		if (category == DamageCategory.PHYSICAL)
			ad = attacker.getAttack() / defender.getDefence();
		else if (category == DamageCategory.SPECIAL)
			ad = attacker.getSpecialAttack() / defender.getSpecialDefence();
		else
			return 0;  // status moves don't do damage!
		
		double damage = ((2.0 * attacker.level / 5.0 + 2) * power * ad) / 50.0 + 2;
		
		// type matchup
		for (Element e : defender.types)
			damage *= type.vs(e);
		
		// random modifiers
		damage *= Math.random() * 0.15 + 0.85;  // random double between 0.85 and 1.00
		
		// critical chance
		if (Math.random() < 0.0625)
			damage *= 2;
		
		// STAB
		if (attacker.hasType(type))
			damage *= 1.5;
		
		// TODO: burn cuts physical damage in half
		// TODO: weather effects fire and water moves
		
		return (int) Math.floor(damage);
		
		// (TODO: return extra info, ex. that there was a critical hit)
	}
	
	public void effect(Pokemon attacker, Pokemon defender) {
		// does nothing by default
		// should be overridden by moves that have extra effects
	}
}
