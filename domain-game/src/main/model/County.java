package main.model;

import java.awt.Point;

import main.presenter.TILE_TYPE;

public class County extends Domain {

	private Army army;
	
	public County(Point p, String name) {
		
		super(p, name);
		army = null;

	}

	@Override
	public TILE_TYPE category() {

		return TILE_TYPE.COUNTY;
		
	}

	public boolean raiseArmy() {
		
		if (army != null) {
			return false;
		} else {
			createArmy();
			return true;
		}
		
	}

	
	private void createArmy() {
		
		army = new Army(this);
		
	}
	
	
	public Army army() {

		return army;
		
	}

}
