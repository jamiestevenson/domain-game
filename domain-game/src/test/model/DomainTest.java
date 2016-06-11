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
public void toHTML () {

	Domain d1 = new DomainStub(new Point(0, 0));
	String html = d1.toHTML();
	String expected = defaultHTML();
	assertEquals(expected, html);
}


private String defaultHTML() {
	return "<html>" +
							 "<b>Domain Stub</b> <i>(Test Tile)</i>" +
					 "<br>" +
							 "Location: (0, 0)" +
					 "<br>" +
						"Prestige: 0" +
				 "<br>" +
						 "Fortification: 0" +
				 "<br>" +
					 "<u>Resources:</u>" +
				 "<br>" +
					 defaultGoodsStoreHTML() +
						 "<u>Left to do this turn:</u>" +
				 "<br>" +
					 "Actions: 0" +
				 "<br>" +
					 "Exports: 0" +
				 "<br>" +
					 "Imports: 0" +
				 "<br>" +
			 "</html>";
}


	private String defaultGoodsStoreHTML() {
		return "<table>" +
						 "<tr>" +
						 "<td>Trade Goods</td>" +
						 "<td>0</td>" +
					 "</tr>" +
						 "<tr>" +
						 "<td>Food Reserve</td>" +
						 "<td>0</td>" +
					 "</tr>" +
						 "<tr>" +
						 "<td>Arms</td>" +
						 "<td>0</td>" +
					 "</tr>" +
					 "</table>";
	}
}
