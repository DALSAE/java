package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		Object[] arr = {0,0,0,1,"1",2,2,3,3,3}; //��� type ����ϴ� object
		Set set = new HashSet();
		
		for(int i=0; i<arr.length; i++) {
			set.add(arr[i]); //set�� �ߺ� �����ؼ� ���� �� ������ ���� ����.
		}						//set�� type�ٸ��� �ٸ� ������ �ν���. 
		System.out.println(set);
	}

}
