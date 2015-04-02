package main.view;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


import javax.swing.JPanel;

import main.model.Model;

	/**
	 * @author Jamie
	 *
	 * 
	 */

public class View extends JFrame {

	private static final long serialVersionUID = -4277571602364496156L;
	private static final int SIZE = 900;
	private static Dimension SCREEN_SIZE = new Dimension (SIZE, SIZE);
	
	private JPanel hexPanel;
	
	
	public View (Model m) {
		
		super("Domains");
		initialise(m);
		
	}
	
	
	private void initialise (Model model) {
		
		this.setPreferredSize(SCREEN_SIZE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		
		setUpToolBar(model);
		hexPanel = new HexagonalPanel(SCREEN_SIZE, model);
		this.add(hexPanel);
		
	}


	private void setUpToolBar(Model m) {
		
		JMenuBar bar = new JMenuBar();
		this.setJMenuBar(bar);
		JMenu menu = new JMenu("Game");
		bar.add(menu);
		JMenuItem item = new JMenuItem("New");
		item.addActionListener(m.getListener_NewGame());
		menu.add(item);	
		
	}
	
}
