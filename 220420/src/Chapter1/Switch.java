package Chapter1;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		//�ֹι�ȣ �Է¹޾Ƽ� �����Ǵ��ϱ�
		
		Scanner sc = new Scanner(System.in);
		String id="";	
		char gender = ' '; //�ϳ� �̾Ƴ� ���� ������ ����
		String result=" ";
		
		
		System.out.println("�ֹε�Ϲ�ȣ�� �Է��Ͻÿ�.(000000-0000000) :");
		id = sc.nextLine();
		gender = id.charAt(7); //���ڿ����� �ϳ��� ���� �̾Ƴ���. ���� = ���ڿ�����.charAt(���ڹ�°��). 
		
		switch(gender) {
			case '2': case '4':  //���� �ϳ� �̾ƿ� �Ŷ� ' '�ȿ� ���ڸ� �Է��ؾ���!!!! 
				switch(gender) {
				case 2:
					System.out.println("����� 2000�� ���� ��� �����Դϴ�. "); break;
				case 4:
					System.out.println("����� 2000�� ���� ��� �����Դϴ�. "); break;	
					}
			
				
			case '1': case '3':
				switch(gender) {
				case 1:
					System.out.println("����� 2000�� ���� ��� �����Դϴ�. ");break;
				case 3:
					System.out.println("����� 2000�� ���� ��� �����Դϴ�. ");break;
				}
						default:
			System.out.println("��ȿ���� �ʴ� �ֹι�ȣ�Դϴ�. ");
		}
		
		
		//��ȣ���� 8��°���� 2,4�� ���� 1,3�̸� ���� ���
		
	}

}
