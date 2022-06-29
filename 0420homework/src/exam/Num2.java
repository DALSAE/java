package exam;

public class Num2 {

	public static void main(String[] args) {
		//100부터 1까지 중 홀수의 합을 구하여 출력
		
		int sum=0;
		for(int i=100; i>=1; i--) {
			if(i%2==1) {			//for문 안에도 if조건문 쓸 수 있다!
				sum = sum+i;
			}
		}System.out.println(sum);
	}

}
