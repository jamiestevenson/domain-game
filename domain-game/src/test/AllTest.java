package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import test.model.ArmyMovementTest;
import test.model.CityTest;
import test.model.CountyTest;
import test.model.DomainFactoryTest;
import test.model.DomainTest;
import test.model.ModelTest;
import test.model.SEASONTest;
import test.model.SimulationFactoryTest;
import test.model.SimulationTest;
import test.model.combat.ArmyTest;
import test.presenter.DrawablesRegisterTest;
import test.presenter.HexTest;
import test.presenter.HexagonTest;
import test.presenter.MenuBarControllerTest;
import test.presenter.TILE_TYPETest;

	
@RunWith(Suite.class)
@Suite.SuiteClasses({
		 ArmyTest.class,
		 ArmyMovementTest.class,
		 DomainTest.class,
		 SimulationTest.class,
		 SEASONTest.class,
		 CityTest.class,
		 CountyTest.class,
		 ModelTest.class,
		 HexTest.class,
		 HexagonTest.class,
		 DomainFactoryTest.class, 
		 DrawablesRegisterTest.class, 
		 MenuBarControllerTest.class, 
		 SimulationFactoryTest.class, 
		 TILE_TYPETest.class})
	

public class AllTest {

}


