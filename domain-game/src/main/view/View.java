package main.view;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JToolBar;

import main.model.Model;

	/**
	 * @author Jamie
	 *
	 * 
	 */

public class View extends JFrame {

	private static final long serialVersionUID = -4277571602364496156L;
	
	
	public View (Model m) {
		
		super("Domains");
		initialise(m);
		
	}
	
	
	private void initialise (Model model) {
		
		this.setPreferredSize(new Dimension(300, 300));
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		
		setUpToolBar(model);
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
