package main.view;

import java.awt.Color;
import java.awt.Dimension;
import java.util.Observable;
import java.util.Observer;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

import main.presenter.Drawable;
import main.presenter.DrawablesRegister;

public class ContextPanel extends JPanel implements Observer {
	
	private static final long serialVersionUID = -158148840335554855L;
	private JLabel summary;
	private DrawablesRegister drawables;
	
	public ContextPanel (Dimension dimension, DrawablesRegister dr) {
		
		super();
		dr.addObserver(this);
		drawables = dr;
		initialise(dimension);

		
	}

	
	private void initialise(Dimension d) {

		this.setPreferredSize(d);
		this.setSize(d);
		this.setBackground(Color.LIGHT_GRAY);
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		summary = new JLabel();
		this.add(summary);
		setPanelContents(drawables.lastSelectionSummary());
		
	}

	
	private void setPanelContents(String contents){
		
		summary.setText(contents);
		
	}
	

	@Override
	public void update(Observable o, Object arg) {
		
		Drawable d = (Drawable) arg;
		setPanelContents(d.contextDescription());
		this.repaint();
		
	}


}
