package main.model;

import java.util.EnumMap;
import java.util.Map;

public class Domain {

	private Map<TRADEABLE, Integer> goodsStore;
	
	
	public Domain () {
		
		goodsStore = new EnumMap<TRADEABLE, Integer>(TRADEABLE.class);
		initialise();
		
	}
	
	
	private void initialise () {
		
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

}
