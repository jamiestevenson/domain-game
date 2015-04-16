package main.model;

import java.awt.Point;
import java.util.Random;

public class DomainFactory {

	private Random random;
	// https://www.wikiwand.com/en/List_of_ancient_counties_of_England_by_area_in_1891
	private String[] counties = {"Yorkshire", "Lincolnshire","Devon","Norfolk","Northumberland","Lancashire","Somerset","Hampshire","Kent","Essex","Cumberland","Suffolk","Sussex","Wiltshire","Cornwall","Shropshire","Gloucestershire","Staffordshire","Derbyshire","Cheshire","Durham","Northamptonshire","Dorset","Warwickshire","Cambridgeshire","Nottinghamshire","Herefordshire","Leicestershire","Westmorland","Surrey","Oxfordshire","Worcestershire","Buckinghamshire","Berkshire","Hertfordshire","Bedfordshire","Huntingdonshire","Middlesex","Rutland"};
	// https://www.wikiwand.com/en/List_of_towns_and_cities_in_England_by_historical_population
	private String[] cities = {"London","Birmingham","Liverpool","Manchester","Leeds","Bristol","Middlesbrough","Coventry","Nottingham","Bradford","Hull","Leicester","Wolverhampton","Stoke-on-Trent","Plymouth","Newcastle","Derby","Sunderland","Southampton","Portsmouth","Dudley","Walsall","West Bromwich","Brighton","Southend-on-Sea","Luton","Bolton","Blackpool","Bournemouth","Stockport","Birkenhead","Reading","Salford","Huddersfield","Northampton","Ipswich","Norwich","Oxford","Poole"};
	
	private int cityCounter;
	private int countyCounter;
	
	public DomainFactory () {
		
		random = new Random();
		countyCounter = random.nextInt(counties.length);
		cityCounter = random.nextInt(cities.length);
		
	}
	
	public Domain makeCounty(Point p) {

		return new County(p, generateCountyName());
		
	}

	
	public Domain makeCity(Point p) {

		return new City(p, generateCityName());
		
	}
	
	
	private String generateCountyName () {
		
		String name = counties[countyCounter];
		incrementCounty();
		return name;
		
	}
	
	
	private String generateCityName () {
		
		String name = cities[cityCounter];
		incrementCity();
		return name;
		
	}
	
	
	private void incrementCounty () {
		
		if (countyCounter < (counties.length-1)) {
			countyCounter++;
		} else {
			countyCounter = 0;
		}
		
	}
	
	
	private void incrementCity () {
		
		if (cityCounter < (cities.length-1)) {
			cityCounter++;
		} else {
			cityCounter = 0;
		}
		
	}
	
}
