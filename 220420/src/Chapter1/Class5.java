package Chapter1;

import java.util.Scanner;

public class Class5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		char ch=' ';
		String result = " ";
		
		System.out.print("문자 하나를 입력하시오 : ");
		String input = sc.nextLine();
		ch = input.charAt(0);
		
		
		/*String temp = sc.nextLine(); //ㅣ기본형 참조형 자동 형변환 안됨. 문자열에서 특정 위치 하나를 뽑아서 출력
		c = temp.charAt(0); //java에서 숫자는 0부터 시작. 입력값에서 0번째 출력하라는 말.*/
		
		//문자인지 숫자인지 출력
		/*if(ch>='0' && ch<='9') {
			System.out.println("숫자입니다. ");
		}
	
		if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z')) {
			System.out.println("영문자입니다. ");
		}		*/
		
		result = (ch>='0' && ch<='9') ? "숫자" : "문자";
		System.out.println(result);
	}

}
