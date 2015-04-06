package main.presenter;

import java.awt.Point;

	/**
	 * @author Jamie
	 *
	 * Implemented by any model entity that has a presence in the UI, this interface is used by
	 * the model entities corresponding presenter object to get (minimal) state information.
	 */

public interface Presentable {

	/**
	 * Gets the top left 'origin' of the entity implementing this interface
	 * @return Point containing (x,y) coordinates
	 */
	public Point location ();

	public TILE_TYPE category();
	
}
