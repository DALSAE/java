package Chapter1;

public class ForExam2 {

	public static void main(String[] args) {
		// 1���� 10���� �ձ��ϱ�
		
		/* int i=1;
		int sum=0;
		
		for(i=1; i<=10; i++) {
			sum=sum+i;
		}
		System.out.println(sum);*/
		
		for (int i=1; i>=10; i++) {
			System.out.println(i);
		}
		
		int j = 0; //�ʱⰪ
		while (j<=10) {//����
			j++;    //������
			System.out.println(j);
		}
		int k=1;
		do {System.out.println(k);     //������ �ѹ� �����ϰ� ���ǿ� ������ �ٽ� �����ϰ� ���� �ȸ����� ��������
			k++;
		}while(k<=10);
	}

}
