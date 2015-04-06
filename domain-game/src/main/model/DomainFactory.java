package main.model;

import java.awt.Point;

public class DomainFactory {

	public static Domain makeCounty(Point p) {

		return new County(p);
		
	}

	public static Domain makeCity(Point p) {

		return new City(p);
		
	}
	
}
