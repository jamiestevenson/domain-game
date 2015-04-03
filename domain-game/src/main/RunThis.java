package main;

import main.model.Model;
import main.presenter.DrawablesRegister;
import main.presenter.MenuBarController;
import main.view.View;

public class RunThis {
	
	public static void main (String[] args) {
		
		DrawablesRegister drawables = new DrawablesRegister();
		Model m = new Model(drawables);
		MenuBarController mbc = new MenuBarController(m);
		
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                @SuppressWarnings("unused")
				View v = new View(drawables, mbc);
            }
        });
	
	}
}
