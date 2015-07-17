package main.view;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import main.presenter.DrawablesRegister;
import main.presenter.MenuBarController;

	/**
	 * @author Jamie
	 *
	 * 
	 */

public class View extends JFrame {

	private static final long serialVersionUID = -4277571602364496156L;
	private static final int HEX_PANEL_SIZE = 900;
	private static final int INFO_PANEL_WIDTH = 200;
	private static final int MARGIN = 10; // Makes layout nicer
	private static Dimension APP_SIZE = new Dimension (HEX_PANEL_SIZE+INFO_PANEL_WIDTH+MARGIN, HEX_PANEL_SIZE);
	
	private JPanel hexPanel;
	private JPanel contextPanel;
	
	
	public View (DrawablesRegister dr, MenuBarController mbc) {
		
		super("Domains");
		initialise(dr, mbc);
		
	}
	
	
	private void initialise (DrawablesRegister dr, MenuBarController controller) {
		
		this.setPreferredSize(APP_SIZE);
		//this.setResizable(false);
		this.pack();
		this.setVisible(true);
		setUpToolBar(controller);
		hexPanel = new HexagonalPanel(new Dimension(HEX_PANEL_SIZE, HEX_PANEL_SIZE), dr);
		this.add(new JScrollPane(hexPanel), BorderLayout.EAST);
		//this.add(hexPanel, BorderLayout.EAST);
		contextPanel = new ContextPanel(new Dimension(INFO_PANEL_WIDTH, HEX_PANEL_SIZE), dr);
		this.add(contextPanel, BorderLayout.WEST);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}


	private void setUpToolBar(MenuBarController m) {
		
		JMenuBar bar = new JMenuBar();
			JMenu menu = new JMenu("Game");
				JMenuItem item = new JMenuItem("New");
					item.addActionListener(m.newGame_ActionListener());
				menu.add(item);
			bar.add(menu);
			menu = new JMenu("Time");
				item = new JMenuItem("Advance Season");
					item.addActionListener(m.advanceSeason_ActionListener());
				menu.add(item);
			bar.add(menu);
		this.setJMenuBar(bar);
		
	}
	
}
