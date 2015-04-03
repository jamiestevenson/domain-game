package test.presenter;

import static org.junit.Assert.*;

import java.awt.Point;

import main.presenter.Hexagon;

import org.junit.Test;

public class HexagonTest {

	@Test
	public void existence_test() {
		
		Hexagon h = new Hexagon(new Point(0, 0), 1);
		assertNotNull(h);
		
	}
	
	/*
	 * A test hex with origin (0,0) should be a hex with the top point on the x axis (y = 0) and
	 * distance^2 = r^2 - (r/2)^2
	 */
	
	@Test
	public void north_x_test() {
		
		Hexagon h = new Hexagon(new Point(0, 0), 10);
		Point north = h.north();
		int x_dist = (int) Math.sqrt(0.0);
		assertEquals(x_dist, north.x);
		
	}
	
	@Test
	public void north_y_test() {
		
		Hexagon h = new Hexagon(new Point(0, 0), 10);
		Point north = h.north();
		assertEquals(0, north.y);
		
	}

}
