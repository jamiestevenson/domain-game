package main.model.domain;

	/**
	 * 
	 * @author Jamie
	 *
	 * This interface represents something that can supply an army with 'upkeep'
	 * supplies.
	 */

public interface SupplyTrain {
	
	/**
	 * Offers an army to a SupplyTrain to give the train a chance to restock the
	 * offered army.  The train may do nothing.
	 * @param countyArmy - the army to consider re-supplying
	 */
	public void supplyYourArmy (Army army);

	/**
	 * Instructs the domain that the army is disbanding in the home domain
	 * @param countyArmy - the army to be disbanded
	 */
	public void disbandAtHome(Army army);

	/**
	 * Instructs the domain that the army is disbanding outside the home domain
	 * @param countyArmy - the army to be disbanded
	 */
	public void disbandRemotely(Army army);


}
