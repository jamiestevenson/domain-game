package main.view;

import java.awt.Color;
import java.awt.Dimension;
import java.util.Observable;
import java.util.Observer;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

import main.presenter.Drawable;
import main.presenter.DrawablesRegister;

public class ContextPanel extends JPanel implements Observer {
	
	private static final long serialVersionUID = -158148840335554855L;
	private JPanel summary;
	
	public ContextPanel (Dimension dimension, DrawablesRegister dr) {
		
		super();
		dr.addObserver(this);
		initialise(dimension);
		
	}

	
	private void initialise(Dimension d) {

		this.setPreferredSize(d);
		this.setBackground(Color.LIGHT_GRAY);
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		this.add(new JLabel("<html><u>Selected:</u>"));
		this.add(Box.createRigidArea(new Dimension(0,4)));
		summary = new JPanel();
		this.add(summary);
		
	}


	@Override
	public void update(Observable o, Object arg) {
		
		Drawable d = (Drawable) arg;
		this.removeAll();
		this.add(d.contextPanel());
		this.repaint();
		
	}


}
