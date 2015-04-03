package main.presenter;

import java.util.ArrayList;
import java.util.Collection;

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

public class DrawablesRegister {
	
		private Collection<Drawable> hexes;
		
		
		public DrawablesRegister () {
			
			hexes = new ArrayList<Drawable>();
			
		}

		
		public void register(Collection<HexTile> collection) {
			hexes.addAll(collection);
			
		}

		
		public Collection<Drawable> getHexes() {

			return hexes;
			
		}

}
