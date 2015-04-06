package test.presenter;

import static org.junit.Assert.*;

import java.awt.Color;

import main.presenter.TILE_TYPE;

import org.junit.Test;

public class TILE_TYPETest {

	@Test
	public void city_test() {
		assertEquals(Color.LIGHT_GRAY, TILE_TYPE.CITY.colour());
	}
	
	@Test
	public void county_test() {
		assertEquals(Color.GREEN.darker(), TILE_TYPE.COUNTY.colour());
	}
	
	@Test
	public void blank_test() {
		assertEquals(Color.PINK, TILE_TYPE.BLANK.colour());
	}

}
