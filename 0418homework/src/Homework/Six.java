package Homework;

import java.util.Scanner;

public class Six {

	public static void main(String[] args) {
		// 사원 등급에 따라 직급7,8급 15000/시간 직급5,6급 20000/시간 일주일에 40시간이 기본 근무
		//초과하는 경우 시간당 급여의 1.5배지급. 주 급여를 출력.
		//단, 근무시간이 40시간에 미달하면 40시간으로 처리.
		
		Scanner sc = new Scanner(System.in);
		int level=0, work=0, tmoney=0; //이제까진 시간당 급여 그냥 이프안에서 식 바꿔서 계산했는데 이걸 변수로 줘서도 계산 해볼까
		
		System.out.print("직급 : ");
		level = Integer.parseInt(sc.nextLine());
		
		System.out.print("근무 시간 : ");
		work = Integer.parseInt(sc.nextLine());
		
		if ((work<=40)&&((level==5)||(level==6))) {
			System.out.println("주 급여 : "+(40*20000));
		}
		else if ((work>40)&&((level==5)||(level==6))) {
			System.out.println("주 급여 : "+((40*20000)+((work-40)*((int)(20000*1.5)))));
		}
		else if ((work<=40)&&((level==7)||(level==8))) {
			System.out.println("주 급여 : "+(40*15000));
		}
		else if ((work>40)&&((level==7)||(level==8))) {
			System.out.println("주 급여 : "+((40*15000)+((work-40)*((int)(15000*1.5)))));
		}
	//if문 나오면 else if랑 else까지 반드시 사용해야하나?
	//if 중첩문 잘 모르겠음. 
		
		/*if ((level==5)||(level==6)) {
			System.out.println("주 급여 : "+(40*20000));
			if (work>40) {
				System.out.println("주 급여 : "+((40*20000)+((work-40)*(20000*1.5))));
			}
		}
		else if ((level==7)||(level==8)) {
			System.out.println("주 급여 : " + (40*15000));
			if (work>40) {
				System.out.println("주 급여 : "+((40*15000)+((work-40)*(15000*1.5))));
			}
		}*/
		}
		
	}

//문자열로 입력한 00시간 뭐 이런거 에서 앞에 숫자00만 빼와서 계산할 수는 없나? 