package chp03;

import java.util.Scanner;

public class ����ǽ� {

	public static void main(String[] args) {
		//���̸� �Է¹޾Ƽ� 20���� �������� �������� �̼��������� ����ϴ� ���α׷� 
		//�׸��� �Է� ���̰� Ȧ������ ¦������ ��� 

		Scanner n = new Scanner(System.in); // ctrl + shift + o �ʼ�!!! import �ڵ����� ���ִ� ��
		int age=0;
		
		System.out.print("���̸� �Է��Ͻÿ�. ");
		age = Integer.parseInt(n.nextLine());
		
		if (age >=20) {
			System.out.println("����� �����Դϴ�. ");
			}
		else { System.out.println("����� �̼������Դϴ�. ");}
					
		if (age % 2 == 0)
		System.out.println("�Է��� ���ڴ� ¦���Դϴ�. ");
		else {System.out.println("�Է��� ���ڴ� Ȧ���Դϴ�. ");}
	}

}
