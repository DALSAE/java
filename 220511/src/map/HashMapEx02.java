package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx02 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("���ڹ�", 90);
		map.put("���ڹ�", 100);
		map.put("���ڹ�", 100);
		map.put("���ڹ�", 80);
		map.put("���ڹ�", 90);
		
		Set set = map.entrySet(); //set���� �����. �ߺ��������� 
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry) it.next();
			System.out.println("�̸� : "+e.getKey()+"���� : "+e.getValue());
		}
		set = map.keySet();
		System.out.println("������ ��� : "+set);
		
		Collection values = map.values();
	
		System.out.println(map);
		
	}

}
