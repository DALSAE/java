package Chapter1;

import java.util.Scanner;

public class Exam6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int grade = 0;
		int mph = 0;
		int hour = 40;
		double total = 0;
		
		System.out.print("����(5,6,7,8) : ");
		grade =  Integer.parseInt(sc.nextLine());
		System.out.print("�ٹ��ð� : ");
		hour = Integer.parseInt(sc.nextLine());
		
		//�ñް���
		if (grade==5||grade==6) {
			mph=20000;}
		else if(grade==7||grade==8) {
			mph=15000;
		}
		
		//�ٹ��ð� üũ�ؼ� 40�ð� �����̸� 40�ð����� ����
		if(hour < 40) {
			hour = 40;
		}
		
		//�޿����
		total = mph*40 + (1.5*mph*(hour-40)); //hour�� 40�ð����� �����Ǿ� 40-40=0 �Ǽ� ��ꤤ��
		
		System.out.println("�� �޿� : "+Math.round(total));
		

	}

}
