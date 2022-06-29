package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		Object[] arr = {0,0,0,1,"1",2,2,3,3,3}; //모든 type 허용하는 object
		Set set = new HashSet();
		
		for(int i=0; i<arr.length; i++) {
			set.add(arr[i]); //set이 중복 허용안해서 같은 값 여러개 들어가지 않음.
		}						//set은 type다르면 다른 값으로 인식함. 
		System.out.println(set);
	}

}
