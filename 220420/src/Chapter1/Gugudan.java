package Chapter1;

public class Gugudan {

	public static void main(String[] args) {

		for (int i=1; i<10; i++) {
			System.out.printf("2 X %d = %d \n", i, 2*i);
		}
		for (int dan=2; dan<10; dan++) {
			for(int num=1; num<10; num++) {
				System.out.printf("%d X %d = %d \n", dan, num, dan*num);
			}
		}
		
		
	}
	

}
