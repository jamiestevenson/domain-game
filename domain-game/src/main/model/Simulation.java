package main.model;

import java.util.Collection;
import java.util.List;
import java.util.Observable;
import java.util.stream.Collectors;

import main.presenter.HexTile;

public class Simulation extends Observable {
	
	// The current season of the simulation.
	private SEASON season;
	private Collection<HexTile> hexes;
	
	
	public Simulation (List<Domain> domains) {
		
		this.season = SEASON.SPRING;
		domains.forEach(d -> this.addObserver(d));
		this.hexes = domains.stream().map(Domain::getHex).collect(Collectors.toSet());
		
	}

	
	public SEASON season () {
		
		return season;
		
	}

	
	public void advanceSeason () {
		
		season = SEASON.advance(season);
		this.setChanged();
		notifyObservers(season);
		
	}


	public Collection<HexTile> hexes () {

		return hexes;
		
	}
	
}
