package chapter11;

import java.util.*;

public class ArrayListEx2 {

	public static void main(String[] args) {
		final int LIMIT = 10; //상수
		String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ";
		int length = source.length();
		//System.out.println(length);
		
		List list = new ArrayList(length/LIMIT+10);//타입 틀려도 상속관계라서 오류 안남.
		//System.out.println(list.size());
		
		for(int i=0; i<length; i+=LIMIT) {//잘라서 arraylist에 담으려고 for구문.
			if (i+LIMIT < length)
				list.add(source.substring(i, i+LIMIT));//(시작위치,개수)
			else list.add(source.substring(i));
		}
		for(int i=0; i<list.size(); i++)
			System.out.println(list.get(i));
	}

}
