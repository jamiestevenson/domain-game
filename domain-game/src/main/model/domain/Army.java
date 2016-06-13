package main.model.domain;

import java.util.List;

import main.model.SEASON;



public interface Army {

	/**
	 * Checks if this army is capable of traversing a location
	 * @param neighbour - the terrain that may eb moved into
	 * @return true if terrain can be traversed, otherwise false
	 * 		   NB - this estimation is based on movement ability and does not account for
	 *              time, cost, or consequences of the movement
	 */
	boolean canTraverse (Traversable neighbour);

	/**
	 * Set the location of this army
	 * @param domain - the new current location of the army
	 */
	void setLocation (Traversable domain);

	/**
	 * Checks if an army is from a nominated 'home' location
	 * @param domain - the candidate 'home' location
	 * @return true if the location of the nominated {@link Traversable} is the same as the location
	 *         of the home domain for this army, otherwise false.
	 */
	boolean isFrom (Traversable domain);

	void moveNorthEast();

	void moveEast();
	
	void moveSouthEast();
	
	void moveSouthWest();
		
	void moveWest();
	
	void moveNorthWest();

	/**
	 * Notify the army that a new season has passed
	 * @param s - the new {@link SEASON}
	 */
	void update(SEASON s);

	/**
	 * Gets all of the resources that can be recovered from an army
	 * @return a list of {@link TRADEABLE} goods, the list may be empty
	 *         NB - usually TRADE_GOODS and/or ARMS are returned from disbanding an army
	 */
	List<TRADEABLE> strip();
	
}
