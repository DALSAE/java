package chp03;

import java.util.Scanner;

public class Var3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//ctrl shift o 자동 임포트 되게하는것. 스캐너 쓰고 바로 해야함.
		
		String name = "";// 문자열ㅇ르 저장하기 위한 데이터 타입 따로 임포트 필요 없
		int age = 0, age10 =0; 
		double h = 0.0; 
		
		System.out.print("이름을 입력하시오: ");
		name = sc.nextLine(); //인티저파세 안함 왜??? 스트링이라서 이미 문자열이니까
		
		System.out.print("나이를 입력하시오: ");
		age = Integer.parseInt(sc.nextLine());//숫자열이니 인티저 해야함 
		//age는 int이거  sc는 string이라 타입이 다르니까 반드시 인테저 파스인트 해야함
		
		System.out.print("키를 입력하시오: ");
		h = Double.parseDouble(sc.nextLine());
		
		age10 = age + 10;
		
		//System.out.println(name + "는(은) 10년 후에 " +age10 + "살 입니다.");
		
		System.out.printf("%s는(은) 10년 후에 %d살 입니다. ", name, age10);
	}

}
