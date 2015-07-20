package main.model;

import java.util.Collection;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.stream.Collectors;

import main.presenter.HexTile;
import main.presenter.ObservableSimulation;

public class Simulation extends Observable implements ObservableSimulation {
	
	// The current season of the simulation.
	private SEASON season;
	private Collection<HexTile> hexes;
	
	
	public Simulation (List<Domain> domains) {
		
		this.season = SEASON.SPRING;
		domains.forEach(d -> super.addObserver(d));
		this.hexes = domains.stream().map(Domain::getHex).collect(Collectors.toSet());
		
	}

	
	public SEASON season () {
		
		return season;
		
	}

	
	public void advanceSeason () {
		
		season = SEASON.advance(season);
		super.setChanged();
		super.notifyObservers(season.toString());
		
	}


	public Collection<HexTile> hexes () {

		return hexes;
		
	}


	@Override
	public void addObserver(Observer o) {
		super.addObserver(o);
	}
	
}
