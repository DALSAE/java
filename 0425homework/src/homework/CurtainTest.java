package homework;

import java.util.Scanner;

public class CurtainTest {

	public static void main(String[] args) {
		Curtain c = new Curtain();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		c.color = sc.nextLine();
		System.out.print("��� ���� : ");
		c.setSeason(sc.nextLine());
		System.out.print("���� : ");
		c.width = Integer.parseInt(sc.nextLine());
		System.out.print("���� : ");
		c.height = Integer.parseInt(sc.nextLine());
		
		System.out.println("Ŀ���� ������ "+c.color+"�̰� ��� ������ "+c.getSeason()+"�Դϴ�.");
		System.out.println("���� ���̴� "+c.width+"�̰� ���� ���̴� "+c.height+"�Դϴ�.");
		
	}

}
