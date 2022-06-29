package Chapter1;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		//주민번호 입력받아서 성별판단하기
		
		Scanner sc = new Scanner(System.in);
		String id="";	
		char gender = ' '; //하나 뽑아낼 문자 변수로 선언
		String result=" ";
		
		
		System.out.println("주민등록번호를 입력하시오.(000000-0000000) :");
		id = sc.nextLine();
		gender = id.charAt(7); //문자열에서 하나의 문자 뽑아내기. 변수 = 문자열변수.charAt(숫자번째값). 
		
		switch(gender) {
			case '2': case '4':  //문자 하나 뽑아온 거라서 ' '안에 숫자를 입력해야함!!!! 
				switch(gender) {
				case 2:
					System.out.println("당신은 2000년 이전 출생 여자입니다. "); break;
				case 4:
					System.out.println("당신은 2000년 이후 출생 여자입니다. "); break;	
					}
			
				
			case '1': case '3':
				switch(gender) {
				case 1:
					System.out.println("당신은 2000년 이전 출생 남자입니다. ");break;
				case 3:
					System.out.println("당신은 2000년 이전 출생 남자입니다. ");break;
				}
						default:
			System.out.println("유효하지 않는 주민번호입니다. ");
		}
		
		
		//번호에서 8번째값이 2,4면 여자 1,3이면 남자 출력
		
	}

}
