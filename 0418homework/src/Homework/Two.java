package Homework;

import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
		//�� ���� ���� �Է¹޾� �� ���� ��� ¦���̰ų� ��� Ȧ���̸� "�� ���ڴ� ���� ¦�� �Ǵ� Ȧ���Դϴ�." ���

		Scanner sc = new Scanner(System.in);
		int num1=0, num2=0;
		
		System.out.print("ù��° ���ڸ� �Է��Ͻÿ�. ");
		num1 = Integer.parseInt(sc.nextLine());
		
		System.out.print("�ι�° ���ڸ� �Է��Ͻÿ�. ");
		num2 = Integer.parseInt(sc.nextLine());
		
		if ((num1%2==0 && num2%2==0)||(num1%2==1 && num2%2==1)) {
			System.out.println("�� ���ڴ� ���� ¦�� �Ǵ� Ȧ���Դϴ�. "); }
		
		else System.out.println("END");
		
		/*System.out.print("�� ���� ���ڸ� �Է��ϼ���. ");
		num1 = a.nextInt();
		num2 = a.nextInt(); 
		���ͳݿ� ���� ���� �ΰ� �ѹ��� �Է¹޴� ����̶�µ� if������ ����� �ȵ� ���� �ȹ���� �� �𸣰���*/
		
		}

}
