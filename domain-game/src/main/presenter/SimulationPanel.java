package main.presenter;

import javax.swing.JPanel;

import main.model.Simulation;

public class SimulationPanel extends JPanel {

	private static final long serialVersionUID = 4402775093135544827L;
	
	private Simulation sim;
	
	
	public SimulationPanel (Simulation s) {
		
		sim = s;
		
	}

}
