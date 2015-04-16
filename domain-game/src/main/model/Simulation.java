package main.model;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import main.presenter.HexTile;

public class Simulation {
	
	// The current season of the simulation.
	private SEASON season;
	private Collection<HexTile> hexes;
	
	
	public Simulation (List<Domain> domains) {
		
		this.season = SEASON.SPRING;
		this.hexes = domains.stream().map(Domain::getHex).collect(Collectors.toSet());
		
	}

	
	public SEASON season () {
		return season;
	}

	
	public void advanceSeason () {
		
		season = SEASON.advance(season);
		
	}


	public Collection<HexTile> hexes() {

		return hexes;
		
	}
	
}
