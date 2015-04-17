package main.model.domain;



	/**
	 * @author Jamie
	 *
	 * Represents any type of unit that is in the 'combat' layer.
	 */

public class CountyArmy implements Army {

	private Traversable home;
	private TRADEABLE arms;
	private Traversable myLocation;
	
	
	public CountyArmy (Traversable home) {
		
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
	
	
	public boolean canEquip (TRADEABLE newArms) {
		
		return (this.arms == null && newArms == TRADEABLE.ARMS);
		
	}

	

	@Override
	public boolean canTraverse (Traversable destination) {

		return true;
		
	}
	
	
	@Override
	public void setLocation(Traversable domain) {
		
		this.myLocation = domain;
		
	}
	
	
	@Override
	public boolean isFrom (Traversable place) {

		return this.home.isSamePlaceAs(place);
		
	}
	
	
	@Override
	public void moveNorthEast() {
		
		myLocation.moveNorthEast(this);
		
	}
	
	
	@Override
	public void moveEast() {
		
		myLocation.moveEast(this);
		
	}
	
	
	@Override
	public void moveSouthEast() {
		
		myLocation.moveSouthEast(this);
		
	}
	
	
	@Override
	public void moveSouthWest() {
		
		myLocation.moveSouthWest(this);
		
	}
		
	
	@Override
	public void moveWest() {
		
		myLocation.moveWest(this);
		
	}
	
	
	@Override
	public void moveNorthWest() {
		
		myLocation.moveNorthWest(this);
		
	}

	

	
}
