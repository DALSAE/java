package Chapter1;

import java.util.Scanner;

public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); 
		
		final int DIST = 400; //상수(final입력)는 대문자로 입력하기. 상수임을 나타내려고.
		//400은 고정됨. 변하는수가 아님. 다시 변경 못하게 하기위해 상수로 만듦. 수정못하게 만들어야함.
		int speed = 0;
		double time = 0.0; //int하면 소실이 많으니까 더블로.
		String result = "";
		
		/*입력*/
		System.out.print("최대 속도를 입력하시오 : ");
		speed = Integer.parseInt(sc.nextLine()); //그냥 (int) 쓸 수 없. 참조형 기본형은 그냥 변환안됌.
		//실행하기는 ctrl+s로 저장하고  ctrl+f11로 실행.
		
		
		/*처리*/
		time = DIST / (double)speed; //정수 나누기 정수는 정수로 출력. 실수로 값구하려면 하나는 실수로 바꿔야함.
		System.out.println(time);
		
		if(time<=2) { //if는 맞는 블럭 찾으면 밑으로 안내려오고 빠져나옴!!
			result = "High High speed";
		}
		else if(time<=3) {
			result = "High speed";
		}	
		else if(time<=3) {
			result = "Good speed";
		}	
		
		/*결과*/
		System.out.println(result);
		
		/*결과*/       //syso많은 코드 반복이라 안좋은 코드임. 
		/*if(time<=2.0) {System.out.println("High High speed");			
		}
		else if (time<=3) {System.out.println("High speed");
		}
		else if (time>=4){System.out.println("Good speed");
		}*/
	
	}

}
