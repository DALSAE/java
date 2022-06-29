package Chapter1;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age=0;
		double score=0.0;
		String result = "";/*결과값 변수 선언해서 깔끔하게 정리하기*/
		
		//입력
		System.out.print("나이 : ");
		age = Integer.parseInt(sc.nextLine());
		System.out.print("성적 : ");
		score = Double.parseDouble(sc.nextLine());
		
		//처리
		if(age<30 && score>=3.5) {
			result = "추천대상";
		}
		else {result = "추천대상 아님";
		}
		
		//출력
		System.out.println(result);	
	}

}
