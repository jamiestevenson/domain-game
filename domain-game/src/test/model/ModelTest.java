package test.model;

import static org.junit.Assert.*;

import java.awt.event.ActionListener;

import main.model.Model;

import org.junit.Test;

public class ModelTest {

	@Test
	public void existence_test () {
		
		Model m = new Model();
		assertNotNull(m);
		
	}
	
	
	@Test
	public void getListener_newGame_test () {
		
		Model m = new Model();
		ActionListener l = m.getListener_NewGame();
		assertNotNull(l);
		
	}
	
	
	@Test
	public void getGetHexes_test () {
		
		Model m = new Model();
		assertNotNull(m.getHexes());
		
	}
	
}
