package main.presenter;

import java.awt.Color;
import java.awt.Point;
import java.awt.Polygon;
import java.util.List;

public class HexTile implements Drawable {

	private Point origin;
	private Presentable subject;

	
	public HexTile (Presentable d) {
		
		this.subject = d;
		this.origin = d.location();
		
	}

	public Polygon polygon(int rad) {

		Hexagon hex = new Hexagon(origin, rad);
		return makePolygon(hex);
		
	}
	
	
	public Color colour () {
		
		return subject.category().colour();
		
	}
	
	
	private Polygon makePolygon (Hexagon hex) {
		
		return pointsToPolygon(hex.points());
		
	}
	
	
	private Polygon pointsToPolygon (List<Point> points) {
		
		int count = points.size();
		int[] xs = new int[count];
		int[] ys = new int[count];
		for (int i = 0; i < count ; i++) {
			xs[i] = points.get(i).x;
			ys[i] = points.get(i).y;
		}
		return new Polygon (xs, ys, count);
		
	}


	@Override
	public String contextDescription() {

		return subject.toHTML();
		
	}
	
}
