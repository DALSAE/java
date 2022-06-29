package chapter09_1;

import java.util.Arrays;
import java.util.StringJoiner;

public class StringTest {

	public static void main(String[] args) {
		String animals = "dog,cat,bear,rabit,tiger";
		String[] arr = animals.split(",");
		
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[3]);
		System.out.println(String.join("-", arr));
		
		StringJoiner sj = new StringJoiner("/","[","]");
		for(String s : arr)//for each구문 향상된 for구문. 
			sj.add(s);
		
		System.out.println(sj.toString());
	}

}
