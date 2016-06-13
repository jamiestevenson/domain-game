package main.model.domain;

import main.model.County;




public class ArmyFactory {

	public ArmyFactory () {
		
	}

	public static Army army(County c) {
		return new CountyArmy (c, c);
	}
	
}
