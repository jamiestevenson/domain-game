package test.model;

import java.awt.Point;

import main.model.Domain;
import main.model.domain.Army;
import main.presenter.TILE_TYPE;

public class DomainStub extends Domain {

	public DomainStub(Point p) {
		
		super(p, "Domain Stub");
		
	}

	@Override
	public TILE_TYPE category() {

		return TILE_TYPE.BLANK;
		
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
