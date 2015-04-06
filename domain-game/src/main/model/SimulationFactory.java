package main.model;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class SimulationFactory {

	public static Simulation blankSimulation () {
		
		List<Domain> d = new ArrayList<>();
		return new Simulation(d);
		
	}

	
	public static Simulation oneDomainSimulation () {

		List<Domain> d = new ArrayList<>();
		d.add(new County(new Point (0,0)));
		Simulation s = new Simulation(d);
		return s;
		
	}
	
	
	public static Simulation twentyFiveDomainSimulation () {

		List<Domain> d = new ArrayList<>();
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				
				//d.add(new Domain(new Point (i,j)));
				d.add(DomainFactory.makeCounty(new Point(i,j)));
				
			}
		}
		
		Simulation s = new Simulation(d);
		return s;
		
	}
	
	public static Simulation island_one_simulation () {
		
		List<Domain> d = new ArrayList<>();
		
		d.add(DomainFactory.makeCounty(new Point(0,0)));
		d.add(DomainFactory.makeCounty(new Point(0,1)));
		d.add(DomainFactory.makeCounty(new Point(0,2)));
		d.add(DomainFactory.makeCounty(new Point(1,0)));
		d.add(DomainFactory.makeCity(new Point(1,1)));
		d.add(DomainFactory.makeCounty(new Point(1,2)));
		d.add(DomainFactory.makeCounty(new Point(2,0)));
		d.add(DomainFactory.makeCounty(new Point(2,1)));
		d.add(DomainFactory.makeCounty(new Point(2,2)));
		
		Simulation s = new Simulation(d);
		return s;
	}
	
}
