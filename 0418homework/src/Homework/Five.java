package Homework;

import java.util.Scanner;

public class Five {

	public static void main(String[] args) {
		//��Ʈ���� ������ ���� ���� ���Խð��� �Է¹޾� ���� ������ �ݾ��� ���
		//��Ʈ�� �ð��뺰�� �������� �ٸ��� ����.
		
		Scanner sc = new Scanner(System.in);
		int time=0;
		int things=0, sale=0;
		
		System.out.print("���� �ð� : "); // time�� ��ö�� �Է¹޾ƾ��ϴµ� �����ΰ� ���ڿ��ΰ�.. 
		time = Integer.parseInt(sc.nextLine());
		
		System.out.printf("�� ���Աݾ� : ");
		things = Integer.parseInt(sc.nextLine());
		
		if (time<12) //�ð� �������ķ� �������ϳ�,,? �� Ķ���� �Լ���� ������ �ϴµ�,, 
			System.out.print("���� ���� �ݾ� : "+(int)(things*0.95));
											//format = new SimpleDateFormat("hh:mm:ss a");
		else if (time>=12)
		System.out.println("���� ���� �ݾ� : "+(int)(things*0.975)); 		
	}

}
//1. Ÿ���Լ��� ���ڿ��� ����. 10�� ���·� �Է���. �������� 12�� ���� ������ �� ><������ ��ȣ�� ���ڿ��� ���ȵǼ�����
//�������� Ÿ���Լ��� �������·� �ٲ㵵 >12 �´� 10�� �� �� ���ڴ� 12�� ������. 
//2. Ÿ���Լ��� ���ڷ� �����ؼ� �׳� ���ڷθ� �Է¹����� �Ի� �Ǵµ� ��� �� �Ф�.. 

//���� �Ȱ��� ���� �ʿ� ���� �׳� ���ڸ� �°��ϸ� �ȴ� �Ф� 