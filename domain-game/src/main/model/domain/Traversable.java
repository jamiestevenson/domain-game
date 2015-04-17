package main.model.domain;

import java.awt.Point;

	/**
	 * @author Jamie
	 *
	 * This interface represents something that an army can be 'on' and is where the
	 * army directs efforts to move.
	 * 
	 *     NW  NE
	 *   W  -><-  E
	 *     SW  SE
	 */

public interface Traversable {

	void moveNorthEast(Army army);
	
	void moveEast(Army army);
	
	void moveSouthEast(Army army);
	
	void moveSouthWest(Army army);
		
	void moveWest(Army army);
	
	void moveNorthWest(Army army);

	Point location();

	boolean isSamePlaceAs(Traversable place);
	
}
