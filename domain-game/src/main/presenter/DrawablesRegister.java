package main.presenter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Observable;

import main.model.Model;

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
		private Drawable model;
		
		public DrawablesRegister (Model model) {
			
			hexes = new ArrayList<Drawable>();
			lastSelected = null;
			this.model = model;
			register(model.hexes());
			
		}

		
		public void register(Collection<HexTile> collection) {
			hexes.addAll(collection);
			
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
				return model.contextDescription();
			} else {
				return lastSelected.contextDescription();
			}
			
		}
		
		
		private void changed () {
			
			this.setChanged();
			this.notifyObservers(lastSelected);
			
		}

}
