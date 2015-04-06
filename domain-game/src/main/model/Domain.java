package main.model;

import java.awt.Point;
import java.util.EnumMap;
import java.util.Map;

import main.presenter.Presentable;
import main.presenter.HexTile;
import main.presenter.TILE_TYPE;

public abstract class Domain implements Presentable {
	
	private HexTile hex;
	private Point point;
	private Map<TRADEABLE, Integer> goodsStore;
	private int prestige;
	
	
	public Domain (Point p) {
		
		this.point = p;
		this.goodsStore = new EnumMap<TRADEABLE, Integer>(TRADEABLE.class);
		initialise(p);
		
	}
	
	
	private void initialise (Point p) {
		
		hex = new HexTile(this);
		
		for (TRADEABLE t : TRADEABLE.values()) {
			goodsStore.put(t, 0);
		}
		
		prestige = 0;
		
	}
	
	
	public int stock(TRADEABLE goodType) {

		return goodsStore.get(goodType);
		
	}
	
	
	protected void addTradeable (TRADEABLE goodType) {
		goodsStore.put(goodType, goodsStore.get(goodType)+1);
	}
	
	
	public HexTile getHex () {
		
		return hex;
		
	}


	@Override
	public Point location() {

		return point;
		
	}


	@Override
	public abstract TILE_TYPE category();


	public int prestige() {

		return prestige;
		
	}

}
