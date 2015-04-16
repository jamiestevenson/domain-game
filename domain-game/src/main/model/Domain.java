package main.model;

import java.awt.Point;
import java.util.EnumMap;
import java.util.Map;
import java.util.Set;

import main.presenter.Presentable;
import main.presenter.HexTile;
import main.presenter.TILE_TYPE;

public abstract class Domain implements Presentable {
	
	private String name;
	private HexTile hex;
	private Point point;
	private Map<TRADEABLE, Integer> goodsStore;
	private Set<Army> armies;
	private int prestige;
	
	
	public Domain (Point p, String name) {
		
		this.point = p;
		this.name = name;
		this.goodsStore = new EnumMap<TRADEABLE, Integer>(TRADEABLE.class);
		initialise(p);
		
	}
	
	
	private void initialise (Point p) {
		
		hex = new HexTile(this);
		
		for (TRADEABLE t : TRADEABLE.values()) {
			goodsStore.put(t, 0);
		}
		
		prestige = 0;
		
	}
	
	
	public int stock(TRADEABLE goodType) {

		return goodsStore.get(goodType);
		
	}
	
	
	protected void addTradeable (TRADEABLE goodType) {
		goodsStore.put(goodType, goodsStore.get(goodType)+1);
	}
	
	
	public HexTile getHex () {
		
		return hex;
		
	}

	
	public int prestige() {

		return prestige;
		
	}
	
	
	@Override
	public Point location() {

		return point;
		
	}

	
	@Override
	public String toHTML () {
		
		StringBuilder reply = new StringBuilder();
		reply.append("<html>");
		reply.append("<b>" + name + "</b> <i>("+category().toString()+")</i>");
		reply.append("<br>");
		reply.append("Location: (" + point.x + ", " + point.y + ")");
		reply.append("<br>");
		reply.append("Prestige: " + prestige);
		reply.append("<br>");
		reply.append("<u>Resources:</u>");
		reply.append("<br>");
		reply.append(goodsStoreToTable());

		return reply.toString();
	}
	
	
	private String goodsStoreToTable() {

		StringBuilder reply = new StringBuilder();
		reply.append("<table>");
		for(TRADEABLE t : goodsStore.keySet()) {
			reply.append("<tr>");
				reply.append("<td>");
					reply.append(t.toString());
				reply.append("</td>");
				reply.append("<td>");
					reply.append(goodsStore.get(t));
				reply.append("</td>");
			reply.append("</tr>");
		}
		reply.append("</table>");
		return reply.toString();
	}


	@Override
	public abstract TILE_TYPE category();




}
