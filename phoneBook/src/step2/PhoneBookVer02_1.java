package step2;

import java.util.Scanner;

public class PhoneBookVer02_1 {
	static Scanner sc = new Scanner(System.in); //전역에서 사용가능함 
	
	public static void main(String[] args) { //메소드1. 메소드3개짜리 클래스
		int choice = 0;
		
		while(true) {
			showMenu();  //메소드2.
			choice = Integer.parseInt(sc.nextLine());
			
			switch(choice) { //문제점!!!! 값이 저장이 안됨. 저장은 직전에 한 것만 저장.
			case 1:			//이제까지 한 것 다 저장하려면 배열 필요
				inputData();  //메소드3.
				break; //반복문 빠져나오는 것. 
				//인풋데이터 쫙 나오고 case2로 가지 않고(스위치문 빠져나옴) 끝내고 
				//다시 와일로 와서 메누선택 뜸
			
			case 2:
				System.out.println("프로그램 종료");
				return;
			}//구조적인 코딩을 위해서는 메인에서 어떤 프로그램인지 딱 보이도록 정리,, =모듈화
			
		}
		
	}
	
	static void inputData() {  //다른 메소드 작성
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("전화번호 : ");
		String phoneNum = sc.nextLine();
		System.out.print("생일 : ");
		String birth = sc.nextLine();
		
		Person p = new Person(name, phoneNum, birth);
		p.showPhoneinfo();
	}
	
	static void showMenu() {
		System.out.println("선택하세요");
		System.out.println("1. 데이터 입력");
		System.out.println("2. 프로그램 종료");
		System.out.print("선택 : ");
	}
}
