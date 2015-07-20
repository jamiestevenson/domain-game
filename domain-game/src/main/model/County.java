package main.model;

import java.awt.Point;

import main.model.domain.Army;
import main.model.domain.ArmyFactory;
import main.presenter.TILE_TYPE;
import static main.model.SEASON.*;

public class County extends Domain {

	// This is an 'army belongs to' relationship - for placement, see Domain.
	private Army army;
	
	public County(Point p, String name) {
		
		super(p, name);
		army = null;

	}

	@Override
	public TILE_TYPE category () {

		return TILE_TYPE.COUNTY;
		
	}
	
	
	private boolean canRaiseArmy () {
		
		return super.actionLeft() && army==null;
				
	}
	

	public boolean raiseArmy() {
		
		if (canRaiseArmy()) {
			super.useAction();
			createArmy();
			return true;
		} else {
			return false;
		}
		
	}

	
	private void createArmy() {
		
		this.army = ArmyFactory.army(this);
		super.placeArmy(this.army);
		
	}
	
	
	public Army army() {

		return army;
		
	}



}
