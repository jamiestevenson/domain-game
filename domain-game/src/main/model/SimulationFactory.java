package main.model;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class SimulationFactory {

	public static Simulation blankSimulation () {
		
		List<Domain> d = new ArrayList<>();
		return new Simulation(d);
		
	}

	
	public static Simulation oneDomainSimulation() {

		List<Domain> d = new ArrayList<>();
		d.add(new Domain(new Point (0,0)));
		Simulation s = new Simulation(d);
		return s;
		
	}
	
	
	public static Simulation twentyFiveDomainSimulation() {

		List<Domain> d = new ArrayList<>();
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				d.add(new Domain(new Point (i,j)));
			}
		}
		
		Simulation s = new Simulation(d);
		return s;
		
	}
	
}
