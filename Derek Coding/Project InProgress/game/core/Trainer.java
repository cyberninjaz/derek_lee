package game.core;

/**
 * Makes decisions about what to do for a trainer's turn
 */
public abstract class Trainer {
	
	public String name = null;
	public Pokemon[] party = new Pokemon[6];
	
	public abstract Action takeTurn(Battle battle);
	
	public abstract Pokemon onPokemonKO(Battle battle);
}
