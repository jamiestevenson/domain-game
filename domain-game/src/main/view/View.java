package main.view;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

	/**
	 * @author Jamie
	 *
	 * 
	 */

public class View extends JFrame {

	private static final long serialVersionUID = -4277571602364496156L;

	
	public View () {
		
		super("Domains");
		this.setPreferredSize(new Dimension(300, 300));
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		
	}
	
}
