package test.presenter;

import static org.junit.Assert.*;

import java.awt.event.ActionListener;

import main.presenter.MenuBarController;
import main.presenter.ModelActions;

import org.junit.Test;

public class MenuBarControllerTest {

	@Test
	public void existence_test () {
		
		MenuBarController mbc = new MenuBarController(null);
		assertNotNull(mbc);
		
	}
	
	@Test
	public void newGamListener_test () {
		
		class mockModelActions implements ModelActions {
			public boolean triggered = false;
		public mockModelActions() {
		}	
			@Override
			public void newGame() {
				triggered = true;
			}
			@Override
			public void advanceSeason() {
				// TODO Auto-generated method stub
				
			}
		}
		
		mockModelActions m = new mockModelActions();
		MenuBarController mbc = new MenuBarController(m);
		ActionListener a = mbc.newGame_ActionListener();
		a.actionPerformed(null);
		assertTrue(m.triggered);
		
	}

}
