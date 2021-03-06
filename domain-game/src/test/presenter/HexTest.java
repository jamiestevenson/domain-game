package test.presenter;

import static org.junit.Assert.*;

import java.awt.Color;
import java.awt.Point;
import java.awt.Polygon;

import main.model.County;
import main.model.Domain;
import main.presenter.HexTile;

import org.junit.Test;

public class HexTest {
	
	@Test
	public void existence_test() {
		Domain d = new County(new Point(0,0), null);
		HexTile h = new HexTile(d);
		assertNotNull(h);
	}
	
	@Test
	public void polygon_exist_test() {
		Domain d = new County(new Point(0,0), null);
		HexTile h = new HexTile(d);
		assertNotNull(h);
	}
	
	@Test
	public void polygon_points_test() {
		Domain d = new County(new Point(0,0), null);
		HexTile h = new HexTile(d);
		Polygon p = h.polygon(10);
		assertNotNull(p);
	}
	
	
	
	@Test
	public void colour_test() {
		Domain d = new County(new Point(0,0), null);
		HexTile h = new HexTile(d);
		assertEquals(Color.GREEN.darker(), h.colour());
	}

}
