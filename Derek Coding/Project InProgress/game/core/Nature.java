package game.core;

public enum Nature {
	HARDY (1.0, 1.0, 1.0, 1.0, 1.0),
	LONELY (1.1, 0.9, 1.0, 1.0, 1.0),
	BRAVE (1.1, 1.0, 1.0, 1.0, 0.9),
	ADAMANT (1.1, 1.0, 0.9, 1.0, 1.0),
	NAUGHTY (1.1, 1.0, 1.0, 0.9, 1.0),
	BOLD (0.9, 1.1, 1.0, 1.0, 1.0),
	DOCILE (1.0, 1.0, 1.0, 1.0, 1.0),
	RELAXED (1.0, 1.1, 1.0, 1.0, 0.9),
	IMPISH (1.0, 1.1, 0.9, 1.0, 1.0),
	LAX (1.0, 1.1, 1.0, 0.9, 1.0),
	TIMID (0.9, 1.0, 1.0, 1.0, 1.1),
	HASTY (1.0, 0.9, 1.0, 1.0, 1.1),
	SERIOUS (1.0, 1.0, 1.0, 1.0, 1.0),
	JOLLY (1.0, 1.0, 0.9, 1.0, 1.1),
	NAIVE (1.0, 1.0, 1.0, 0.9, 1.1),
	MODEST (0.9, 1.0, 1.1, 1.0, 1.0),
	MILD (1.0, 0.9, 1.1, 1.0, 1.0),
	QUIET (1.0, 1.0, 1.1, 1.0, 0.9),
	BASHFUL (1.0, 1.0, 1.0, 1.0, 1.0),
	RASH (1.0, 1.0, 1.1, 0.9, 1.0),
	CALM (0.9, 1.0, 1.0, 1.1, 1.0),
	GENTLE (1.0, 0.9, 1.0, 1.1, 1.0),
	SASSY (1.0, 1.0, 1.0, 1.1, 0.9),
	CAREFUL (1.0, 1.0, 0.9, 1.1, 1.0),
	QUIRKY (1.0, 1.0, 1.0, 1.0, 1.0);
	
	// multipliers
	public final double attack;
	public final double defence;
	public final double specialAttack;
	public final double specialDefence;
	public final double speed;
	
	private Nature(double attack, double defence, double specialAttack, double specialDefence, double speed) {
		this.attack = attack;
		this.defence = defence;
		this.specialAttack = specialAttack;
		this.specialDefence = specialDefence;
		this.speed = speed;
	}
	
	
}
