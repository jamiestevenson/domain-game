package test;

import static org.junit.Assert.*;
import main.SEASON;
import main.Simulation;

import org.junit.Test;

public class SimulationTest {

	@Test
	public void existence_test() {
		
		Simulation s = new Simulation();
		assertNotNull(s);
		
	}
	
	
	@Test
	public void hasSeason_test() {
		
		Simulation s = new Simulation();
		assertEquals(SEASON.SPRING, s.season());
		
	}
	
	
	@Test
	public void advanceSeason_test() {
		
		Simulation s = new Simulation();
		s.advanceSeason();
		assertEquals(SEASON.SUMMER, s.season());
		
	}
	

}
