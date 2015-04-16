package main.model.combat;

import main.model.County;
import main.model.Domain;
import main.model.TRADEABLE;

	/**
	 * @author Jamie
	 *
	 * Represents any type of unit that is in the 'combat' layer.
	 */

public class Army {

	private County home;
	private TRADEABLE arms;
	private Traversable myLocation;
	
	public Army (County home) {
		
		this.home = home;
		arms = null;
		myLocation = home;
		
	}
	
	public void arm (TRADEABLE newArms) {
		
		if (newArms == TRADEABLE.ARMS) {
			
			this.arms = newArms;
			
		} else {
			
			throw new RuntimeException("Cannot equip " + newArms);
			
		}
		
	}
	
	
	public void setLocation(Domain domain) {
		
		this.myLocation = domain;
		
	}
	
	
	public boolean canEquip (TRADEABLE newArms) {
		
		return (this.arms == null && newArms == TRADEABLE.ARMS);
		
	}

	
	public boolean isFrom (Domain domain) {
		// Comparing county and domain on location (domain attribute)
		return this.home.location().equals(domain.location());
		
	}

	
	void moveNorthEast() {
		
		myLocation.moveNorthEast(this);
		
	}
	

	public void moveEast() {
		
		myLocation.moveEast(this);
		
	}
	
	public void moveSouthEast() {
		
		myLocation.moveSouthEast(this);
		
	}
	
	public void moveSouthWest() {
		
		myLocation.moveSouthWest(this);
		
	}
		
	public void moveWest() {
		
		myLocation.moveWest(this);
		
	}
	
	public void moveNorthWest() {
		
		myLocation.moveNorthWest(this);
		
	}

	public boolean canTraverse(Domain destination) {

		return true;
		
	}
	
}
