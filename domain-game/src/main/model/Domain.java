package main.model;

import java.awt.Point;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.Set;

import main.model.domain.Army;
import main.model.domain.TRADEABLE;
import main.model.domain.Traversable;
import main.presenter.Presentable;
import main.presenter.HexTile;
import main.presenter.TILE_TYPE;

public abstract class Domain implements Presentable, Traversable, Observer {
	
	private String name;
	private HexTile hex;
	private Point point;
	private Map<TRADEABLE, Integer> goodsStore;
	private Set<Army> armies;
	private int prestige;
	private int fortification;
	
	private int actionsLeft;
	private int importsLeft;
	private int exportsLeft;
	
	private Domain neighbour_NE;
	private Domain neighbour_E;
	private Domain neighbour_SE;
	private Domain neighbour_SW;
	private Domain neighbour_W;
	private Domain neighbour_NW;
	
	
	public Domain (Point p, String name) {
		
		this.point = p;
		this.name = name;
		this.goodsStore = new EnumMap<TRADEABLE, Integer>(TRADEABLE.class);
		this.armies = new HashSet<Army>();
		
		initialise(p);
		
	}
	
	
	private void initialise (Point p) {
		
		hex = new HexTile(this);
		
		for (TRADEABLE t : TRADEABLE.values()) {
			goodsStore.put(t, 0);
		}
		
		prestige = 0;
		fortification = 0;
		actionsLeft = 0;
		importsLeft = 0;
		exportsLeft = 0;
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
	
	
	public int fortification() {
		
		return fortification;
		
	}
	
	
	public void fortify() {
		
		fortification++;
		
	}
	
	
	
	@Override
	public boolean isSamePlaceAs(Traversable place) {

		return location().equals(place.location());
		
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
		reply.append("Fortification: " + fortification);
		reply.append("<br>");
		reply.append("<u>Resources:</u>");
		reply.append("<br>");
		reply.append(goodsStoreToTable());
		reply.append("<u>Left to do this turn:</u>");
		reply.append("<br>");
		reply.append("Actions: " + actionsLeft);
		reply.append("<br>");
		reply.append("Exports: " + exportsLeft);
		reply.append("<br>");
		reply.append("Imports: " + importsLeft);

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


	public void bindNeighbours(Collection<Domain> domains) {
		
		int x = location().x;
		int y = location().y;
		neighbour_NE = find(domains, x+1, y-1);
		neighbour_E = find(domains, x+1, y);
		neighbour_SE = find(domains, x+1, y+1);
		neighbour_SW = find(domains, x, y+1);
		neighbour_W = find(domains, x-1, y);
		neighbour_NW = find(domains, x, y-1);

	}
	
	
	private Domain find (Collection<Domain> domains, int x, int y) {
		
		for (Domain d : domains) {
			
			if (d.location().x == x && d.location().y == y) {
				
				return d;
				
			}
			
		}
		
		return null;
		
	}
	
	
	public void placeArmy(Army army) {
		
		armies.add(army);
		
	}

	
	public int unitCount() {
		
		return armies.size();
		
	}
	
	
	public int friendlyUnitCount() {

		int reply = 0;
		
		for (Army a : armies) {
			
			if (a.isFrom(this)) {
				
				reply++;
				
			}
			
		}
		
		return reply;
		
	}
	
	
	@Override
	public void moveNorthEast (Army army) {
		
		if (neighbour_NE != null && armies.contains(army)) {
			if (army.canTraverse(neighbour_NE)) {
				armies.remove(army);
				neighbour_NE.accept(army);
			}
		}
		
	}


	@Override
	public void moveEast (Army army) {
		
		if (neighbour_E != null && armies.contains(army)) {
			if (army.canTraverse(neighbour_E)) {
				armies.remove(army);
				neighbour_E.accept(army);
			}
		}
		
	}
	
	
	@Override
	public void moveSouthEast (Army army) {
		
		if (neighbour_SE != null && armies.contains(army)) {
			if (army.canTraverse(neighbour_SE)) {
				armies.remove(army);
				neighbour_SE.accept(army);
			}
		}
		
	}
	
	
	@Override
	public void moveSouthWest (Army army) {
		
		if (neighbour_SW != null && armies.contains(army)) {
			if (army.canTraverse(neighbour_SW)) {
				armies.remove(army);
				neighbour_SW.accept(army);
			}
		}
		
	}
	
	
	@Override
	public void moveWest (Army army) {
		
		if (neighbour_W != null && armies.contains(army)) {
			if (army.canTraverse(neighbour_W)) {
				armies.remove(army);
				neighbour_W.accept(army);
			}
		}
		
	}
	
	
	@Override
	public void moveNorthWest (Army army) {
		
		if (neighbour_NW != null && armies.contains(army)) {
			if (army.canTraverse(neighbour_NW)) {
				armies.remove(army);
				neighbour_NW.accept(army);
			}
		}
		
	}
	
	
	private void accept(Army army) {
		
		army.setLocation(this);
		armies.add(army);
		
	}
	
	
	@Override
	public void update(Observable o, Object arg) {
		
		// This is the 'turn' update - the arg will be a model.domain.SEASON
		//SEASON s = (SEASON) arg;
		this.actionsLeft = 1;
		this.importsLeft = 1;
		this.exportsLeft = 1;
		
	}

}
