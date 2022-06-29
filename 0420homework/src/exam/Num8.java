package exam;

import java.util.Scanner;

public class Num8 {

	public static void main(String[] args) {
		//월을 입력받아 그 월의 해당 계절 출력
		//실행결과 형태로 출력

		Scanner sc = new Scanner(System.in);
		int month = 0;
		
		System.out.println("===========================");
		System.out.println("가장 좋아하는 월은? (종료0) : ");
		month = Integer.parseInt(sc.nextLine());
		System.out.println("===========================");
		
		System.out.println("***** "+month+"월 *****");
		
		if(month>=3 && month<=5) {
			System.out.println(month+"월은 봄에 해당합니다."); 
		}
		
		
	}

}
