package main.presenter;

import java.util.Observable;
import java.util.Observer;

public class SimulationPresenter implements Observer {
	
	private StringBuffer status;
	
	public SimulationPresenter (ObservableSimulation s) {
		
		s.addObserver(this);
		status = new StringBuffer("Season: SPRING"); //FIXME - make this automatic
		
	}

	
	private void setContents (String s) {
		
		status = new StringBuffer();
		status.append("Season: " + s);
		
	}
	
	
	public String contextDescription() {
		
		return status.toString();
		
	}
	

	@Override
	public void update(Observable o, Object arg) {
		String season = (String) arg;
		setContents(season);
	}

}
