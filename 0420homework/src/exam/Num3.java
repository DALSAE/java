package exam;

import java.util.Scanner;

public class Num3 {

	public static void main(String[] args) {
		// 10개의 숫자 입력받아 0보다 큰 수만 전체 합과 평균을 출력 //변수 열개 지정 ㄱㄴㄷㄹ
		
		Scanner sc = new Scanner(System.in);
		int num=0,sum=0 ;
		
		System.out.println("숫자를 입력하시오 : "); //일단 값을 입력을 받아야 for에서 조건을 비교해서 반복할 수 있지 않나?
			num = Integer.parseInt(sc.nextLine());
			
		for(num=0 ;num>0;) {
			
			
			sum = num+sum;								
		}
		
		
		//숫자 입력하시오 01ㅗ다 큰가? ㅇㅇ 더하기 0보다작은가? 나가리 출력된 것만 합구하기. 
		//숫자를 열ㅁ번 반복해서 입력받기 

	}

}
