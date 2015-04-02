package main.model;

import java.awt.event.ActionListener;
import java.util.Collection;

import main.presenter.Hex;

public class Model {
	
	private Simulation simulation;
	
	
	public Model () {
		
		newGame();
		
	}
	

	public ActionListener getListener_NewGame() {

		return e -> newGame();
		
	}


	public void newGame() {
		
		simulation = SimulationFactory.twentyFiveDomainSimulation();
		
	}


	public Collection<Hex> getHexes() {

		return simulation.hexes();
		
	}

}
