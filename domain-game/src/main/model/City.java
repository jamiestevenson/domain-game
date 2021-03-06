package main.model;

import java.awt.Point;

import main.model.domain.Army;
import main.model.domain.TRADEABLE;
import main.presenter.TILE_TYPE;


public class City extends Domain {

	public City (Point p, String name) {
		
		super(p, name);
		
	}
	
	
	@Override
	public TILE_TYPE category() {

		return TILE_TYPE.CITY;
		
	}
	
	
	public void manufactureTradeGoods () {
		
		super.importGoods(TRADEABLE.TRADE_GOODS);
		
	}
	
	
	public void manufactureArms () {
		
		super.importGoods(TRADEABLE.ARMS);
		
	}


	@Override
	public void supplyYourArmy(Army army) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void disbandAtHome(Army army) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void disbandRemotely(Army army) {
		// TODO Auto-generated method stub
		
	}

}
