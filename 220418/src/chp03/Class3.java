package chp03;

public class Class3 {

	public static void main(String[] args) {
		
		int x= 50;
		int y = 3;
		int z = 4;
		
		
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/(double)y); //���� ������ ������ ������ ��� ����. �Ҽ��� �Ǽ� ��������� �� �� �ϳ� �Ǽ��� ��������. 
		System.out.println(x%y);
		System.out.println(z >> 2);//����Ʈ ������ ������ �������� �������� �ڸ� �ι� �ű�� 1�� 4����(2�� ����)
		
		System.out.println(true || (z>y)); 
			
		
	}

}
