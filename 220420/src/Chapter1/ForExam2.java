package Chapter1;

public class ForExam2 {

	public static void main(String[] args) {
		// 1부터 10까지 합구하기
		
		/* int i=1;
		int sum=0;
		
		for(i=1; i<=10; i++) {
			sum=sum+i;
		}
		System.out.println(sum);*/
		
		for (int i=1; i>=10; i++) {
			System.out.println(i);
		}
		
		int j = 0; //초기값
		while (j<=10) {//조건
			j++;    //증감식
			System.out.println(j);
		}
		int k=1;
		do {System.out.println(k);     //무조건 한번 수행하고 조건에 맞으면 다시 수행하고 조건 안맞으면 빠져나옴
			k++;
		}while(k<=10);
	}

}
