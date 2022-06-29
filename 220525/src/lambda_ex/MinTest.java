package lambda_ex;

public class MinTest {

	public static void main(String[] args) {
		MyMin m = (a, b) -> a < b ? a : b;
		
		System.out.println(m.min(3, -10));
	}

}
