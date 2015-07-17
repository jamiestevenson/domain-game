package test.presenter;

import static org.junit.Assert.*;
import main.model.Model;
import main.presenter.DrawablesRegister;

import org.junit.Test;

public class DrawablesRegisterTest {

	@Test
	public void existence_test() {
		Model m = new Model();
		DrawablesRegister dr = new DrawablesRegister(m.hexes(), m.presenter());
		assertNotNull(dr);
	}
	
	
	@Test
	public void registerIsEmpty_Test () {
		
		Model m = new Model();
		DrawablesRegister dr = new DrawablesRegister(m.hexes(), m.presenter());
		assertFalse(dr.getHexes().isEmpty());
		
	}

}
