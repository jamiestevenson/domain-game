package test.model;

import static org.junit.Assert.*;
import main.model.Model;
import main.presenter.DrawablesRegister;

import org.junit.Test;

public class ModelTest {

	@Test
	public void existence_test () {
		
		Model m = new Model(new DrawablesRegister());
		assertNotNull(m);
		
	}
	
}
