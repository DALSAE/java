package Homework;

import java.util.Scanner;

public class Four {

	public static void main(String[] args) {
		//������ ������ �Է¹޾� ������ ������ ���� �Ǽ��ɾ��� ���
		//������ 7,8���� ��� ������ 8%, ������ 5,6���ΰ�� ������ 12%
		
		Scanner sc = new Scanner(System.in);
		String level;
		int money=0, tax=0, real=0;
		
		System.out.print("���� : ");  //�Է¹��� ���� ���ڸ� ��� "����"���·� �ٷ� �������?
		level = sc.nextLine();  //���⼭ ���¸� �����ؼ� �Է��� �� �ִ� ����� ����
		//System.out.println(level + "��");		  //�� �Է��ϴ� ����� 0�� �̷��� �Է��ؾ߸� �ϴ°�? 
		
		System.out.print("���� : ");
		money = Integer.parseInt(sc.nextLine());
		
		 if ((level.equals("5��")==true)||(level.equals("6��")==true)) {
			tax = 12; //int���¿��� % ���� �� ����
			real = (int)(money * 0.88);//0.12�� �Ǽ��ϱ� (int)�ٿ��� ���������� �ٲ�! ÷�� �� �ȵƳĤѤ�
			//���������� �ٲ� �� (int)�տ� ���̰� ���Ŀ��� ��ü ()��ȣ ���ֱ�!! 
			//�� ����� �����ȵǳ�? �ٵ�,., �� ����� ������ .0���·� ������ݾ�. ��� ���ô� ������ �� �������µ�..
			System.out.println("�Ǽ��ɾ�(����" +tax+ "%����) : " + real);
		}
		 else if ((level.equals("7��")==true)||(level.equals("8��")==true)) {
				tax = 8; 
				real = (int)(money * 0.92);
				System.out.println("�Ǽ��ɾ�(����" +tax+ "%����) : " + real);
			}
		
	}

}
