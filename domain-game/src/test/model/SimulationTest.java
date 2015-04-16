package test.model;

import static org.junit.Assert.*;
import main.model.SEASON;
import main.model.Simulation;
import main.model.SimulationFactory;

import org.junit.Test;

public class SimulationTest {

	@Test
	public void existence_test() {
		
		SimulationFactory sf = new SimulationFactory();
		Simulation s = sf.blankSimulation();
		assertNotNull(s);
		
	}
	
	
	@Test
	public void hasSeason_test() {
		
		SimulationFactory sf = new SimulationFactory();
		Simulation s = sf.blankSimulation();
		assertEquals(SEASON.SPRING, s.season());
		
	}
	
	
	@Test
	public void advanceSeason_test() {
		
		SimulationFactory sf = new SimulationFactory();
		Simulation s = sf.blankSimulation();
		s.advanceSeason();
		assertEquals(SEASON.SUMMER, s.season());
		
	}
	
	
	@Test
	public void withOneDomain_test() {
		
		SimulationFactory sf = new SimulationFactory();
		Simulation s = sf.oneDomainSimulation();
		assertEquals(1, s.hexes().size());
		
	}

}
