package main.model;

import java.util.Collection;

import main.presenter.DrawablesRegister;
import main.presenter.HexTile;
import main.presenter.ModelActions;

public class Model implements ModelActions {
	
	private SimulationFactory sf;
	private Simulation simulation;
	
	public Model (DrawablesRegister drawables) {
		
		sf = new SimulationFactory();
		newGame();
		drawables.register(hexes());
		
	}


	@Override
	public void newGame() {
		
		simulation = sf.island_one_simulation();
		
	}


	private Collection<HexTile> hexes () {

		return simulation.hexes();
		
	}

}
