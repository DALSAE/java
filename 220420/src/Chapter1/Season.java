package Chapter1;

import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
		// 1���� 12���� ���ڸ� �Է¹޾Ƽ� �����������ܿ� ����ϴ� ���� ���
		
		Scanner sc = new Scanner(System.in);
		int month=0;
		String result=" ";
		
		System.out.print("���� �Է��Ͻÿ�(1~12) : ");
		month = Integer.parseInt(sc.nextLine());
		
		
		/*if (month>=3 && month<=5) {
			System.out.println("���Դϴ�. ");
		}else if (month>=6 && month<=8) {
			System.out.println("�����Դϴ�. ");
		}else if (month>=9 && month<=10) {
			System.out.println("�����Դϴ�. ");
		}else if ((month>=11 && month<=12) || (month>=1 && month<=2)) {
			System.out.println("�ܿ��Դϴ�. ");
		}
		else System.out.println("�߸� �Է��ϼ̽��ϴ�. ");
		//else System.out.println("�ܿ��Դϴ�. ");*/
		
		/*if (month>=3 && month<=5) {  //if~else if������ �� �����̴ϱ� ���ȣ�� �ٿ��� �ٴڵ��� ���� �����鿩~!~!
			result="��";
		}else if (month>=6 && month<=8) {
			result = "����";
		}else if (month>=9 && month<=11) {
			result = "����";
		}else if (month==12|| (month>=1 && month<=2)) {
			result = "�ܿ�";
		}else result = "�߸� �Է��ϼ̽��ϴ�. ";*/
		
		/* if(month==3||month==4||month==5) {
			result = "��";
		}else if(month==6||month==7||month==8) {
			result = "����";
		}else if(month==9||month==10||month==11) {
			result = "����";
		}else if(month==12||month==1||month==2) {
			result = "�ܿ�";
		}else result = "�߸� �Է��ϼ̽��ϴ�. ";
		//switch������ if���� ������ ���� ������. ���� �� �������� ��� switch������ �� �����. 
	
		System.out.println(result);	*/
		
		/* switch(month) {
			case 1: result = "�ܿ�"; break;
			case 2: result = "�ܿ�"; break;
			case 12: result = "�ܿ�"; break;
			case 3: result = "��"; break;
			case 4: result = "��"; break;
			case 5: result = "��"; break;
			case 6: result = "����"; break;
			case 7: result = "����"; break;
			case 8: result = "����"; break;
			case 9: result = "����"; break; 
			case 10: result = "����"; break;
			case 11: result = "����"; break;
			default : result = "�߸��� �Է�"; */
		switch(month) {
		case 1: case 2: case 12: 
			result = "�ܿ�"; 
			break;
		case 3: case 4: case 5: 
			result = "��"; 
			break;
		case 6: case 7: case 8: 
			result = "����";
			break;
		case 9: case 10: case 11: 
			result = "����"; 
			break;
		default : 
			result = "�߸��� �Է�";	
		}
		System.out.println(result);
	}
		

}
