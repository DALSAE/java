package chp03;

import java.util.Scanner;

public class ���� {

	public static void main(String[] args) {
		// ���￡�� �λ���� 400km�Ÿ�. �ڵ��� �ִ� �ӵ� �Է� �޾� �������� �ɸ��� �ð� ���ϱ�
		//2�ð� �����̸� "High High Speed" 3�ð� �����̸� "High Speed" 4�ð� �̻��̸� "Good Speed" ���
		
		Scanner spe = new Scanner(System.in);
		int max;
		int tim; //220420������Ʈ chapter1��Ű���� Class1 Ŭ������ Ǯ�� ����. �ð��� ����� ����. 
		
		System.out.print("�ִ� �ӵ���? ");
		max = Integer.parseInt(spe.nextLine());
		
		tim = 400 / max;
		//System.out.println("�������� �ɸ��� �ð�: "+ tim + "�ð�");
		
		// �Ÿ�/�ӵ�*�ð�
		
		if (tim <=2 ) {
			System.out.println("High High Speed");
		}
		else if (tim <= 3) {
			System.out.println("High Speed");
		}
		else if (tim >=4) {
			System.out.println("Good Speed");
		}		
	}
}
