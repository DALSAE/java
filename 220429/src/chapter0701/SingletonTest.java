package chapter0701;

public class SingletonTest {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance(); //s12�� ������Ŵ 
		
		System.out.println(s1);
		System.out.println(s2);
		
	}

}
