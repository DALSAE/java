package Homework;

import java.util.Scanner;

public class Five {

	public static void main(String[] args) {
		//마트에서 구입한 물건 값과 구입시간을 입력받아 실제 지불한 금액을 출력
		//마트는 시간대별로 할인율을 다르게 적용.
		
		Scanner sc = new Scanner(System.in);
		int time=0;
		int things=0, sale=0;
		
		System.out.print("구입 시간 : "); // time은 몇시라고 입력받아야하는데 정수인가 문자열인가.. 
		time = Integer.parseInt(sc.nextLine());
		
		System.out.printf("총 구입금액 : ");
		things = Integer.parseInt(sc.nextLine());
		
		if (time<12) //시간 오전오후로 나눠야하나,,? 뭔 캘린더 함수라고 나오긴 하는데,, 
			System.out.print("실제 지불 금액 : "+(int)(things*0.95));
											//format = new SimpleDateFormat("hh:mm:ss a");
		else if (time>=12)
		System.out.println("실제 지불 금액 : "+(int)(things*0.975)); 		
	}

}
//1. 타임함수를 문자열로 선언. 10시 형태로 입력함. 이프에서 12시 이전 이후할 때 ><연산자 기호가 문자열에 사용안되서ㄴㄴ
//이프에서 타임함수를 정수형태로 바꿔도 >12 걔는 10시 고 비교 숫자는 12라서 오류뜸. 
//2. 타임함수를 숫자로 선언해서 그냥 숫자로만 입력받으면 게산 되는데 어떻게 해 ㅠㅠ.. 

//형태 똑같이 나올 필요 없고 그냥 숫자만 맞게하면 된대 ㅠㅠ 