package main.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.RenderingHints;
import java.util.Collection;

import javax.swing.JPanel;

import main.presenter.Drawable;
import main.presenter.DrawablesRegister;


public class HexagonalPanel extends JPanel {

	private static final long serialVersionUID = 2875093917722096774L;
	private static int SCALE = 50;
	
	private Collection<Drawable> hexes;
	
	
	public HexagonalPanel (Dimension size, DrawablesRegister dr) {
		
		super();
		hexes = dr.getHexes();
		initialise(size);
		
	}

	
	private void initialise(Dimension d) {

		this.setPreferredSize(d);
		this.setBackground(Color.BLACK);
		
	}
	
	
	@Override
	public void paint (Graphics g) {
		
		super.paint(g);
		
	    Graphics2D g2 = (Graphics2D)g;
	    RenderingHints rh = new RenderingHints(
	             RenderingHints.KEY_TEXT_ANTIALIASING,
	             RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
	    g2.setRenderingHints(rh);

		for (Drawable h : hexes) {
			
			Polygon p = h.polygon(SCALE);
			g2.setColor(h.colour());
			g2.fillPolygon(p);
			g2.setColor(Color.BLACK); // outline
			g2.drawPolygon(p);
			
		}
		
	}
	
	
}
