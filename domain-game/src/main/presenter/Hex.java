package main.presenter;

import java.awt.Color;
import java.awt.Point;
import java.awt.Polygon;

import main.model.Domain;

public class Hex {

	private Point location;


	public Hex (Domain d) {
		
		this.location = d.getLocation();
		
	}


	public Polygon polygon(int scale) {
		
		return makePolygon(scale);
		
	}


	public Color colour () {
		return Color.GREEN;
	}
	
	
	private Polygon makePolygon (int scale) {
		
		int[] ys = calculateYs(scale);
		int[] xs = calculateXs(scale);
		return new Polygon(xs, ys, 4);
		
	}
	
	
	private int[] calculateXs (int scale) {
		
		int x = location.x;
		return new int[] {x*scale, (x+1)*scale, (x+1)*scale, x*scale};
	
	}
	

	private int[] calculateYs(int scale) {
		
		int y = location.y;
		if (isEven(location.x)) {
			return new int[] {(y*scale), 
								(y*scale), 
								((y+1)*scale), 
								((y+1)*scale)};
		} else {
			int s = scale/2;
			return new int[] {((y*scale)+s), 
								((y*scale)+s), 
								(((y+1)*scale)+s),
								(((y+1)*scale)+s)};
		}
		
	}


	private boolean isEven(int x) {

		return x%2 == 0;
		
	}


}
