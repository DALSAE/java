package homework;

public class Socket {
	
	String color;
	int number;
	String shape;
	boolean power;
	
	Socket(String color, int number, String shape){
		this.color = color;
		this.number = number;
		this.shape = shape;
	}
	
	Socket(){}
	
	void power(){			
		power = !power;		
	} 
}
