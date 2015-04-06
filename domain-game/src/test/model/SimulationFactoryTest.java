package test.model;

import static org.junit.Assert.*;
import main.model.City;
import main.model.Simulation;
import main.model.SimulationFactory;

import org.junit.Test;

public class SimulationFactoryTest {

	@Test
	public void existence_test () {
		SimulationFactory sf = new SimulationFactory();
		assertNotNull(sf);
	}

	
	@Test
	public void twentyFiveDomain_test () {
		
		Simulation s = SimulationFactory.twentyFiveDomainSimulation();
		assertEquals(25, s.hexes().size());
		
	}
	
	
	@Test
	public void island_one_test () {
		
		Simulation s = SimulationFactory.island_one_simulation();
		assertEquals(9, s.hexes().size());
		
	}
	
}
