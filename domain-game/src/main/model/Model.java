package main.model;

import java.util.Collection;

import main.presenter.DrawablesRegister;
import main.presenter.HexTile;
import main.presenter.ModelActions;

public class Model implements ModelActions {
	
	private Simulation simulation;
	
	public Model (DrawablesRegister drawables) {
		
		newGame();
		drawables.register(hexes());
		
	}


	@Override
	public void newGame() {
		
		simulation = SimulationFactory.island_one_simulation();
		
	}


	private Collection<HexTile> hexes () {

		return simulation.hexes();
		
	}

}
