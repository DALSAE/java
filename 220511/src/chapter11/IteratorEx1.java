package chapter11;

import java.util.ArrayList;
import java.util.ListIterator;

public class IteratorEx1 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		
		ListIterator it = list.listIterator();
		
		//for(int i=0; i<list.size(); i++) {
		//	System.out.println(list.get(i));
		//}
		
		//Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());//다음으로 가서 데이터를 읽어오는 것까지 함.
		}
		
		System.out.println();
		while(it.hasPrevious()) {
			System.out.println(it.previous());
		}
	
	}

}
