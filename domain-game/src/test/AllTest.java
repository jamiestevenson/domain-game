package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import test.model.CityTest;
import test.model.DomainTest;
import test.model.SEASONTest;
import test.model.SimulationTest;

	
@RunWith(Suite.class)
@Suite.SuiteClasses({DomainTest.class,
		 SimulationTest.class,
		 SEASONTest.class,
		 CityTest.class})
	

public class AllTest {

}


