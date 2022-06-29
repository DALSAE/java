package exam;

import java.util.Arrays;

public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {1,2,3,4,5};
		int [] arr2=new int[10];
		
		System.arraycopy(arr1, 2, arr2, 5, 2);
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		char [] a= {'a','b','c','d','e'};
		char [] b = {'1','2','3','4','5'};
		System.out.println(a);
		System.out.println(b);
		
		char [] result= new char[a.length + b.length];
		System.arraycopy(a, 0, result, 0, a.length);
		System.arraycopy(b, 0, result, 5, b.length);
		System.out.println(result);
		
		System.arraycopy(a, 0, b, 0, a.length);
		System.out.println(b);
		
		System.arraycopy(a, 0, b, 2, 3);
		System.out.println(b);
	

}
}
