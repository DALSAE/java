package chapter09;

public class EqualsEx2 {

	public static void main(String[] args) {
		Person p1 = new Person(8011081111222L);
		Person p2 = new Person(8011081111222L);
		
		if(p1.equals(p2)) {//�޼ҵ� EQUALS�� �������̵��ؼ� �ּҰ��� �ƴ� �Էµ� id���� ���ϰԵ�
			System.out.println("�����ϴ�");
		}else System.out.println("�ٸ��ϴ�");
		
		if(p1==p2) { //PersonŬ�������� �������̵� ���̴� p1.equals(p2)�� ���� �ǹ�
			System.out.println("�����ϴ�");
		}else System.out.println("�ٸ��ϴ�");
	}

}
