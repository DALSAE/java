package chapt7;

public class Tank extends GroundUnit implements Repairable {
	Tank(){
		super(150);
		hitpoint = MAX_HP;
	}
	public String toString() {
		return "Tank";
	}
}
