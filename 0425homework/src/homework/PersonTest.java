package homework;

import java.util.Scanner;

public class PersonTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person[] p = new Person[3]; //�迭�� ������ �� ��ü ���� ������

		for (int i = 0; i < p.length; i++) {
			p[i]=new Person(); // ��ü ���� ����!!!!!!!!!!!!!!!!!!!!!!
			
			System.out.print("�̸��� �Է��Ͻÿ� : ");
			p[i].name = sc.nextLine();
			System.out.print("��ȭ��ȣ�� �Է��Ͻÿ� : ");
			p[i].phoneNumber = sc.nextLine();
			System.out.print("��������� �Է��Ͻÿ� : ");
			p[i].birth = sc.nextLine();
			
			System.out.println();
			                                                                                                        
		}
		for (int i = 0; i < p.length; i++) {
			if(p[i].birth.equals("")) { //������ ����,, ������!!! 
				System.out.printf("�̸�: %s%n��ȭ��ȣ: %s%n",p[i].name,p[i].phoneNumber);
				System.out.println();
			}
			else p[i].showPerson();
				System.out.println();
			
		}

		
	}

}
