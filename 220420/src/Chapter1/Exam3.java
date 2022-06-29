package Chapter1;

import java.util.Scanner;

public class Exam3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//char g = ' '; //string문자열로 하면 아직 안배워서 오류남. 배운 범위안에서 하는 방법
		int score = 0;
		String g = " "; //성별을 문자열로 입력.메모리에 빈문자열 생김. 실제 문자가 아닌 문자열의 주소값을 저장함. 
		
		System.out.print("성별(여자f 남자m) : ");
		g = sc.nextLine(); 
		System.out.print("토익성적 : ");
		score = Integer.parseInt(sc.nextLine()); 
		
		if ((g.equals("f")&&score>=700)||(g.equals("m") && score>=800)) {
			System.out.println("항공 승무원 지원 자격 가능자입니다. ");
		}//변수.equals("")은 참거짓 판별. 
		else {System.out.println("지원 불가. "); }
		
		
		
		/*int g = 0; 숫자열로 입력받아서 할 때. 
		
		
		System.out.print("성별(여자0 남자1) : ");
		//g =sc.nextLine();//g는 캐릭터라서 문자하난데 넥스트라인ㅇㄴ 한줄이라 안됨. 
		g = Integer.parseInt(sc.nextLine()); 
		System.out.print("토익성적 : ");
		score = Integer.parseInt(sc.nextLine());
		
		if((g==1 && score>=700)||(g==0 && score>=800)) {
			System.out.println("항공 승무원 지원 자격 가능자입니다. ");
		}
		else System.out.println("지원 불가. ");		*/

	}

}
