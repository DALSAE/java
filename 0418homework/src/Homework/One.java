package Homework;

import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		//���̿� ���� �Է¹ޱ�. ���� < 30�̰� ���� >= 3.5�� "��õ ����Դϴ�." �ƴϸ� "��õ ����� �ƴմϴ�."���
		
		Scanner sc = new Scanner(System.in); 
		int age = 0;
		double grade = 0.0;
		
		System.out.print("����: "); //�Է¹ޱ� ���� ����ϱ�! ���̸� ���� ���� ���� ���;� �Էµ� ��! 
		age = Integer.parseInt(sc.nextLine());
		
		System.out.print("����: ");
		grade = Double.parseDouble(sc.nextLine());
		
		if (age < 30 && grade >= 3.5) 
			System.out.println("��õ ����Դϴ�. ");
		else System.out.println("��õ ����� �ƴմϴ�. ");
		
	}

}
