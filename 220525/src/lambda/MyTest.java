package lambda;

public class MyTest {

	public static void main(String[] args) {
		
		/*
		 * MyFunction mc2 = new MyFunction() {
		 * 
		 * @Override public int max(int a, int b) {//��ü�� ��������� return a > b ? a : b;
		 * //�͸��� Ŭ���� (7������) } };
		 */
		MyFunction mc3 = (int a, int b) -> a > b ? a : b;
		
		
		System.out.println(mc3.max(55, 3));
		
	}

}
