package chp03;

public class Class5 {

	public static void main(String[] args) {
		/* 제어문 
		 * 조건문: if(조건) { 참이면 이 안의 식 계산 거짓이면 빠져나가서 바깥의 식만 계산한 답출력. 만약 이프안의 계산 식이 하나일때는 괄호 생략 가능} 
		 * 		 만약 if구문에서 거짓일 떄 반드시 해야하는 계산 있으면 if(){}뒤에 바로 else {계산식}
		 * 		다른 조건 만족할 때 계산할 식이 따로 있다면 else if(조건){계산식} . else if는 여러번 반복 가능.
		 * switch */

		
		int x =10, y = 20;
		
		if (x < y) {
			System.out.println("x가 y보다 작습니다. ");
			System.out.println("힝입니다. ");
		} else {
			System.out.println("x가 y보다 큽니다. ");
		}
		System.out.println("END");
	}

}
