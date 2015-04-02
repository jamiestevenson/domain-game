package main;

import main.model.Model;
import main.view.View;

public class RunThis {
	
	public static void main (String[] args) {
		
		Model m = new Model();
		
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                @SuppressWarnings("unused")
				View v = new View(m);
            }
        });
	
	}
}
