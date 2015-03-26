package main.model;

public class Simulation {
	
	// The current season of the simulation.
	private SEASON season; 
	
	
	public Simulation () {
		
		this.season = SEASON.SPRING;
		
	}

	
	public SEASON season () {
		return season;
	}

	public void advanceSeason () {
		
		season = SEASON.advance(season);
		
	}
	
}
