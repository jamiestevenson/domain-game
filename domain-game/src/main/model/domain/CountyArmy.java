package main.model.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import main.model.SEASON;



	/**
	 * @author Jamie
	 *
	 * Represents any type of unit that is in the 'combat' layer.
	 */

public class CountyArmy implements Army {

	private SupplyTrain supplySource;
	private Optional<TRADEABLE> arms;
	private final Traversable home;
	private Traversable myLocation;
	private Optional<TRADEABLE> rations;
	
	
	public CountyArmy (SupplyTrain supply, Traversable home) {
		
		this.supplySource = supply;
		this.arms = Optional.empty();
		this.home = home;
		this.myLocation = home;
		this.rations = Optional.empty();
		
	}
	
	
	public void arm (TRADEABLE newArms) {
		
		if (newArms == TRADEABLE.ARMS) {
			
			this.arms = Optional.of(newArms);
			
		} else {
			
			throw new RuntimeException("Cannot equip " + newArms);
			
		}
		
	}
	
	
	public boolean canEquip (TRADEABLE newArms) {
		
		return (!arms.isPresent() && newArms == TRADEABLE.ARMS);
		
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


	@Override
	public void update(SEASON s) {
		if (s == SEASON.WINTER) {
			supplySource.supplyYourArmy(this);
			standOrDisband();
		}
	}
	

	private void standOrDisband() {
		if (!rations.isPresent()) {
			disband();
		} else {
			rations = Optional.empty();
		}
	}


	private void disband() {
		if (myLocation.equals(home)) {
			supplySource.disbandAtHome(this);
		} else {
			supplySource.disbandRemotely(this);
		}
	}
	
	
	@Override
	public List<TRADEABLE> strip() {
		List<TRADEABLE> reply = new ArrayList<>();
		if (arms.isPresent()) {
			reply.add(arms.get());
		}
		if (rations.isPresent()) {
			reply.add(rations.get());
		}
		return reply;
	}
	
}
