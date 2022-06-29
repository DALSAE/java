package chapter09_1;

public final class Card {
	String kind;
	int num;
	
	Card(){
		this("SPADE",1);
	}
	Card(String kind, int num){
		this.kind = kind;
		this.num = num;
	}
	@Override
	public String toString() {
		return kind + ":"+ num;
	}

}
