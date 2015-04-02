package main.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.Collection;

import javax.swing.JPanel;

import main.model.Model;
import main.presenter.Hex;

public class HexagonalPanel extends JPanel {

	private static final long serialVersionUID = 2875093917722096774L;
	private static int SCALE = 50;
	
	private Collection<Hex> hexes;
	
	
	public HexagonalPanel (Dimension size, Model model) {
		
		super();
		hexes = model.getHexes();
		initialise(size);
		
	}

	
	private void initialise(Dimension d) {

		this.setPreferredSize(d);
		this.setBackground(Color.BLACK);
		
	}
	
	
	@Override
	public void paint (Graphics g) {
		
		super.paint(g);
		
		for (Hex h : hexes) {
			
			Polygon p = h.polygon(SCALE);
			g.setColor(h.colour());
			g.fillPolygon(p);
			g.setColor(Color.BLACK); // outline
			g.drawPolygon(p);
			
		}
		
	}
	
	
}
