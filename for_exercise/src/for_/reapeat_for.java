package for_;

public class reapeat_for {

	public static void main(String[] args) {
		//0-10까지 홀수 숫자만 출력
		//0-10까지 홀수의 총합
		int sum=0;
		int i=0;
		for(i=0; i<=10; i++) {
			if(i % 2 == 1){
				System.out.print(i+" ");
				sum=sum+i;
			}
		}System.out.println(sum);
	}

}
