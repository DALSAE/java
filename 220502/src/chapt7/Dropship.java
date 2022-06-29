package chapt7;

public class Dropship extends AirUnit implements Repairable {
	Dropship(){super(125);
	hitpoint = MAX_HP;
	}
	
	public String toString() {
		return "Dropship";
	}
}
