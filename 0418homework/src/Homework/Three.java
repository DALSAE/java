package Homework;

import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		// ������ �����̸鼭 ���� ����>=700�� ��� �Ǵ� ���� ���� ���� ����>=800 �� ��쿡��
		//"�װ� �¹��� ���� �ڰ� �������Դϴ�." ���
		
		Scanner sc = new Scanner(System.in);
		int toeic =0;
		String gender; //��Ʈ�� ���� �����ȴ��ߴµ� ����!!!! 
		
		System.out.print("������ �Է��Ͻÿ�(����/����): ");
		gender = sc.nextLine();
		
		System.out.print("���� ����: ");
		toeic = Integer.parseInt(sc.nextLine());
				
		 
		 if ((gender.equals("����")==true && toeic>=700)||(gender.equals("����")==true && toeic>=800))
			System.out.println("�װ� �¹��� ���� �ڰ� �������Դϴ�. ");
		
		else System.out.println("END");

	}

}
//���� ���� ���ڷ� 
//������ �ϳ��� 
//���ͳ� ã�ٰ� ���ο� �� ���. ���ڿ� ���ǿ� �ִ� ���. �ٵ� ���� ���� ������ �� ��� �߿� Ǫ�� ����� ���� �𸣰���.
//���ڿ�����.eqals("����")==ture �� �ƴϸ� false