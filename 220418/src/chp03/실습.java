package chp03;

import java.util.Scanner;

public class �ǽ� {

	public static void main(String[] args) {
		//������ �Է¹޾Ƽ� 100~90���� A, 89~80�� B, 79~70�� C, 69~60�� D, 59���ʹ� F������ ������ ���
		
		Scanner num = new Scanner(System.in); 
		String name;
		int point;
		
		System.out.print("������� �Է��Ͻÿ�. ");
		name = num.nextLine();
		
		System.out.print("������ �Է��Ͻÿ�. ");
		point = Integer.parseInt(num.nextLine());
		char grade= ' ', opt = '0';
		
		//point <=100 && point >=90 �̶�� ���� �������� ����. �� ���ŷӱ� ��. 
		//if else�� ���� ���� �̹� �ɷ��� �����ϱ� point>=80�� �ص� ����.
		
		/*if (point>=90) {System.out.println("����: A "); 
		}
		else if (point>=80) { System.out.println("����: B ");
		}
		else if (point>=70) { System.out.println("����: C ");
		}
		else if (point>=60) { System.out.println("����: D ");
		}
		else { System.out.println("����: F "); */    			//���� �� �͵� ����
		
		if (point>=90) { grade= 'A'; 
			if(point>=98) {
				opt = '+';}
			else if (point < 94) {
				opt = '-';}
		}
		else if (point>=80) { grade= 'B'; 
			if (point >= 88) {
				opt = '+'; }
			else if (point < 84) {
				opt = '-';}
		}
		else if (point>=70) { grade= 'C'; 
			if (point >= 78) {
			opt = '+'; }
			else if (point < 74) {
			opt = '-';}
		}
		else if (point>=60){ grade= 'D'; 
			if (point >= 68) {
				opt = '+'; }
			else if (point < 64) {
				opt = '-';}
		}
		else { grade= 'F'; 
		}
		
		System.out.println("����: "+grade + opt); //�´� ����. ���� �ͼ�������. 
		
		}
	}






