package for_;

import java.util.Scanner;

public class star {

	public static void main(String[] args) {
		//스캐너사용. 입력받은 값만큼 별찍기
		System.out.println("숫자를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int result = Integer.parseInt(sc.nextLine());
		System.out.printf("출력할 별의 갯수 : %d" + result);
		
//		for(int i=0; i<=result; i++) {
//			System.out.print("*");
//		}
	}

}
