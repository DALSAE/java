package chapter06;

public class Cardtest {

	public static void main(String[] args) {
		
		System.out.println(Card.width); //Ŭ���� ������ ��üȭ ���� ��� ����
		System.out.println(Card.height);
		
		Card c1 = new Card();//�ν��Ͻ�ȭ �� ��. ��üȭ ����
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
		
		System.out.println(c1.width); //����������(=Ŭ���� ����,static����) c2���� ���ٲٸ� 
		System.out.println(Card.height);//width height �� �� �ٲ�. 
		//�׷��� �� ������ Ŭ�����̸�.�����̸����� ���°� ����. 

	}

}
