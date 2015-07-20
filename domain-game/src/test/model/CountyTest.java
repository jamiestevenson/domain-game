package test.model;

import static org.junit.Assert.*;

import java.awt.Point;

import main.model.County;
import main.model.DomainFactory;
import main.model.SEASON;
import main.model.domain.Army;
import main.presenter.TILE_TYPE;

import org.junit.Test;

public class CountyTest {

	@Test
	public void tileType_test () {
		County c = new DomainFactory().makeCounty(new Point(0,0));
		assertEquals(TILE_TYPE.COUNTY, c.category());
	}
	
	
	@Test
	public void raiseArmyFromBlank_test () {
		County c = new DomainFactory().makeCounty(new Point(0,0));
		boolean reply = c.raiseArmy();
		assertTrue(reply);
	}
 
	
	@Test
	public void raiseTwoArmies_shouldFail_test () {
		County c = new DomainFactory().makeCounty(new Point(0,0));
		c.raiseArmy();
		boolean reply = c.raiseArmy();
		assertFalse(reply);
	}
	
	
	@Test
	public void interrogateArmyFromBlank_test () {
		County c = new DomainFactory().makeCounty(new Point(0,0));
		c.raiseArmy();
		Army reply = c.army();
		assertNotNull(reply);
	}
	
	@Test
	public void armyOverWinter_noFood () {
		County c = new DomainFactory().makeCounty(new Point(0,0));
		c.update(null, SEASON.WINTER);
		c.raiseArmy();
		assertNotNull(c.army());
		c.update(null, SEASON.SPRING);
		assertNull(c.army());
	}

	
}
