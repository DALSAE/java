package exam;

import java.util.Scanner;

public class Num1 {

	public static void main(String[] args) {
		//하나의 숫자 입력받아 숫자부터 1까지의 합을 구하여 출력 for,while do while
		
		Scanner sc = new Scanner(System.in);
		int num=0;
		int sum = 0;
		System.out.print("숫자를 입력하시오 : ");
		num = Integer.parseInt(sc.nextLine());
		
		for (int i=num; i>=1; i--) {
			sum = sum+i;			
		}
		System.out.println(sum); //이 출력 문장이 for구문 안으로 들어가면 안됨!! for구문 자체가 반복문이라 출력도 반복됨.
	}

}
