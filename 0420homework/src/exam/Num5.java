package exam;

import java.util.Scanner;

public class Num5 {

	public static void main(String[] args) {
		//3의 배수를 더하고 하나의 숫자 입력받아 
		//3의 배수의 총합이 입력된 숫자를 넘었을 때의 n값, 총합계, n값이 몇번째인지 출력

		Scanner sc = new Scanner(System.in);
		
		int i=0;
		int sum=0;//3배수 총합
		int a =0;//입력받는 숫자
		int n=0;//n수에 들어갈 변수
		int tot=0;// 총합계
		int x=0; //몇번째 배수인가
		
		
		System.out.print("사용자 입력 : ");
		a = Integer.parseInt(sc.next());
				
		for(i=3; ;i+=3) {
			sum = i+sum;
			if (sum <= a) {			//부호 방향 이해 안됨
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
			//if식으로 각각 출력될 값  3개 정하고 빠져나와서 마지막에 출력 형태넣기
			}
		System.out.println(a+"을(를) 넘었을 때의 값 : "+n);
		System.out.println(a+"을(를) 넘었을 때까지의 총합계 : "+tot);
		System.out.println(a+"을(를) 넘었을 때까지 몇 번째 3의 배수인가 : "+x);
}
}
			


