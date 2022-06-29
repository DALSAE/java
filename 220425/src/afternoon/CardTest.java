package afternoon;

public class CardTest {

	public static void main(String[] args) {
		Card c1 = new Card("spade", 7);
		
		//c1.kind = "heart";
		//c1.number = 7;
		
		Card c2 = new Card();
		Card c3 = new Card("heart", 6);
		
		System.out.println(c1.kind);
		System.out.println(c1.number);
	}

}
