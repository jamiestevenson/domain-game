package test.model;

import static org.junit.Assert.*;

import java.awt.Color;
import java.awt.Point;

import main.model.Domain;
import static main.model.domain.TRADEABLE.*;

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
		assertEquals(0, d1.stock(TRADE_GOODS));
		
	}
	
	
	@Test
	public void getHex_test () {
		
		Domain d1 = new DomainStub(new Point(0, 0));
		assertNotNull(d1.getHex());
		
	}
	
	@Test
	public void hasFortification () {
		
		Domain d1 = new DomainStub(new Point(0, 0));
		assertEquals(0, d1.fortification());
		
	}
	
	@Test
	public void isFortified () {
		
		Domain d1 = new DomainStub(new Point(0, 0));
		d1.fortify();
		assertEquals(1, d1.fortification());
		
	}
	
	@Test
	public void hasActions () {
		Domain d1 = new DomainStub(new Point(0, 0));
		int actions = d1.remainingActions();
		assertEquals(1, actions);
	}
	
	
	@Test
	public void hasActions_refresh () {
		Domain d1 = new DomainStub(new Point(0, 0));
		assertEquals(1, d1.remainingActions());
		d1.fortify();
		assertEquals(0, d1.remainingActions());
		d1.update(null, null);
		assertEquals(1, d1.remainingActions());
	}
	

	@Test
	public void hasActions_doFortify () {
		Domain d1 = new DomainStub(new Point(0, 0));
		d1.fortify();
		int actions = d1.remainingActions();
		assertEquals(0, actions);
	}
	
	
	@Test
	public void noActions_doFortify () {
		Domain d1 = new DomainStub(new Point(0, 0));
		d1.fortify();
		assertEquals(1, d1.fortification());
		int actions = d1.remainingActions();
		assertEquals(0, actions);
		d1.fortify();
		assertEquals(1, d1.fortification());
	}
	
	
	@Test
	public void hasActions_doFortifyWithResource () {
		Domain d1 = new DomainStub(new Point(0, 0));
		d1.importGoods(TRADE_GOODS);
		d1.fortifyWithTradeGoods();
		assertEquals(2, d1.fortification());
	}
	
	
	@Test
	public void noActions_doFortifyWithResource () {
		Domain d1 = new DomainStub(new Point(0, 0));
		d1.importGoods(TRADE_GOODS);
		d1.fortify();
		d1.fortifyWithTradeGoods();
		assertEquals(1, d1.fortification());
	}
	
	
	@Test
	public void import_tradeGoods () {
		Domain d1 = new DomainStub(new Point(0, 0));
		int tg = d1.stock(TRADE_GOODS);
		assertEquals(0, tg);
		d1.importGoods(TRADE_GOODS);
		tg = d1.stock(TRADE_GOODS);
		assertEquals(1, tg);
	}
	
	
	@Test
	public void export_tradeGoods_present () {
		Domain d1 = new DomainStub(new Point(0, 0));
		d1.importGoods(TRADE_GOODS);
		assertEquals(1, d1.stock(TRADE_GOODS));
		boolean success = d1.exportGoods(TRADE_GOODS);
		assertEquals(0, d1.stock(TRADE_GOODS));
		assertTrue(success);
	}
	
	
	@Test
	public void export_tradeGoods_absent () {
		Domain d1 = new DomainStub(new Point(0, 0));
		boolean success = d1.exportGoods(TRADE_GOODS);
		assertEquals(0, d1.stock(TRADE_GOODS));
		assertFalse(success);
	}
	
}
