package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx02 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("김자바", 90);
		map.put("김자바", 100);
		map.put("이자바", 100);
		map.put("강자바", 80);
		map.put("안자바", 90);
		
		Set set = map.entrySet(); //set으로 만든다. 중복ㄴ순서ㄴ 
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry) it.next();
			System.out.println("이름 : "+e.getKey()+"점수 : "+e.getValue());
		}
		set = map.keySet();
		System.out.println("참가자 명단 : "+set);
		
		Collection values = map.values();
	
		System.out.println(map);
		
	}

}
