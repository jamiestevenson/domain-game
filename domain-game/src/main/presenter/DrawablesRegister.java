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
		
		public DrawablesRegister () {
			
			hexes = new ArrayList<Drawable>();
			lastSelected = null;
			
		}

		
		public void register(Collection<HexTile> collection) {
			hexes.addAll(collection);
			
		}

		
		public Collection<Drawable> getHexes() {

			return hexes;
			
		}


		public void setLastSelectedDrawable(Drawable d) {
			
			lastSelected = d;
			changed();
			
		}
		
		
		public String lastSelectionSummary () {
			if (lastSelected == null) {
				return "Nothing selected!";
			} else {
				return lastSelected.toInfoPanelFormat();
			}
			
		}
		
		
		private void changed () {
			
			this.setChanged();
			this.notifyObservers(lastSelected);
			
		}

}
