package test.model;

import static org.junit.Assert.*;

import java.awt.Color;
import java.awt.Point;

import main.model.Domain;
import main.model.domain.TRADEABLE;

import org.junit.Test;

public class DomainTest {

	@Test
	public void existence_test() {
		
		Domain d = new DomainStub(new Point(0, 0));
		assertNotNull(d);
		
	}
	
	
	@Test
	public void prestige_exists_test() {
		
		Domain d = new DomainStub(new Point(0, 0));
		assertEquals(0, d.prestige());
		
	}
	
	
	
	@Test
	public void category_test () {
		
		Domain d = new DomainStub(new Point(0, 0));
		assertEquals(Color.PINK, d.category().colour());
		
	}
	
	
	@Test
	public void trade_stock_goods_Test () {
		
		Domain d1 = new DomainStub(new Point(0, 0));
		assertEquals(0, d1.stock(TRADEABLE.TRADE_GOODS));
		
	}
	
	
	@Test
	public void getHex_test () {
		
		Domain d1 = new DomainStub(new Point(0, 0));
		assertNotNull(d1.getHex());
		
	}
	

}
