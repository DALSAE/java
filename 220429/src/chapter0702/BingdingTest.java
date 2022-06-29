package chapter0702;

public class BingdingTest {

	public static void main(String[] args) {
		Parent p = new Child();
		Child c = new Child();
		
		System.out.println("p.x = "+p.x);
		p.method();
		
		System.out.println("c.x = "+c.x);
		c.method();
		
	}

}
