package test.presenter;

import static org.junit.Assert.*;

import java.awt.Point;

import main.presenter.Hexagon;

import org.junit.Test;

public class HexagonTest {

	@Test
	public void existence_even_test() {
		
		Hexagon h = new Hexagon(new Point(0, 0), 1);
		assertNotNull(h);
		
	}
	
	@Test
	public void existence_odd_test() {
		
		Hexagon h = new Hexagon(new Point(1, 1), 1);
		assertNotNull(h);
		
	}
	
	/*
	 * A test hex with origin (0,0) should be a hex with the top point on the x axis (y = 0) and
	 * distance^2 = r^2 - (r/2)^2
	 */
	
	@Test
	public void north_x_test() {
		int radius = 10;
		Hexagon h = new Hexagon(new Point(0, 0), radius);
		Point north = h.north();
		int x_dist = (int) Math.round(Math.sqrt((radius*radius)-((radius/2) * (radius/2))));
		assertEquals(x_dist, north.x);
		
	}
	
	@Test
	public void north_y_test() {
		
		Hexagon h = new Hexagon(new Point(0, 0), 10);
		Point north = h.north();
		assertEquals(0, north.y);
		
	}

}
