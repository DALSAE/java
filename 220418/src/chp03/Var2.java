package chp03;

import java.util.Scanner;

public class Var2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System. in); //외부에서 입력받을 때 쓰는 것 
	
		String name=""; //문자열 담는 것
		int kor=0, eng=0, mat=0;
		int total; 
		double avg; 
		
		System.out.print("이름 => " +name);
		name = sc.nextLine(); //스트링과 같은 의미. 입력받은 문자열 
		System.out.print("국어점수 ==> ");
		kor = Integer.parseInt(sc.nextLine()); //문자열을 숫자열로 변환하는 것 
		System.out.print("영어점수 ==> ");
		eng = Integer.parseInt(sc.nextLine());
		System.out.print("수학점수 ==> ");
		mat = Integer.parseInt(sc.nextLine());
		
		total = kor + eng + mat;
		avg = total/3.0;
		System.out.println("총점: " +total);
		System.out.println("평균: " +avg);	
	}

}
