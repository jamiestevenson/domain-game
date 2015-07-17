package main.presenter;

import java.util.Observable;
import java.util.Observer;

import main.model.SEASON;
import main.model.Simulation;

public class SimulationPanel implements Observer {
	
	private StringBuffer status;
	
	public SimulationPanel (Simulation s) {
		
		s.addObserver(this);
		setContents(s.season());
		
	}

	
	private void setContents (SEASON s) {
		
		status = new StringBuffer();
		status.append("Season: "+s.toString());
		
	}
	
	
	public String contextDescription() {
		
		return status.toString();
		
	}
	

	@Override
	public void update(Observable o, Object arg) {
		SEASON s = (SEASON) arg;
		setContents(s);
	}

}
