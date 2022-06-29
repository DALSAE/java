package answer;

import java.util.Scanner;

public class Num1 {

	public static void main(String[] args) {
		// 

		Scanner sc = new Scanner(System.in);
		int num=0; //메인에서 사용하는 로컬 변수는 초기 값 설정 안하면 오류 뜨기 쉬움.  //f가 기본값
		int sum=0;
		
		System.out.println("정수를 입력하세요 : ");
		num = Integer.parseInt(sc.nextLine());
		
		do {
			sum = sum + num; //합구하기는 입렫된 값에 합을 계속 누적 시키기
			num--;
			System.out.println(sum+" : "+num);
		}while(num>0);
		System.out.println("합은 "+sum);		
	



	//for(int i=1;i<=)입력된 숫자 보다 작게 쌤은 일부터 뭐까지 더하는 방식으로 풂 ]
		while(num>0) {
			
		}}}
