package test.model;

import static org.junit.Assert.*;
import main.model.County;
import main.model.Domain;
import main.presenter.TILE_TYPE;

import org.junit.Test;

public class CountyTest {

	@Test
	public void tileType_test() {
		Domain d = new County(null);
		assertEquals(TILE_TYPE.COUNTY, d.category());
	}

}
