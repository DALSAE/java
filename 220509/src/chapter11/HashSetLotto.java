
package chapter11;

import java.util.*;

public class HashSetLotto {
	public static void main(String[] arg) {
		Set set = new HashSet();
		
		for(int i=0; set.size()<6; i++) {
			int num = (int)(Math.random()*45)+1;
			set.add(new Integer(num));//만들어둔 값 저장해서 새로나온값이랑 겹치는지 확인
		}
		List list = new LinkedList(set);
		Collections.sort(list);//번호 크기순 정렬.sort는 list형태만 사용가능해서 list만듦.
		System.out.println(list);
	}

}
