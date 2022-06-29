package Homework;

import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
		//두 개의 숫자 입력받아 두 수가 모두 짝수이거나 모두 홀수이면 "두 숫자는 같은 짝수 또는 홀수입니다." 출력

		Scanner sc = new Scanner(System.in);
		int num1=0, num2=0;
		
		System.out.print("첫번째 숫자를 입력하시오. ");
		num1 = Integer.parseInt(sc.nextLine());
		
		System.out.print("두번째 숫자를 입력하시오. ");
		num2 = Integer.parseInt(sc.nextLine());
		
		if ((num1%2==0 && num2%2==0)||(num1%2==1 && num2%2==1)) {
			System.out.println("두 숫자는 같은 짝수 또는 홀수입니다. "); }
		
		else System.out.println("END");
		
		/*System.out.print("두 개의 숫자를 입력하세요. ");
		num1 = a.nextInt();
		num2 = a.nextInt(); 
		인터넷에 나온 숫자 두개 한번에 입력받는 방법이라는데 if문까지 출력이 안됨 아직 안배워서 잘 모르겠음*/
		
		}

}
