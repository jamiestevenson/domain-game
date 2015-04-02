package test.model;

import static org.junit.Assert.*;
import main.model.City;
import main.model.TRADEABLE;

import org.junit.Test;

public class CityTest {

	@Test
	public void existence_test() {
		City c = new City(null);
		assertNotNull(c);
	}
	
	
	@Test
	public void goods () {
		
		City c = new City(null);
		assertEquals(0, c.stock(TRADEABLE.TRADE_GOODS));
		
	}
	

	@Test
	public void manufacture_tradeGoods () {
		
		City c = new City(null);
		assertEquals(0, c.stock(TRADEABLE.TRADE_GOODS));
		c.manufactureTradeGoods();
		assertEquals(1, c.stock(TRADEABLE.TRADE_GOODS));
		
	}
	
	
	@Test
	public void manufacture_arms () {
		
		City c = new City(null);
		assertEquals(0, c.stock(TRADEABLE.ARMS));
		c.manufactureArms();
		assertEquals(1, c.stock(TRADEABLE.ARMS));
		
	}

	
}
