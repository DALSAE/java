package exam;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayex2 {

	public static void main(String[] args) {
		// ���� ���� �Է¹޾Ƽ� �迭�� �� ���ϱ�
		
		Scanner sc = new Scanner(System.in);
		int [] a= new int[10];
		int sum=0;
		 
		
	
		for(int i=0; i<a.length; i++) {
			System.out.println("���� �Է� : ");
			a[i]=Integer.parseInt(sc.nextLine());
						
		}
		for(int i=0; i<a.length; i++) {
		sum= sum + a[i]; //�� �����ϴ� �� 
		}
		
		System.out.println(sum);
		System.out.println(Arrays.toString(a));//�̹� ������� �޼ҵ�.
		//�迭 ��� �� ���
		

	}

}
