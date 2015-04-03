package main.presenter;

import java.awt.Color;
import java.awt.Polygon;

	/**
	 * @author Jamie
	 *
	 * This interfaces is implemented by any object that can be drawn to the screen easily using the
	 * paint/graphics facility.  This is the side of the presentation layer that faces Swing.
	 *
	 */

public interface Drawable {

		Polygon polygon (int scale);

		Color colour();

}
