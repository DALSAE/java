package chp03;

import java.util.Scanner;

public class 연습 {

	public static void main(String[] args) {
		// 서울에서 부산까지 400km거리. 자동차 최대 속도 입력 받아 도착까지 걸리는 시간 구하기
		//2시간 이하이면 "High High Speed" 3시간 이하이면 "High Speed" 4시간 이상이면 "Good Speed" 출력
		
		Scanner spe = new Scanner(System.in);
		int max;
		int tim; //220420프로젝트 chapter1패키지에 Class1 클래스에 풀이 있음. 시간을 더블로 선언. 
		
		System.out.print("최대 속도는? ");
		max = Integer.parseInt(spe.nextLine());
		
		tim = 400 / max;
		//System.out.println("도착까지 걸리는 시간: "+ tim + "시간");
		
		// 거리/속도*시간
		
		if (tim <=2 ) {
			System.out.println("High High Speed");
		}
		else if (tim <= 3) {
			System.out.println("High Speed");
		}
		else if (tim >=4) {
			System.out.println("Good Speed");
		}		
	}
}
