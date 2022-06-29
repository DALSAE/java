package chapter11;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		int [] arr = {0,1,2,3,4};
		int [] arr2 = {0,1,2,3,4};		//단순히 객체를 비교함. 
										//이 메소드는 주소값을 비교하기때문에 다른값이라고 출력.
		System.out.println(arr.equals(arr2)); //object class의 equals. 
		System.out.println(Arrays.equals(arr, arr2));//안의 내용값 비교할 때는 이 메소드. 
		System.out.println();
		
		String[][] str = {{"aaa","bbb"},{"AAA","BBB"}};
		String[][] str2 = {{"aaa","bbb"},{"AAA","BBB"}};
		//System.out.println(str[0]); //이차원 배열이라서 이렇게 출력하면 주소값 출력.
		//System.out.println(str[0][0]);//내용값 출력하려면
		System.out.println(str.equals(str2));
		System.out.println(Arrays.deepEquals(str, str2));
		
	}

}
