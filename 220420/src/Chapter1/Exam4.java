package Chapter1;

import java.util.Scanner;

public class Exam4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int grade = 0;
		int money= 0;
		final double RAT1 = 0.08, RAT2 = 0.12;  //��� ���� �빮�ڷ� ���!!!
		double real = 0.0;
		
		
		System.out.print("����(5,6,7,8) : ");
		grade =  Integer.parseInt(sc.nextLine());
		System.out.print("���� : ");
		money =  Integer.parseInt(sc.nextLine());
		
		if(grade==5 || grade==6) {
		real = money - money*RAT2;}
		else if (grade==7 || grade==8) {
			real = money - money*RAT1;}
		else System.out.println("error");
		
		//System.out.println("�Ǽ��ɾ� : " + Math.round(real)); //���Ǽ��� �Ʒ��� ���ִ� ��
		System.out.printf("�Ǽ��ɾ�(����");
	}
		//%��  ����Ϸ��� "%%"�� �Է��ؾ���. 
}
