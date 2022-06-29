package Chapter1;

import java.util.Scanner;

public class Exam4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int grade = 0;
		int money= 0;
		final double RAT1 = 0.08, RAT2 = 0.12;  //상수 변수 대문자로 사용!!!
		double real = 0.0;
		
		
		System.out.print("직급(5,6,7,8) : ");
		grade =  Integer.parseInt(sc.nextLine());
		System.out.print("본봉 : ");
		money =  Integer.parseInt(sc.nextLine());
		
		if(grade==5 || grade==6) {
		real = money - money*RAT2;}
		else if (grade==7 || grade==8) {
			real = money - money*RAT1;}
		else System.out.println("error");
		
		//System.out.println("실수령액 : " + Math.round(real)); //ㅅㅗ수점 아래를 없애는 것
		System.out.printf("실수령액(세금");
	}
		//%를  출력하려면 "%%"를 입력해야함. 
}
