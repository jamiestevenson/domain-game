package main.presenter;

import java.awt.Color;

	/**
	 * @author Jamie
	 *
	 * This enum describes the different appearances of tile bases that the model can present.
	 * These types are the bridge between the what (is represented) and how (it is drawn).
	 */

public enum TILE_TYPE {
	
	COUNTY (Color.GREEN.darker()),
	CITY (Color.LIGHT_GRAY), 
	
	// For testing
	BLANK (Color.PINK);
	
	
	private Color colour;
	
	private TILE_TYPE (Color c) {
		
		this.colour = c;
		
	}

	public Color colour () {
		
		return colour;
		
	}
	
}
