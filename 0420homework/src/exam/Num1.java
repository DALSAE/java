package exam;

import java.util.Scanner;

public class Num1 {

	public static void main(String[] args) {
		//�ϳ��� ���� �Է¹޾� ���ں��� 1������ ���� ���Ͽ� ��� for,while do while
		
		Scanner sc = new Scanner(System.in);
		int num=0;
		int sum = 0;
		System.out.print("���ڸ� �Է��Ͻÿ� : ");
		num = Integer.parseInt(sc.nextLine());
		
		for (int i=num; i>=1; i--) {
			sum = sum+i;			
		}
		System.out.println(sum); //�� ��� ������ for���� ������ ���� �ȵ�!! for���� ��ü�� �ݺ����̶� ��µ� �ݺ���.
	}

}
