package main.model;

	/**
	 * @author Jamie
	 *
	 * Represents any type of unit that is in the 'combat' layer.
	 */

public class Army {

	private County home;
	private TRADEABLE arms;
	
	public Army (County home) {
		
		this.home = home;
		arms = null;
		
	}
	
	public void arm (TRADEABLE newArms) {
		
		if (newArms == TRADEABLE.ARMS) {
			this.arms = newArms;
		} else {
			throw new RuntimeException("Cannot equip "+newArms);
		}
		
	}
	
	
	public boolean canEquip (TRADEABLE newArms) {
		
		return (this.arms == null && newArms == TRADEABLE.ARMS);
		
	}
	
}
