package chp03;

public class Class4 {

	public static void main(String[] args) {

		/*int i =5;
		//i++; i = i +1 �� ���� �ǹ� ++i;
		System.out.println(++i); //���� ���� ������ ���̤���
		
		System.out.println(--i);
		System.out.println(i); */
		
		
		int i=5, j=0;
		j = i++;   //�����ϱ� j=i(5)�� ����!! �����ٿ��� ++���� i�� 6�� 
		//�򰥸��� ���� �Ф� 
		System.out.println("j=i++; ���� ��, i=" + i +", j="+ j);
		
		i=5;
		j=0;
		
		j=++i;
		System.out.println("j=++i; ���� ��, i=" + i +", j="+ j);
						
	}

}
