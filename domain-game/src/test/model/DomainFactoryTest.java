package test.model;

import static org.junit.Assert.*;

import java.awt.Point;

import main.model.Domain;
import main.model.DomainFactory;

import org.junit.Test;

public class DomainFactoryTest {

	// Constructor test for coverage - static factory class
	@Test
	public void existence_test() {
		
		DomainFactory df = new DomainFactory();
		assertNotNull(df);
		
	}
	
	
	@Test
	public void county_test() {
		
		Point p = new Point (0,0);
		Domain d = DomainFactory.makeCounty(p);
		assertNotNull(d);
		
	}
	
	@Test
	public void city_test() {
		
		Point p = new Point (0,0);
		Domain d = DomainFactory.makeCity(p);
		assertNotNull(d);
		
	}
	

}
