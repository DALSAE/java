package step2;

import java.util.Scanner;

public class PhoneBookVer02_1 {
	static Scanner sc = new Scanner(System.in); //�������� ��밡���� 
	
	public static void main(String[] args) { //�޼ҵ�1. �޼ҵ�3��¥�� Ŭ����
		int choice = 0;
		
		while(true) {
			showMenu();  //�޼ҵ�2.
			choice = Integer.parseInt(sc.nextLine());
			
			switch(choice) { //������!!!! ���� ������ �ȵ�. ������ ������ �� �͸� ����.
			case 1:			//�������� �� �� �� �����Ϸ��� �迭 �ʿ�
				inputData();  //�޼ҵ�3.
				break; //�ݺ��� ���������� ��. 
				//��ǲ������ �� ������ case2�� ���� �ʰ�(����ġ�� ��������) ������ 
				//�ٽ� ���Ϸ� �ͼ� �޴����� ��
			
			case 2:
				System.out.println("���α׷� ����");
				return;
			}//�������� �ڵ��� ���ؼ��� ���ο��� � ���α׷����� �� ���̵��� ����,, =���ȭ
			
		}
		
	}
	
	static void inputData() {  //�ٸ� �޼ҵ� �ۼ�
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("��ȭ��ȣ : ");
		String phoneNum = sc.nextLine();
		System.out.print("���� : ");
		String birth = sc.nextLine();
		
		Person p = new Person(name, phoneNum, birth);
		p.showPhoneinfo();
	}
	
	static void showMenu() {
		System.out.println("�����ϼ���");
		System.out.println("1. ������ �Է�");
		System.out.println("2. ���α׷� ����");
		System.out.print("���� : ");
	}
}
