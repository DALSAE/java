package chp03;

import java.util.Scanner;

public class Var2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System. in); //�ܺο��� �Է¹��� �� ���� �� 
	
		String name=""; //���ڿ� ��� ��
		int kor=0, eng=0, mat=0;
		int total; 
		double avg; 
		
		System.out.print("�̸� => " +name);
		name = sc.nextLine(); //��Ʈ���� ���� �ǹ�. �Է¹��� ���ڿ� 
		System.out.print("�������� ==> ");
		kor = Integer.parseInt(sc.nextLine()); //���ڿ��� ���ڿ��� ��ȯ�ϴ� �� 
		System.out.print("�������� ==> ");
		eng = Integer.parseInt(sc.nextLine());
		System.out.print("�������� ==> ");
		mat = Integer.parseInt(sc.nextLine());
		
		total = kor + eng + mat;
		avg = total/3.0;
		System.out.println("����: " +total);
		System.out.println("���: " +avg);	
	}

}
