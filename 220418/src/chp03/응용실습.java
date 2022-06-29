package chp03;

import java.util.Scanner;

public class 응용실습 {

	public static void main(String[] args) {
		//나이를 입력받아서 20살을 기준으로 성인인지 미성년자인지 출력하는 프로그램 
		//그리고 입력 나이가 홀수인지 짝수인지 출력 

		Scanner n = new Scanner(System.in); // ctrl + shift + o 필수!!! import 자동으로 해주는 것
		int age=0;
		
		System.out.print("나이를 입력하시오. ");
		age = Integer.parseInt(n.nextLine());
		
		if (age >=20) {
			System.out.println("당신은 성인입니다. ");
			}
		else { System.out.println("당신은 미성년자입니다. ");}
					
		if (age % 2 == 0)
		System.out.println("입력한 숫자는 짝수입니다. ");
		else {System.out.println("입력한 숫자는 홀수입니다. ");}
	}

}
