package chp03;

import java.util.Scanner;

public class Var3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//ctrl shift o �ڵ� ����Ʈ �ǰ��ϴ°�. ��ĳ�� ���� �ٷ� �ؾ���.
		
		String name = "";// ���ڿ����� �����ϱ� ���� ������ Ÿ�� ���� ����Ʈ �ʿ� ��
		int age = 0, age10 =0; 
		double h = 0.0; 
		
		System.out.print("�̸��� �Է��Ͻÿ�: ");
		name = sc.nextLine(); //��Ƽ���ļ� ���� ��??? ��Ʈ���̶� �̹� ���ڿ��̴ϱ�
		
		System.out.print("���̸� �Է��Ͻÿ�: ");
		age = Integer.parseInt(sc.nextLine());//���ڿ��̴� ��Ƽ�� �ؾ��� 
		//age�� int�̰�  sc�� string�̶� Ÿ���� �ٸ��ϱ� �ݵ�� ������ �Ľ���Ʈ �ؾ���
		
		System.out.print("Ű�� �Է��Ͻÿ�: ");
		h = Double.parseDouble(sc.nextLine());
		
		age10 = age + 10;
		
		//System.out.println(name + "��(��) 10�� �Ŀ� " +age10 + "�� �Դϴ�.");
		
		System.out.printf("%s��(��) 10�� �Ŀ� %d�� �Դϴ�. ", name, age10);
	}

}
