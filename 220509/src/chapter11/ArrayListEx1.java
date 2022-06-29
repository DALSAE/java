package chapter11;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx1 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10); //import�ؾ���.
		list1.add(new Integer(5));//boxing
		list1.add(4);
		list1.add(2);
		list1.add(0);
		list1.add(1);
		list1.add(3);
		
		System.out.println(list1);
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		System.out.println(list2);
		
		Collections.sort(list1);
		Collections.sort(list2);
		print(list1,list2);
		
		System.out.println("list1.containsAll(list2): "+list1.containsAll(list2));
		
		list2.add("B");
		list2.add("C");
		list2.add(3,"A");
		print(list1,list2);
		
		list2.set(3, "AA");
		print(list1,list2);
		
		System.out.println("list1.retainAll(list2)"+list1.retainAll(list2));
		print(list1,list2);
		
		for(int i=list2.size()-1; i>=0; i--) { //i=0�����ϸ� 0��° �ڸ��� �� ������� 
			if(list1.contains(list2.get(i)))//����� 0��° �ڸ��� �� 1��° �ڸ��� ����
				list2.remove(i);			//���Ŀ� �Ȱɷ��� ������.
		}
		print(list1,list2);
	}
	
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1: "+list1);
		System.out.println("list2: "+list2);
		System.out.println();
	}
	

}
