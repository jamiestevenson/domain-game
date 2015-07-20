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


	public ActionListener advanceSeason_ActionListener() {

		return e -> model.advanceSeason();
		
	}


	public ActionListener countyRaiseArmy_ActionListener() {
		// TODO Auto-generated method stub
		return null;
	}


	public ActionListener countyRaiseLevy_ActionListener() {
		// TODO Auto-generated method stub
		return null;
	}


	public ActionListener countyTrade_ActionListener() {
		// TODO Auto-generated method stub
		return null;
	}


	public ActionListener countyHarvest_ActionListener() {
		// TODO Auto-generated method stub
		return null;
	}


	public ActionListener countyFortify_ActionListener() {
		// TODO Auto-generated method stub
		return null;
	}


	public ActionListener countyPrestige_ActionListener() {
		// TODO Auto-generated method stub
		return null;
	}


	public ActionListener cityFair_ActionListener() {
		// TODO Auto-generated method stub
		return null;
	}


	public ActionListener cityTrade_ActionListener() {
		// TODO Auto-generated method stub
		return null;
	}


	public ActionListener cityRaiseLevy_ActionListener() {
		// TODO Auto-generated method stub
		return null;
	}


	public ActionListener cityManufacture_ActionListener() {
		// TODO Auto-generated method stub
		return null;
	}


	public ActionListener cityFortify_ActionListener() {
		// TODO Auto-generated method stub
		return null;
	}


	public ActionListener cityPrestige_ActionListener() {
		// TODO Auto-generated method stub
		return null;
	}

}
