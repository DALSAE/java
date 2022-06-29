package Homework;

import java.util.Scanner;

public class Three2 {

	public static void main(String[] args) {
		// 성별이 여자이면서 토익 성적>=700인 경우 또는 성별 남자 토익 성적>=800 인 경우에만
		//"항공 승무원 지원 자격 가능자입니다." 출력
		
		Scanner sc = new Scanner(System.in);
		String she;
		String he; //근데 이거 성별을 아예 다른 변수로 해버리면 처음 입력을 받을때 한번만 적어야하는데 둘로 나뉘잖어
		int toeic=0;
		
		System.out.print("성별: "); //근데 여기서 값 하나만 받아서 그걸 뒤에 조건에서 남/여로 나눌라면 
		she = sc.nextLine();       // 입력받은거를 또 변수로 정해야하는데 그거 ㄴ가능한건가? 
		he = sc.nextLine();
		
		System.out.print("토익 성적: ");
		toeic = Integer.parseInt(sc.nextLine());
		
		if (she==sc.nextLine() && toeic>=700)
			System.out.println("항공 승무원 지원 자격 가능자입니다. ");
		
		

	}

}
