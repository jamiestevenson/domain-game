package main.model;

import java.awt.Color;
import java.awt.Polygon;
import java.util.Collection;

import main.presenter.Drawable;
import main.presenter.HexTile;
import main.presenter.ModelActions;
import main.presenter.SimulationPanel;

public class Model implements ModelActions, Drawable {
	
	private SimulationFactory sf;
	private Simulation simulation;
	private SimulationPanel gameStatusPanel;
	
	
	public Model () {
		
		sf = new SimulationFactory();
		newGame();
		gameStatusPanel = new SimulationPanel(simulation);
		
	}


	@Override
	public void newGame() {
		
		simulation = sf.island_one_simulation();
		
	}


	public Collection<HexTile> hexes () {

		return simulation.hexes();
		
	}


	@Override
	public void advanceSeason() {
		
		simulation.advanceSeason();
		
	}


	@Override
	public Polygon polygon(int scale) {
		return null;
	}


	@Override
	public Color colour() {
		return null;
	}


	@Override
	public String contextDescription() {
		return  gameStatusPanel.contextDescription();
	}

}
