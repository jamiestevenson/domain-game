package main.model.domain;

public enum TRADEABLE {
	
	TRADE_GOODS ("Trade Goods"),
	FOOD_RESERVE ("Food Reserve"),
	ARMS ("Arms");
	
	
	String label;
	
	private TRADEABLE (String label) {
		this.label = label;
	}
	
	
	@Override
	public String toString () {
		return this.label;
	}
}
