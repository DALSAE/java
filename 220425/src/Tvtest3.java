
public class Tvtest3 {

	public static void main(String[] args) {

		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1�� channel���� " +t1.channel+"�Դϴ�. ");
		System.out.println("t2�� channel���� " +t2.channel+"�Դϴ�. ");
		
		t1 = t2;
		t1.channel = 7;
		System.out.println("t1�� channel���� 7�� �����Ͽ����ϴ�. ");
		

		System.out.println("t1�� channel���� " +t1.channel+"�Դϴ�. ");
		System.out.println("t2�� channel���� " +t2.channel+"�Դϴ�. ");
		
		System.out.println(t2); //���� ��ü�� ����Ŵ
		System.out.println(t1); //��ü �ϳ��� ���������� �ΰ��� ��.
		
		t2.channelUp();
		System.out.println("t1�� channel���� " +t1.channel+"�Դϴ�. ");
		System.out.println("t2�� channel���� " +t2.channel+"�Դϴ�. ");
		
	}

}
