package chap7;

public class FighterTest {

	public static void main(String[] args) {
		Fighter f = new Fighter();
		
		if(f instanceof Unit) {
			System.out.println("f�� Unit�� �ڼ��Դϴ�");
		}
		if(f instanceof Object) {
			System.out.println("f�� Object�� �ڼ�");
		}
		if(f instanceof Fightable) {
			System.out.println("f�� Fightable�������̽��� ����");
		}
		if(f instanceof Movable) {
			System.out.println("f�� Movable �������̽��� ����");
		}
		if(f instanceof Attackable) {
			System.out.println("f�� Attackable �������̽��� ����");
		}
		
	}

}
