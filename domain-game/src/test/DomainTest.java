package test;

import static org.junit.Assert.*;
import main.Domain;
import main.TRADEABLE;

import org.junit.Test;

public class DomainTest {

	@Test
	public void existence_test() {
		
		Domain d = new Domain();
		assertNotNull(d);
		
	}
	
	
	@Test
	public void trade_stock_goods_Test () {
		
		Domain d1 = new Domain();
		assertEquals(0, d1.stock(TRADEABLE.TRADE_GOODS));
		
	}

}
