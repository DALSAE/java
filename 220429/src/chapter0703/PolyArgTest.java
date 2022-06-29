package chapter0703;

public class PolyArgTest {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Audio());
		b.buy(new Piano());
		
		System.out.println("현재 잔액 : "+b.money);
		System.out.println("현재 보너스포인트 : "+b.bonusPoint);
		
		b.summary();
	}

}
