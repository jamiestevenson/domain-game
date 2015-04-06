package main.model;

import java.awt.Point;

import main.presenter.TILE_TYPE;

public class County extends Domain {

	public County(Point p) {
		
		super(p);

	}

	@Override
	public TILE_TYPE category() {

		return TILE_TYPE.COUNTY;
		
	}

}
