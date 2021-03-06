package main.model;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class SimulationFactory {

	private DomainFactory df;
	
	public SimulationFactory () {
		
		df = new DomainFactory();
		
	}
	
	
	private void bindNeighbours(List<Domain> domains) {
		
		for (Domain d : domains) {
			d.bindNeighbours(domains);
		}
		
	}
	
	
	public Simulation blankSimulation () {
		
		List<Domain> d = new ArrayList<>();
		return new Simulation(d);
		
	}

	
	public Simulation oneDomainSimulation () {

		List<Domain> d = new ArrayList<>();
		d.add(df.makeCounty(new Point (0,0)));
		Simulation s = new Simulation(d);
		return s;
		
	}
	
	
	public Simulation twentyFiveDomainSimulation () {

		List<Domain> d = new ArrayList<>();
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				
				d.add(df.makeCounty(new Point(i,j)));
				
			}
		}
		bindNeighbours(d);
		Simulation s = new Simulation(d);
		return s;
		
	}
	

	public Simulation island_one_simulation () {
		
		List<Domain> d = new ArrayList<>();
		
		d.add(df.makeCounty(new Point(0,0)));
		d.add(df.makeCounty(new Point(0,1)));
		d.add(df.makeCounty(new Point(0,2)));
		d.add(df.makeCounty(new Point(1,0)));
		d.add(df.makeCity(new Point(1,1)));
		d.add(df.makeCounty(new Point(1,2)));
		d.add(df.makeCounty(new Point(2,0)));
		d.add(df.makeCounty(new Point(2,1)));
		d.add(df.makeCounty(new Point(2,2)));
		
		bindNeighbours(d);
		Simulation s = new Simulation(d);
		return s;
	}
	
}
