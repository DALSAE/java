package Chapter1;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x=0, y=0;
		String result = "";
		
		//�Է�
		System.out.print("���� 1�� �Է��Ͻÿ� : ");
		x = Integer.parseInt(sc.nextLine());
		
		System.out.print("���� 2�� �Է��Ͻÿ� : ");
		y = Integer.parseInt(sc.nextLine());
		
		
		//ó��
		if ((x%2==0 && y%2==0)||(x%2==1 && y%2==1)) {
			result = "�� ���ڴ� ���� ¦�� �Ǵ� Ȧ���Դϴ�. ";	
		}
		else System.out.println("error");
		
		System.out.println(result);			
	}

}
