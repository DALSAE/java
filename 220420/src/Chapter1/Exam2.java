package Chapter1;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x=0, y=0;
		String result = "";
		
		//입력
		System.out.print("숫자 1을 입력하시오 : ");
		x = Integer.parseInt(sc.nextLine());
		
		System.out.print("숫자 2를 입력하시오 : ");
		y = Integer.parseInt(sc.nextLine());
		
		
		//처리
		if ((x%2==0 && y%2==0)||(x%2==1 && y%2==1)) {
			result = "두 숫자는 같은 짝수 또는 홀수입니다. ";	
		}
		else System.out.println("error");
		
		System.out.println(result);			
	}

}
