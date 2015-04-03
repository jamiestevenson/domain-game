package main.presenter;

import java.awt.event.ActionListener;

public class MenuBarController {

	private ModelActions model;
	
	
	public MenuBarController(ModelActions m) {

		this.model = m;

	}


	public ActionListener newGame_ActionListener() {

		return e -> model.newGame();
		
	}

}
