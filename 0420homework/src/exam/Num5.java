package exam;

import java.util.Scanner;

public class Num5 {

	public static void main(String[] args) {
		//3�� ����� ���ϰ� �ϳ��� ���� �Է¹޾� 
		//3�� ����� ������ �Էµ� ���ڸ� �Ѿ��� ���� n��, ���հ�, n���� ���°���� ���

		Scanner sc = new Scanner(System.in);
		
		int i=0;
		int sum=0;//3��� ����
		int a =0;//�Է¹޴� ����
		int n=0;//n���� �� ����
		int tot=0;// ���հ�
		int x=0; //���° ����ΰ�
		
		
		System.out.print("����� �Է� : ");
		a = Integer.parseInt(sc.next());
				
		for(i=3; ;i+=3) {
			sum = i+sum;
			if (sum <= a) {			//��ȣ ���� ���� �ȵ�
				if(a%3==0) { 
					n=a+3;
					tot=sum+n;				
				}else if(a%3==1) { 
					n=a+2;
					tot=sum+n;
				
				}else if(a%3==2) { 
					n=a+1;
					tot=sum+n;
				
				}break;
			
			}
			//if������ ���� ��µ� ��  3�� ���ϰ� �������ͼ� �������� ��� ���³ֱ�
			}
		System.out.println(a+"��(��) �Ѿ��� ���� �� : "+n);
		System.out.println(a+"��(��) �Ѿ��� �������� ���հ� : "+tot);
		System.out.println(a+"��(��) �Ѿ��� ������ �� ��° 3�� ����ΰ� : "+x);
}
}
			


