package Chapter1;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age=0;
		double score=0.0;
		String result = "";/*����� ���� �����ؼ� ����ϰ� �����ϱ�*/
		
		//�Է�
		System.out.print("���� : ");
		age = Integer.parseInt(sc.nextLine());
		System.out.print("���� : ");
		score = Double.parseDouble(sc.nextLine());
		
		//ó��
		if(age<30 && score>=3.5) {
			result = "��õ���";
		}
		else {result = "��õ��� �ƴ�";
		}
		
		//���
		System.out.println(result);	
	}

}
