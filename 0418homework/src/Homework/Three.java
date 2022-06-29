package Homework;

import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		// 성별이 여자이면서 토익 성적>=700인 경우 또는 성별 남자 토익 성적>=800 인 경우에만
		//"항공 승무원 지원 자격 가능자입니다." 출력
		
		Scanner sc = new Scanner(System.in);
		int toeic =0;
		String gender; //스트링 값은 고정된다했는데 뭐고!!!! 
		
		System.out.print("성별을 입력하시오(여자/남자): ");
		gender = sc.nextLine();
		
		System.out.print("토익 성적: ");
		toeic = Integer.parseInt(sc.nextLine());
				
		 
		 if ((gender.equals("여자")==true && toeic>=700)||(gender.equals("남자")==true && toeic>=800))
			System.out.println("항공 승무원 지원 자격 가능자입니다. ");
		
		else System.out.println("END");

	}

}
//성별 남자 여자로 
//변수를 하나더 
//인터넷 찾다가 새로운 것 배움. 문자열 조건에 넣는 방법. 근데 쌤이 어제 가르쳐 준 방식 중에 푸는 방법은 아직 모르겠음.
//문자열변수.eqals("문자")==ture 뭐 아니면 false