package test.model;

import static org.junit.Assert.*;
import main.model.SEASON;

import org.junit.Test;

public class SEASONTest {

	@Test
	public void advanceTest1() {
		SEASON s = SEASON.SPRING;
		assertEquals(SEASON.SUMMER, SEASON.advance(s));
	}

	
	@Test
	public void advanceTest2() {
		SEASON s = SEASON.SPRING;
		s = SEASON.advance(s);
		assertEquals(SEASON.AUTUMN, SEASON.advance(s));
	}
	
	@Test
	public void advanceTest3() {
		SEASON s = SEASON.SPRING;
		s = SEASON.advance(s);
		s = SEASON.advance(s);
		assertEquals(SEASON.WINTER, SEASON.advance(s));
	}
	
	@Test
	public void rollOver_Test() {
		SEASON s = SEASON.WINTER;
		assertEquals(SEASON.SPRING, SEASON.advance(s));
	}
	
}
