package chp03;

public class Class3 {

	public static void main(String[] args) {
		
		int x= 50;
		int y = 3;
		int z = 4;
		
		
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/(double)y); //정수 나누기 정수는 정수로 결과 나옴. 소수점 실수 보고싶으면 둘 중 하나 실수로 만들어야함. 
		System.out.println(x%y);
		System.out.println(z >> 2);//시프트 연산자 이진수 나열에서 왼쪽으로 자리 두번 옮기면 1이 4가됨(2의 제곱)
		
		System.out.println(true || (z>y)); 
			
		
	}

}
