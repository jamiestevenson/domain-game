package main.model.domain;



public interface Army {

	boolean canTraverse (Traversable neighbour);

	void setLocation (Traversable domain);

	boolean isFrom (Traversable domain);

	void moveNorthEast();

	void moveEast();
	
	void moveSouthEast();
	
	void moveSouthWest();
		
	void moveWest();
	
	void moveNorthWest();
	
}
