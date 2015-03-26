package main.model;

public enum SEASON {
	
	SPRING,
	SUMMER,
	AUTUMN,
	WINTER;

	
	public static SEASON advance(SEASON s) {

		switch (s) {
		
		case SPRING: return SUMMER;

		case SUMMER: return AUTUMN;
			
		case AUTUMN: return WINTER;
			
		case WINTER: return SPRING;
			
		default:
			throw new RuntimeException("Unknown Season '"+s+"'");
		}
		
	}
	
	
}
