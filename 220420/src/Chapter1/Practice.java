package Chapter1;

public class Practice {

	public static void main(String[] args) {
		//1~10까지 합구하기 for, while, do while구문
		//구구단 3단 찍기 
		
		int sum=0;		
		
		for(int i=1; i<=10; i++) {
			sum+=i;
			}
		System.out.println(sum);
		
		int a=0;
		while(a<=10){ sum += a;
		a++;
		}
		System.out.println(sum);
	}

}
