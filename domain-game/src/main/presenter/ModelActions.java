package main.presenter;

public interface ModelActions {

	
	/**
	 * Informs the model that a new game has been requested
	 */
	public void newGame();

	
	/**
	 * Informs the model that to advance the game season
	 */
	public void advanceSeason();

}
