package main.model.domain;




public class ArmyFactory {

	public ArmyFactory () {
		
	}

	public static Army army(Traversable county) {
		return new CountyArmy (county);
	}
	
}
