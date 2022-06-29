package lambda;

public class MyTest {

	public static void main(String[] args) {
		
		/*
		 * MyFunction mc2 = new MyFunction() {
		 * 
		 * @Override public int max(int a, int b) {//객체는 만들었지만 return a > b ? a : b;
		 * //익명인 클래스 (7장참고) } };
		 */
		MyFunction mc3 = (int a, int b) -> a > b ? a : b;
		
		
		System.out.println(mc3.max(55, 3));
		
	}

}
