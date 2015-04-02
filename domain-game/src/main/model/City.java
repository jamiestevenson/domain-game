package main.model;

import java.awt.Point;


public class City extends Domain {

	public City (Point p) {
		
		super(p);
		
	}
	
	
	public void manufactureTradeGoods () {
		
		super.addTradeable(TRADEABLE.TRADE_GOODS);
		
	}
	
	
	public void manufactureArms () {
		
		super.addTradeable(TRADEABLE.ARMS);
		
	}

}
