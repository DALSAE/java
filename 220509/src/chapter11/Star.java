package chapter11;

public class Star {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {// 출력할 줄 개수
			for (int j=0; j<=i; j++)// 별 개수
				System.out.print("*");
		}
		System.out.println();

	}
}
