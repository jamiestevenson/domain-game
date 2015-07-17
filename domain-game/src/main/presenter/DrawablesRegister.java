package main.presenter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Observable;


	/**
	 * 
	 * @author Jamie
	 *
	 * This class acts as a bridge between the Model and View - and is the definitive information
	 * expert of what should be be being drawn.
	 * 
	 * I have not used Model-View-Presenter before and am trying to avoid a View-Model dependencies.
	 *
	 */

public class DrawablesRegister extends Observable {
	
		private Collection<Drawable> hexes;
		private Drawable lastSelected;
		private SimulationPresenter simulation;
		
		public DrawablesRegister (Collection<HexTile> d, SimulationPresenter sim) {
			
			hexes = new ArrayList<Drawable>();
			lastSelected = null;
			hexes.addAll(d);
			simulation = sim;
			
		}

		
		public Collection<Drawable> getHexes() {

			return hexes;
			
		}


		// Notify the register that something has been clicked on. 
		public void setLastSelectedDrawable(Drawable d) {
			
			lastSelected = d;
			changed();
			
		}
		
		
		public String lastSelectionSummary () {
			
			if (lastSelected == null) {
				return simulation.contextDescription();
			} else {
				return lastSelected.contextDescription();
			}
			
		}
		
		
		private void changed () {
			
			this.setChanged();
			this.notifyObservers(lastSelectionSummary());
			
		}

}
