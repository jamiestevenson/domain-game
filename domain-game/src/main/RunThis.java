package main;

import main.view.View;

public class RunThis {
	
	public static void main (String[] args) {
		
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                View v = new View();
            }
        });
	
	}
}
