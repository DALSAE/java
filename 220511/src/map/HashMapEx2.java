package map;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx2 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("id�� password�� �Է����ּ���");
			System.out.print("Id : ");
			String id = sc.nextLine().trim();
			
			System.out.print("password : ");
			String password = sc.nextLine().trim();
			System.out.println();
			
			if(!map.containsKey(id)) {
				System.out.println("�Է��Ͻ� id�� �������� �ʽ��ϴ� " + " �ٽ� �Է����ּ���");
				continue;
			}
			if(!map.get(id).equals(password)) {//map�� ���̵��й�ȣ�� �ѽ��̶� �� �ּҿ� ����
				System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ� �ٽ� �Է����ּ��� ");
				continue;
			}else {
				System.out.println("id�� ��й�ȣ�� ��ġ�մϴ�. ");
			}break;
		}
		
	}

}
