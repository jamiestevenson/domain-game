package main.presenter;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class Hexagon {
	
	private float radius;
	private float width;
	private float halfWidth;
	private float height;
	private float rowHeight;
	private Point offsetOrigin;
	private Point centre;
	
	public Hexagon (Point origin, int r) {
		
		this.radius = r;
		this.height = 2 * radius;
		this.rowHeight = 1.5f * radius;
		this.halfWidth = (float) Math.sqrt((radius * radius) - ((radius / 2) * (radius / 2)));
		this.width = 2 * this.halfWidth;
		this.offsetOrigin = doOriginOffset(origin);
		this.centre = centre(offsetOrigin);
		
	}
	
	
	private Point doOriginOffset (Point location) {

		return new Point(Math.round((location.x * width) + (((location.y % 2) == 1) ? halfWidth : 0)),
						 Math.round(location.y * rowHeight));
		
	}
	
	
	private Point centre (Point p) {

		return new Point (Math.round(p.x + halfWidth),
						  Math.round(p.y + (height / 2)));
		
	}
	
	
	public Point north () {
		
		return new Point(Math.round(centre.x),
 				Math.round(centre.y - radius));
		
	}

	
	public Point northEast () {
		
		return new Point(Math.round(centre.x + (halfWidth)),
					Math.round(centre.y - (radius/2)));
		
	}
	
	
	public Point southEast () {
		
		return new Point(Math.round(centre.x + halfWidth),
				Math.round(centre.y + (radius/2)));
		
	}
	
	
	public Point south () {
		
		return new Point(Math.round(centre.x),
 				Math.round(centre.y + radius));
		
	}
	
	
	public Point southWest () {
		
		return new Point(Math.round(centre.x - halfWidth),
				Math.round(centre.y + (radius/2)));
		
	}
	
	
	public Point northWest () {
		
		return new Point(Math.round(centre.x - halfWidth),
				Math.round(centre.y - (radius/2)));
		
	}
	
	
	
	public List<Point> points () {
		
		List<Point> reply = new ArrayList<>();
		reply.add(north());
		reply.add(northEast());
		reply.add(southEast());
		reply.add(south());
		reply.add(southWest());
		reply.add(northWest());
		return reply;
		
	}
	

}
