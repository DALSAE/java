package exam;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayex2 {

	public static void main(String[] args) {
		// 숫자 열개 입력받아서 배열으 합 구하기
		
		Scanner sc = new Scanner(System.in);
		int [] a= new int[10];
		int sum=0;
		 
		
	
		for(int i=0; i<a.length; i++) {
			System.out.println("숫자 입력 : ");
			a[i]=Integer.parseInt(sc.nextLine());
						
		}
		for(int i=0; i<a.length; i++) {
		sum= sum + a[i]; //값 누적하는 것 
		}
		
		System.out.println(sum);
		System.out.println(Arrays.toString(a));//이미 만들어진 메소드.
		//배열 모든 값 출력
		

	}

}
