package chapter09;

import java.util.Arrays;

public class CloneEx2 {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5};
		int [] arrClone = arr.clone();
		int [] arr2 = new int[arr.length];
		
		System.out.println(arr);
		System.out.println(arrClone);
		System.out.println(arr2);
		System.arraycopy(arr, 0, arr2, 0, arr.length); //범위 정해서 원하는 곳부터 복사함.
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arrClone));
		
		arrClone [0] = 6;
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arrClone));
	}

}
