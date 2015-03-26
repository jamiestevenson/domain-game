package main.model;


public class City extends Domain {

	public City () {
		
		super();
		
	}
	
	
	public void manufactureTradeGoods () {
		
		super.addTradeable(TRADEABLE.TRADE_GOODS);
		
	}
	
	
	public void manufactureArms () {
		
		super.addTradeable(TRADEABLE.ARMS);
		
	}

}
