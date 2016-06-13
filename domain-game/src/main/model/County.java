package main.model;

import java.awt.Point;
import java.util.List;
import java.util.Observable;

import main.model.domain.Army;
import main.model.domain.ArmyFactory;
import main.model.domain.TRADEABLE;
import main.presenter.TILE_TYPE;

public class County extends Domain {

	// This is an 'army belongs to' relationship - for placement, see Traversable.
	private Army army;
	private int cantRaiseArmyCounter;
	
	public County(Point p, String name) {
		
		super(p, name);
		army = null;
		cantRaiseArmyCounter = 0;

	}

	
	public Army army() {
		return army;		
	}
	
	
	@Override
	public TILE_TYPE category () {
		return TILE_TYPE.COUNTY;		
	}
	
	
	private boolean canRaiseArmy () {	
		return super.actionLeft() && army==null && cantRaiseArmyCounter <= 0;	
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
	
	
	@Override
	public void supplyYourArmy(Army a) {
		if (a == this.army) {
			supplyArmy(a);
		}
	}


	/**
	 * Supplies an army if TRADEABLE.TRADE_GOODS are available to do so.
	 */
	private void supplyArmy(Army a) {
		if(this.stock(TRADEABLE.TRADE_GOODS) > 1) {
			this.exportGoods(TRADEABLE.TRADE_GOODS);
		}
	}


	@Override
	public void disbandAtHome(Army army) {
		importGoods(army.strip());
		this.army = null;
	}

	
	private void importGoods(List<TRADEABLE> goods) {
		goods.forEach(g -> importGoods(g));
	}
	

	@Override
	public void disbandRemotely(Army army) {
		this.army = null;
		cantRaiseArmyCounter = Dice.roll(1, 6);
	}
	
	
	@Override
	public final void update(Observable o, Object arg) {
		super.update(o, arg); // FIXME Not sure if this is the best way to do this
		tickCantRaiseArmyCounter();
	}


	private void tickCantRaiseArmyCounter() {
		if(cantRaiseArmyCounter > 0) {
			cantRaiseArmyCounter -= 1;
		}
	}

}
