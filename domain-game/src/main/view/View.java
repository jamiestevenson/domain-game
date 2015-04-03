package main.view;

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
	private static final int SIZE = 900;
	private static Dimension SCREEN_SIZE = new Dimension (SIZE, SIZE);
	
	private JPanel hexPanel;
	
	
	public View (DrawablesRegister dr, MenuBarController mbc) {
		
		super("Domains");
		initialise(dr, mbc);
		
	}
	
	
	private void initialise (DrawablesRegister dr, MenuBarController controller) {
		
		this.setPreferredSize(SCREEN_SIZE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		setUpToolBar(controller);
		hexPanel = new HexagonalPanel(SCREEN_SIZE, dr);
		this.add(new JScrollPane(hexPanel));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}


	private void setUpToolBar(MenuBarController m) {
		
		JMenuBar bar = new JMenuBar();
		this.setJMenuBar(bar);
		JMenu menu = new JMenu("Game");
		bar.add(menu);
		JMenuItem item = new JMenuItem("New");
		item.addActionListener(m.newGame_ActionListener());
		menu.add(item);	
		
	}
	
}
