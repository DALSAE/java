package Chapter1;

import java.util.Scanner;

public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); 
		
		final int DIST = 400; //���(final�Է�)�� �빮�ڷ� �Է��ϱ�. ������� ��Ÿ������.
		//400�� ������. ���ϴ¼��� �ƴ�. �ٽ� ���� ���ϰ� �ϱ����� ����� ����. �������ϰ� ��������.
		int speed = 0;
		double time = 0.0; //int�ϸ� �ҽ��� �����ϱ� �����.
		String result = "";
		
		/*�Է�*/
		System.out.print("�ִ� �ӵ��� �Է��Ͻÿ� : ");
		speed = Integer.parseInt(sc.nextLine()); //�׳� (int) �� �� ��. ������ �⺻���� �׳� ��ȯ�ȉ�.
		//�����ϱ�� ctrl+s�� �����ϰ�  ctrl+f11�� ����.
		
		
		/*ó��*/
		time = DIST / (double)speed; //���� ������ ������ ������ ���. �Ǽ��� �����Ϸ��� �ϳ��� �Ǽ��� �ٲ����.
		System.out.println(time);
		
		if(time<=2) { //if�� �´� �� ã���� ������ �ȳ������� ��������!!
			result = "High High speed";
		}
		else if(time<=3) {
			result = "High speed";
		}	
		else if(time<=3) {
			result = "Good speed";
		}	
		
		/*���*/
		System.out.println(result);
		
		/*���*/       //syso���� �ڵ� �ݺ��̶� ������ �ڵ���. 
		/*if(time<=2.0) {System.out.println("High High speed");			
		}
		else if (time<=3) {System.out.println("High speed");
		}
		else if (time>=4){System.out.println("Good speed");
		}*/
	
	}

}
