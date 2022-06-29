package chapter09_1;

public class CardEx1 {

	public static void main(String[] args) throws Exception {
		Card c1 = new Card("HEART",1);
		Card c2 = Card.class.newInstance();
		
	Class cObj = c1.getClass();
	
	System.out.println(c1);
	System.out.println(c2);
	System.out.println(cObj.getName());
	System.out.println(cObj.toGenericString());
	System.out.println(cObj.toString());
	}

}
