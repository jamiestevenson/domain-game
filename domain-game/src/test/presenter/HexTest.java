package test.presenter;

import static org.junit.Assert.*;

import java.awt.Color;
import java.awt.Point;
import java.awt.Polygon;

import main.model.Domain;
import main.presenter.Hex;

import org.junit.Test;

public class HexTest {
	
	@Test
	public void existence_test() {
		Domain d = new Domain(new Point(0,0));
		Hex h = new Hex(d);
		assertNotNull(h);
	}
	
	@Test
	public void polygon_test() {
		Domain d = new Domain(new Point(0,0));
		Hex h = new Hex(d);
		Polygon p = h.polygon(1);
		assertNotNull(h);
	}
	
	@Test
	public void colour_test() {
		Domain d = new Domain(new Point(0,0));
		Hex h = new Hex(d);
		assertEquals(Color.GREEN, h.colour());
	}

}
