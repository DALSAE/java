package Homework;

import java.util.Scanner;

public class Three2 {

	public static void main(String[] args) {
		// ������ �����̸鼭 ���� ����>=700�� ��� �Ǵ� ���� ���� ���� ����>=800 �� ��쿡��
		//"�װ� �¹��� ���� �ڰ� �������Դϴ�." ���
		
		Scanner sc = new Scanner(System.in);
		String she;
		String he; //�ٵ� �̰� ������ �ƿ� �ٸ� ������ �ع����� ó�� �Է��� ������ �ѹ��� ������ϴµ� �ѷ� �����ݾ�
		int toeic=0;
		
		System.out.print("����: "); //�ٵ� ���⼭ �� �ϳ��� �޾Ƽ� �װ� �ڿ� ���ǿ��� ��/���� ������� 
		she = sc.nextLine();       // �Է¹����Ÿ� �� ������ ���ؾ��ϴµ� �װ� �������Ѱǰ�? 
		he = sc.nextLine();
		
		System.out.print("���� ����: ");
		toeic = Integer.parseInt(sc.nextLine());
		
		if (she==sc.nextLine() && toeic>=700)
			System.out.println("�װ� �¹��� ���� �ڰ� �������Դϴ�. ");
		
		

	}

}
