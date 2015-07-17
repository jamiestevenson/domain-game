package main.view;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Collection;

import javax.swing.JPanel;

import main.presenter.Drawable;
import main.presenter.DrawablesRegister;

	/**
	 * @author Jamie
	 *
	 * This panel is the 'map display' of hexes.
	 */

public class HexagonalPanel extends JPanel implements MouseListener {

	private static final long serialVersionUID = 2875093917722096774L;
	
	private static int BORDER = 20;
	private static int SCALE = 50;
	private static Color SEA = new Color(194, 223, 255); //http://www.computerhope.com/cgi-bin/htmlcolor.pl?c=C2DFFF
	private static Color SELECTION = Color.YELLOW;
	
	private int lastClickX;
	private int lastClickY;
	private DrawablesRegister draw;
	private Collection<Drawable> hexes;
	
	
	public HexagonalPanel (Dimension size, DrawablesRegister dr) {
		
		super();
		lastClickX = 0;
		lastClickY = 0;
		draw = dr;
		hexes = draw.getHexes();
		initialise(size);
		super.addMouseListener(this);
		
	}

	
	private void initialise(Dimension d) {

		this.setPreferredSize(d);
		this.setBackground(SEA);
		
	}
	
	
	@Override
	public void paint (Graphics g) {
		
		super.paint(g);
	    Graphics2D g2 = (Graphics2D) g;
	    g2.setRenderingHints(renderingHints());
	    g2.translate(BORDER, BORDER);
	    drawHexBodies(g2);
	    drawHexOutlines(g2);
	    
	}
	
	
	private void drawHexBodies (Graphics2D g) {
		
		for (Drawable h : hexes) {	
			Polygon p = h.polygon(SCALE);
			g.setColor(h.colour());
			g.fillPolygon(p);
			g.drawPolygon(p);
		}
		
	}
	
	
	private void drawHexOutlines (Graphics2D g) {
		
		g.setColor(Color.BLACK); // outline
		g.setStroke(new BasicStroke(1.0f));
		Polygon drawLast = null;
		
		for (Drawable h : hexes) {
			
			Polygon p = h.polygon(SCALE);
			if (p.contains(lastClickX, lastClickY)) {
				drawLast = p;
				draw.setLastSelectedDrawable(h);
			}
			g.drawPolygon(p);
		}
		
		if (drawLast != null) {
			g.setColor(SELECTION);
			g.setStroke(new BasicStroke(5.0f));
			g.drawPolygon(drawLast);
		}
		
	}
	
	
	private RenderingHints renderingHints () {
		
		RenderingHints hints =  new RenderingHints(
	             RenderingHints.KEY_TEXT_ANTIALIASING,
	             RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		
		hints.put(RenderingHints.KEY_RENDERING,
				 RenderingHints.VALUE_RENDER_QUALITY);
		
		hints.put(RenderingHints.KEY_DITHERING,
				 RenderingHints.VALUE_DITHER_ENABLE);
		
		
		hints.put(RenderingHints.KEY_STROKE_CONTROL,
				 RenderingHints.VALUE_STROKE_NORMALIZE);
		
		return hints;
	}
	
	
	// Mouse Events
	
	@Override
	public void mouseClicked(MouseEvent e) {
		lastClickX = e.getX();
		lastClickY = e.getY();
		this.repaint();
	}


	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
