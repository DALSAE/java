package Chapter1;

import java.util.Scanner;

public class Class5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		char ch=' ';
		String result = " ";
		
		System.out.print("���� �ϳ��� �Է��Ͻÿ� : ");
		String input = sc.nextLine();
		ch = input.charAt(0);
		
		
		/*String temp = sc.nextLine(); //�ӱ⺻�� ������ �ڵ� ����ȯ �ȵ�. ���ڿ����� Ư�� ��ġ �ϳ��� �̾Ƽ� ���
		c = temp.charAt(0); //java���� ���ڴ� 0���� ����. �Է°����� 0��° ����϶�� ��.*/
		
		//�������� �������� ���
		/*if(ch>='0' && ch<='9') {
			System.out.println("�����Դϴ�. ");
		}
	
		if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z')) {
			System.out.println("�������Դϴ�. ");
		}		*/
		
		result = (ch>='0' && ch<='9') ? "����" : "����";
		System.out.println(result);
	}

}
