package exam;

import java.util.Scanner;

public class Num8 {

	public static void main(String[] args) {
		//���� �Է¹޾� �� ���� �ش� ���� ���
		//������ ���·� ���

		Scanner sc = new Scanner(System.in);
		int month = 0;
		
		System.out.println("===========================");
		System.out.println("���� �����ϴ� ����? (����0) : ");
		month = Integer.parseInt(sc.nextLine());
		System.out.println("===========================");
		
		System.out.println("***** "+month+"�� *****");
		
		if(month>=3 && month<=5) {
			System.out.println(month+"���� ���� �ش��մϴ�."); 
		}
		
		
	}

}
