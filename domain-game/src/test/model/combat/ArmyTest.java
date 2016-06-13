package test.model.combat;

import static org.junit.Assert.*;

import java.awt.Point;

import main.model.County;
import main.model.DomainFactory;
import main.model.domain.CountyArmy;
import main.model.domain.TRADEABLE;

import org.junit.Test;

public class ArmyTest {

	@Test
	public void create_test () {
		
		County c = new DomainFactory().makeCounty(new Point(0,0));
		CountyArmy a = new CountyArmy(c, c);
		assertNotNull(a);
		
	}
	
	
	@Test
	public void canEquip_test () {
		
		County c = new DomainFactory().makeCounty(new Point(0,0));
		CountyArmy a = new CountyArmy(c, c);
		assertFalse(a.canEquip(TRADEABLE.FOOD_RESERVE));
		assertFalse(a.canEquip(TRADEABLE.TRADE_GOODS));
		assertTrue(a.canEquip(TRADEABLE.ARMS));
		
	}
	
	
	@Test
	public void armWithGoods_test () {
		
		County c = new DomainFactory().makeCounty(new Point(0,0));
		CountyArmy a = new CountyArmy(c, c);
		assertTrue(a.canEquip(TRADEABLE.ARMS));
		a.arm(TRADEABLE.ARMS);
		assertFalse(a.canEquip(TRADEABLE.ARMS));
		
	}

}
