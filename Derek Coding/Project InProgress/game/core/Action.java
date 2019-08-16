package game.core;

/**
 * An action that can be used on a turn. ex. a move or item.
 */
public interface Action {
	
	public boolean act();
	
	public int getPriority();
	
}
