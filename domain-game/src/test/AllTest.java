package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import test.model.CityTest;
import test.model.DomainTest;
import test.model.ModelTest;
import test.model.SEASONTest;
import test.model.SimulationTest;
import test.presenter.HexTest;

	
@RunWith(Suite.class)
@Suite.SuiteClasses({DomainTest.class,
		 SimulationTest.class,
		 SEASONTest.class,
		 CityTest.class,
		 ModelTest.class,
		 HexTest.class})
	

public class AllTest {

}


