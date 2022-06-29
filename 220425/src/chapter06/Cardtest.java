package chapter06;

public class Cardtest {

	public static void main(String[] args) {
		
		System.out.println(Card.width); //클래스 변수는 객체화 전에 출력 가능
		System.out.println(Card.height);
		
		Card c1 = new Card();//인스턴스화 한 것. 객체화 ㅇㅇ
		c1.kind = "heart";
		c1.number=7;
		System.out.println(c1.kind);
		System.out.println(c1.number);
		System.out.println(c1.width);
		System.out.println(c1.height);
		
		Card c2 = new Card();
		c2.kind = "spade";
		c2.number = 5;
		c2.width = 80;
		c2.height = 120;
		System.out.println(c2.kind);
		System.out.println(c2.number);
		System.out.println(c2.width);
		System.out.println(c2.height);
		
		System.out.println(c1.width); //공유변수라서(=클래스 변수,static붙인) c2에서 값바꾸면 
		System.out.println(Card.height);//width height 싹 다 바뀜. 
		//그래서 이 변수는 클래스이름.변수이름으로 쓰는게 맞음. 

	}

}
