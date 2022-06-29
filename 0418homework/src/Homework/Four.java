package Homework;

import java.util.Scanner;

public class Four {

	public static void main(String[] args) {
		//본봉과 직급을 입력받아 세금을 공제한 다음 실수령액을 출력
		//직급이 7,8급인 경우 세금은 8%, 직급이 5,6급인경우 세급은 12%
		
		Scanner sc = new Scanner(System.in);
		String level;
		int money=0, tax=0, real=0;
		
		System.out.print("직급 : ");  //입력받은 직급 숫자를 어떻게 "ㅇ급"형태로 바로 출력하지?
		level = sc.nextLine();  //여기서 형태를 지정해서 입력할 수 있는 방법은 없나
		//System.out.println(level + "급");		  //걍 입력하는 사람이 0급 이렇게 입력해야만 하는가? 
		
		System.out.print("본봉 : ");
		money = Integer.parseInt(sc.nextLine());
		
		 if ((level.equals("5급")==true)||(level.equals("6급")==true)) {
			tax = 12; //int형태에는 % 넣을 수 없대
			real = (int)(money * 0.88);//0.12가 실수니까 (int)붙여서 정수형으로 바꿔! 첨엔 왜 안됐냐ㅡㅡ
			//정수형으로 바꿀 때 (int)앞에 붙이고 계산식에도 전체 ()괄호 쳐주기!! 
			//다 더블로 만들면안되나? 근데,., 다 더블로 나오면 .0형태로 출력이잖어. 룰력 예시는 정수로 딱 떨어지는디..
			System.out.println("실수령액(세금" +tax+ "%적용) : " + real);
		}
		 else if ((level.equals("7급")==true)||(level.equals("8급")==true)) {
				tax = 8; 
				real = (int)(money * 0.92);
				System.out.println("실수령액(세금" +tax+ "%적용) : " + real);
			}
		
	}

}
