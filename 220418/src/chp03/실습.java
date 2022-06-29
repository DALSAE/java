package chp03;

import java.util.Scanner;

public class 실습 {

	public static void main(String[] args) {
		//성적을 입력받아서 100~90점은 A, 89~80는 B, 79~70은 C, 69~60은 D, 59부터는 F학점이 나오게 출력
		
		Scanner num = new Scanner(System.in); 
		String name;
		int point;
		
		System.out.print("과목명을 입력하시오. ");
		name = num.nextLine();
		
		System.out.print("성적을 입력하시오. ");
		point = Integer.parseInt(num.nextLine());
		char grade= ' ', opt = '0';
		
		//point <=100 && point >=90 이라고 조건 넣을수도 ㅇㅇ. 좀 번거롭긴 함. 
		//if else로 왔을 때는 이미 걸러서 왔으니까 point>=80만 해도 ㅇㅇ.
		
		/*if (point>=90) {System.out.println("학점: A "); 
		}
		else if (point>=80) { System.out.println("학점: B ");
		}
		else if (point>=70) { System.out.println("학점: C ");
		}
		else if (point>=60) { System.out.println("학점: D ");
		}
		else { System.out.println("학점: F "); */    			//내가 쓴 것도 맞음
		
		if (point>=90) { grade= 'A'; 
			if(point>=98) {
				opt = '+';}
			else if (point < 94) {
				opt = '-';}
		}
		else if (point>=80) { grade= 'B'; 
			if (point >= 88) {
				opt = '+'; }
			else if (point < 84) {
				opt = '-';}
		}
		else if (point>=70) { grade= 'C'; 
			if (point >= 78) {
			opt = '+'; }
			else if (point < 74) {
			opt = '-';}
		}
		else if (point>=60){ grade= 'D'; 
			if (point >= 68) {
				opt = '+'; }
			else if (point < 64) {
				opt = '-';}
		}
		else { grade= 'F'; 
		}
		
		System.out.println("학점: "+grade + opt); //맞는 것임. 형태 익숙해지기. 
		
		}
	}






