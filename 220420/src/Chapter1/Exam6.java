package Chapter1;

import java.util.Scanner;

public class Exam6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int grade = 0;
		int mph = 0;
		int hour = 40;
		double total = 0;
		
		System.out.print("직급(5,6,7,8) : ");
		grade =  Integer.parseInt(sc.nextLine());
		System.out.print("근무시간 : ");
		hour = Integer.parseInt(sc.nextLine());
		
		//시급결정
		if (grade==5||grade==6) {
			mph=20000;}
		else if(grade==7||grade==8) {
			mph=15000;
		}
		
		//근무시간 체크해서 40시간 이하이면 40시간으로 결정
		if(hour < 40) {
			hour = 40;
		}
		
		//급여계산
		total = mph*40 + (1.5*mph*(hour-40)); //hour가 40시간으로 설정되어 40-40=0 되서 계산ㄴㄴ
		
		System.out.println("주 급여 : "+Math.round(total));
		

	}

}
