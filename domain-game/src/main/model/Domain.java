package main.model;

import java.awt.Point;
import java.util.EnumMap;
import java.util.Map;

import main.presenter.Hex;

public class Domain {

	private Point point;
	private Map<TRADEABLE, Integer> goodsStore;
	private Hex hex;
	
	public Domain (Point p) {
		
		this.point = p;
		this.goodsStore = new EnumMap<TRADEABLE, Integer>(TRADEABLE.class);
		initialise(p);
		
	}
	
	
	private void initialise (Point p) {
		
		hex = new Hex(this);
		
		for (TRADEABLE t : TRADEABLE.values()) {
			goodsStore.put(t, 0);
		}
		
	}
	
	
	public int stock(TRADEABLE goodType) {

		return goodsStore.get(goodType);
		
	}
	
	
	protected void addTradeable (TRADEABLE goodType) {
		goodsStore.put(goodType, goodsStore.get(goodType)+1);
	}
	
	
	public Hex getHex () {
		
		return hex;
		
	}


	public Point getLocation() {

		return point;
		
	}

}
