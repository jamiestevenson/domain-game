package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import test.model.CityTest;
import test.model.DomainFactoryTest;
import test.model.DomainTest;
import test.model.ModelTest;
import test.model.SEASONTest;
import test.model.SimulationFactoryTest;
import test.model.SimulationTest;
import test.presenter.DrawablesRegisterTest;
import test.presenter.HexTest;
import test.presenter.HexagonTest;
import test.presenter.MenuBarControllerTest;
import test.presenter.TILE_TYPETest;

	
@RunWith(Suite.class)
@Suite.SuiteClasses({DomainTest.class,
		 SimulationTest.class,
		 SEASONTest.class,
		 CityTest.class,
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


