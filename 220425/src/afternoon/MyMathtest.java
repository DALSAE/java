package afternoon;

import java.util.Scanner;

public class MyMathtest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MyMath mm = new MyMath();
		int a=0;
		int b=0;
		
		System.out.println("숫자 입력1 : ");
		a = Integer.parseInt(sc.nextLine());
		
		System.out.println("숫자 입력2 : ");
		b = Integer.parseInt(sc.nextLine());
		
		System.out.println(mm.add(a, b)); //메소드 호출
		System.out.println(mm.subtract(a, b));
		System.out.println(mm.multiply(a, b));
		System.out.println(mm.divide(a, b));
		
			//int result = mm.add(5000, 1111);
			
			//System.out.println(result);
			
		//int result = mm.minus(10, 5);
		mm.showNum(a, b); 
		System.out.println(mm.add2(1, 2, 3));
		
		
	}

}
