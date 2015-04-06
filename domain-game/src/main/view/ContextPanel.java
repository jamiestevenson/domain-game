package main.view;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class ContextPanel extends JPanel {
	
	private static final long serialVersionUID = -158148840335554855L;
	
	public ContextPanel(Dimension dimension) {
		
		super();
		initialise(dimension);
		
	}

	
	private void initialise(Dimension d) {

		this.setPreferredSize(d);
		this.setBackground(Color.LIGHT_GRAY);
		
	}


}
