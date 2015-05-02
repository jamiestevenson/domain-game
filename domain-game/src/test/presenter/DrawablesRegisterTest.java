package test.presenter;

import static org.junit.Assert.*;
import main.model.Model;
import main.presenter.DrawablesRegister;

import org.junit.Test;

public class DrawablesRegisterTest {

	@Test
	public void existence_test() {
		DrawablesRegister dr = new DrawablesRegister(new Model());
		assertNotNull(dr);
	}
	
	
	@Test
	public void registerIsEmpty_Test () {
		
		DrawablesRegister dr = new DrawablesRegister(new Model());
		assertFalse(dr.getHexes().isEmpty());
		
	}

}
