package exam;

public class Num2 {

	public static void main(String[] args) {
		//100���� 1���� �� Ȧ���� ���� ���Ͽ� ���
		
		int sum=0;
		for(int i=100; i>=1; i--) {
			if(i%2==1) {			//for�� �ȿ��� if���ǹ� �� �� �ִ�!
				sum = sum+i;
			}
		}System.out.println(sum);
	}

}
