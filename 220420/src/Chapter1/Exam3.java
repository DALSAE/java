package Chapter1;

import java.util.Scanner;

public class Exam3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//char g = ' '; //string���ڿ��� �ϸ� ���� �ȹ���� ������. ��� �����ȿ��� �ϴ� ���
		int score = 0;
		String g = " "; //������ ���ڿ��� �Է�.�޸𸮿� ���ڿ� ����. ���� ���ڰ� �ƴ� ���ڿ��� �ּҰ��� ������. 
		
		System.out.print("����(����f ����m) : ");
		g = sc.nextLine(); 
		System.out.print("���ͼ��� : ");
		score = Integer.parseInt(sc.nextLine()); 
		
		if ((g.equals("f")&&score>=700)||(g.equals("m") && score>=800)) {
			System.out.println("�װ� �¹��� ���� �ڰ� �������Դϴ�. ");
		}//����.equals("")�� ������ �Ǻ�. 
		else {System.out.println("���� �Ұ�. "); }
		
		
		
		/*int g = 0; ���ڿ��� �Է¹޾Ƽ� �� ��. 
		
		
		System.out.print("����(����0 ����1) : ");
		//g =sc.nextLine();//g�� ĳ���Ͷ� �����ϳ��� �ؽ�Ʈ���Τ��� �����̶� �ȵ�. 
		g = Integer.parseInt(sc.nextLine()); 
		System.out.print("���ͼ��� : ");
		score = Integer.parseInt(sc.nextLine());
		
		if((g==1 && score>=700)||(g==0 && score>=800)) {
			System.out.println("�װ� �¹��� ���� �ڰ� �������Դϴ�. ");
		}
		else System.out.println("���� �Ұ�. ");		*/

	}

}