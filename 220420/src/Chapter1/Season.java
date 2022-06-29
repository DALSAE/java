package Chapter1;

import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
		// 1부터 12까지 숫자를 입력받아서 봄여름가을겨울 출력하는 문자 출력
		
		Scanner sc = new Scanner(System.in);
		int month=0;
		String result=" ";
		
		System.out.print("월을 입력하시오(1~12) : ");
		month = Integer.parseInt(sc.nextLine());
		
		
		/*if (month>=3 && month<=5) {
			System.out.println("봄입니다. ");
		}else if (month>=6 && month<=8) {
			System.out.println("여름입니다. ");
		}else if (month>=9 && month<=10) {
			System.out.println("가을입니다. ");
		}else if ((month>=11 && month<=12) || (month>=1 && month<=2)) {
			System.out.println("겨울입니다. ");
		}
		else System.out.println("잘못 입력하셨습니다. ");
		//else System.out.println("겨울입니다. ");*/
		
		/*if (month>=3 && month<=5) {  //if~else if까지가 한 구문이니까 대괄호에 붙여서 다닥따닥 쓰기 버릇들여~!~!
			result="봄";
		}else if (month>=6 && month<=8) {
			result = "여름";
		}else if (month>=9 && month<=11) {
			result = "가을";
		}else if (month==12|| (month>=1 && month<=2)) {
			result = "겨울";
		}else result = "잘못 입력하셨습니다. ";*/
		
		/* if(month==3||month==4||month==5) {
			result = "봄";
		}else if(month==6||month==7||month==8) {
			result = "여름";
		}else if(month==9||month==10||month==11) {
			result = "가을";
		}else if(month==12||month==1||month==2) {
			result = "겨울";
		}else result = "잘못 입력하셨습니다. ";
		//switch구문은 if보다 조건이 보다 한정적. 값이 딱 떨어지는 경우 switch구문이 더 깔끔함. 
	
		System.out.println(result);	*/
		
		/* switch(month) {
			case 1: result = "겨울"; break;
			case 2: result = "겨울"; break;
			case 12: result = "겨울"; break;
			case 3: result = "봄"; break;
			case 4: result = "봄"; break;
			case 5: result = "봄"; break;
			case 6: result = "여름"; break;
			case 7: result = "여름"; break;
			case 8: result = "여름"; break;
			case 9: result = "가을"; break; 
			case 10: result = "가을"; break;
			case 11: result = "가을"; break;
			default : result = "잘못된 입력"; */
		switch(month) {
		case 1: case 2: case 12: 
			result = "겨울"; 
			break;
		case 3: case 4: case 5: 
			result = "봄"; 
			break;
		case 6: case 7: case 8: 
			result = "여름";
			break;
		case 9: case 10: case 11: 
			result = "가을"; 
			break;
		default : 
			result = "잘못된 입력";	
		}
		System.out.println(result);
	}
		

}
