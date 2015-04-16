package main.model.combat;

import main.model.County;

public class ArmyFactory {

	public ArmyFactory () {
		
	}

	public static Army army(County county) {
		return new Army(county);
	}
	
}
