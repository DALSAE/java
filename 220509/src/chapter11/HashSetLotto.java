
package chapter11;

import java.util.*;

public class HashSetLotto {
	public static void main(String[] arg) {
		Set set = new HashSet();
		
		for(int i=0; set.size()<6; i++) {
			int num = (int)(Math.random()*45)+1;
			set.add(new Integer(num));//������ �� �����ؼ� ���γ��°��̶� ��ġ���� Ȯ��
		}
		List list = new LinkedList(set);
		Collections.sort(list);//��ȣ ũ��� ����.sort�� list���¸� ��밡���ؼ� list����.
		System.out.println(list);
	}

}
