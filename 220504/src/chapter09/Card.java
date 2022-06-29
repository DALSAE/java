package chapter09;

public class Card {
	String kind;
	int number;

	Card() {
		this("SPADE", 1);
	}

	public Card(String kind, int number) {
		super();
		this.kind = kind;
		this.number = number;
	}

	@Override
	public String toString() { // object의 메서드 재정의. 출력 포맷을 바꿀 수 있음.
		return kind + ":" + number;
	}

}
