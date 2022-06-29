package homework;

import java.util.Scanner;

public class CurtainTest {

	public static void main(String[] args) {
		Curtain c = new Curtain();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("색깔 : ");
		c.color = sc.nextLine();
		System.out.print("사용 계절 : ");
		c.setSeason(sc.nextLine());
		System.out.print("가로 : ");
		c.width = Integer.parseInt(sc.nextLine());
		System.out.print("세로 : ");
		c.height = Integer.parseInt(sc.nextLine());
		
		System.out.println("커텐의 색깔은 "+c.color+"이고 사용 계절은 "+c.getSeason()+"입니다.");
		System.out.println("가로 길이는 "+c.width+"이고 세로 길이는 "+c.height+"입니다.");
		
	}

}
