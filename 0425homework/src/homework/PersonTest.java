package homework;

import java.util.Scanner;

public class PersonTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person[] p = new Person[3]; //배열만 선언한 것 객체 생성 ㄴㄴㄴ

		for (int i = 0; i < p.length; i++) {
			p[i]=new Person(); // 객체 생성 ㅇㅇ!!!!!!!!!!!!!!!!!!!!!!
			
			System.out.print("이름을 입력하시오 : ");
			p[i].name = sc.nextLine();
			System.out.print("전화번호를 입력하시오 : ");
			p[i].phoneNumber = sc.nextLine();
			System.out.print("생년월일을 입력하시오 : ");
			p[i].birth = sc.nextLine();
			
			System.out.println();
			                                                                                                        
		}
		for (int i = 0; i < p.length; i++) {
			if(p[i].birth.equals("")) { //생각도 못함,, 이퀄스!!! 
				System.out.printf("이름: %s%n전화번호: %s%n",p[i].name,p[i].phoneNumber);
				System.out.println();
			}
			else p[i].showPerson();
				System.out.println();
			
		}

		
	}

}
