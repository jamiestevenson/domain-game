package test.model.combat;

import static org.junit.Assert.*;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

import main.model.County;
import main.model.Domain;
import main.model.DomainFactory;
import main.model.domain.Army;

import org.junit.Test;

public class ArmyMovementTest {

	@Test
	public void armyPosition_Home_test() {
		County c = new DomainFactory().makeCounty(new Point(0,0));
		c.raiseArmy();
		int a = c.friendlyUnitCount();
		assertEquals(1, a);
	}
	
	@Test
	public void armyPosition_NowheretoGo_test() {
		County c1 = new DomainFactory().makeCounty(new Point(0,0));
		c1.raiseArmy();
		Army ofC1 = c1.army();
		ofC1.moveNorthEast();
		int a = c1.friendlyUnitCount();
		assertEquals(1, a);
		ofC1.moveEast();
		a = c1.friendlyUnitCount();
		assertEquals(1, a);
		ofC1.moveSouthEast();
		a = c1.friendlyUnitCount();
		assertEquals(1, a);
		ofC1.moveSouthWest();
		a = c1.friendlyUnitCount();
		assertEquals(1, a);
		ofC1.moveWest();
		a = c1.friendlyUnitCount();
		assertEquals(1, a);
		ofC1.moveNorthWest();
		a = c1.friendlyUnitCount();
		assertEquals(1, a);
	}
	
	
	@Test
	public void armyPosition_NorthEast_test() {
		County start = new DomainFactory().makeCounty(new Point(1,1));
		County neast = new DomainFactory().makeCounty(new Point(2,0));
		List<Domain> d = new ArrayList<Domain>();
		d.add(neast);
		start.bindNeighbours(d);
		start.raiseArmy();
		Army ofC1 = start.army();
		ofC1.moveNorthEast();
		int a = start.friendlyUnitCount();
		assertEquals(0, a);
		int b = neast.unitCount();
		assertEquals(1, b);
	}
	
	
	@Test
	public void armyPosition_MoveEast_test() {
		County start = new DomainFactory().makeCounty(new Point(1,1));
		County east = new DomainFactory().makeCounty(new Point(2,1));
		List<Domain> d = new ArrayList<Domain>();
		d.add(east);
		start.bindNeighbours(d);
		start.raiseArmy();
		Army ofC1 = start.army();
		ofC1.moveEast();
		int a = start.friendlyUnitCount();
		assertEquals(0, a);
		int b = east.unitCount();
		assertEquals(1, b);
	}
	
	
	@Test
	public void armyPosition_MoveSouthEast_test() {
		County start = new DomainFactory().makeCounty(new Point(1,1));
		County seast = new DomainFactory().makeCounty(new Point(2,2));
		List<Domain> d = new ArrayList<Domain>();
		d.add(seast);
		start.bindNeighbours(d);
		start.raiseArmy();
		Army ofC1 = start.army();
		ofC1.moveSouthEast();
		int a = start.friendlyUnitCount();
		assertEquals(0, a);
		int b = seast.unitCount();
		assertEquals(1, b);
	}
	
	
	@Test
	public void armyPosition_MoveSouthWest_test() {
		County start = new DomainFactory().makeCounty(new Point(1,1));
		County swest = new DomainFactory().makeCounty(new Point(1,2));
		List<Domain> d = new ArrayList<Domain>();
		d.add(swest);
		start.bindNeighbours(d);
		start.raiseArmy();
		Army ofC1 = start.army();
		ofC1.moveSouthWest();
		int a = start.friendlyUnitCount();
		assertEquals(0, a);
		int b = swest.unitCount();
		assertEquals(1, b);
	}
	
	
	@Test
	public void armyPosition_MoveWest_test() {
		County start = new DomainFactory().makeCounty(new Point(1,1));
		County west = new DomainFactory().makeCounty(new Point(0,1));
		List<Domain> d = new ArrayList<Domain>();
		d.add(west);
		start.bindNeighbours(d);
		start.raiseArmy();
		Army ofC1 = start.army();
		ofC1.moveWest();
		int a = start.friendlyUnitCount();
		assertEquals(0, a);
		int b = west.unitCount();
		assertEquals(1, b);
	}

	
	@Test
	public void armyPosition_MoveNorthWest_test() {
		County start = new DomainFactory().makeCounty(new Point(1,1));
		County west = new DomainFactory().makeCounty(new Point(1,0));
		List<Domain> d = new ArrayList<Domain>();
		d.add(west);
		start.bindNeighbours(d);
		start.raiseArmy();
		Army ofC1 = start.army();
		ofC1.moveNorthWest();
		int a = start.friendlyUnitCount();
		assertEquals(0, a);
		int b = west.unitCount();
		assertEquals(1, b);
	}
}
