package exam01;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("계단 수를 입력하세요");
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(" ");
				System.out.print("**");
			}System.out.println();
		}
	}

}
