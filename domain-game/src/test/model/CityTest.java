package test.model;

import static org.junit.Assert.*;
import main.model.City;
import main.model.Domain;
import main.model.domain.TRADEABLE;
import main.presenter.TILE_TYPE;

import org.junit.Test;

public class CityTest {

	@Test
	public void existence_test() {
		Domain d = new City(null, null);
		assertNotNull(d);
	}
	
	
	@Test
	public void tileType_test() {
		Domain d = new City(null, null);
		assertEquals(TILE_TYPE.CITY, d.category());
	}
	
	
	@Test
	public void goods () {
		
		City c = new City(null, null);
		assertEquals(0, c.stock(TRADEABLE.TRADE_GOODS));
		
	}
	

	@Test
	public void manufacture_tradeGoods () {
		
		City c = new City(null, null);
		assertEquals(0, c.stock(TRADEABLE.TRADE_GOODS));
		c.manufactureTradeGoods();
		assertEquals(1, c.stock(TRADEABLE.TRADE_GOODS));
		
	}
	
	
	@Test
	public void manufacture_arms () {
		
		City c = new City(null, null);
		assertEquals(0, c.stock(TRADEABLE.ARMS));
		c.manufactureArms();
		assertEquals(1, c.stock(TRADEABLE.ARMS));
		
	}

	
}
