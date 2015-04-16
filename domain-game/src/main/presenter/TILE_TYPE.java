package main.presenter;

import java.awt.Color;

	/**
	 * @author Jamie
	 *
	 * This enum describes the different appearances of tile bases that the model can present.
	 * These types are the bridge between the what (is represented) and how (it is drawn).
	 */

public enum TILE_TYPE {
	
	COUNTY (Color.GREEN.darker(), "County"),
	CITY (Color.LIGHT_GRAY, "City"), 
	
	// For testing
	BLANK (Color.PINK, "Test Tile");
	
	
	private Color colour;
	private String label;
	
	private TILE_TYPE (Color c, String l) {
		
		this.colour = c;
		this.label = l;
		
	}

	public Color colour () {
		
		return colour;
		
	}
	
	
	@Override
	public String toString () {
		return label;
	}
}
