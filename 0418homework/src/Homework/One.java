package Homework;

import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		//나이와 성적 입력받기. 나이 < 30이고 성적 >= 3.5면 "추천 대상입니다." 아니면 "추천 대상이 아닙니다."출력
		
		Scanner sc = new Scanner(System.in); 
		int age = 0;
		double grade = 0.0;
		
		System.out.print("나이: "); //입력받기 순서 기억하기! 나이를 묻는 문장 먼저 나와야 입력도 함! 
		age = Integer.parseInt(sc.nextLine());
		
		System.out.print("성적: ");
		grade = Double.parseDouble(sc.nextLine());
		
		if (age < 30 && grade >= 3.5) 
			System.out.println("추천 대상입니다. ");
		else System.out.println("추천 대상이 아닙니다. ");
		
	}

}
