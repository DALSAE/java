package chapter07;

public class Child extends Parent{
	void method() {
		int x =20;
		
		System.out.println("x="+x);
		System.out.println("this.x="+this.x);
		System.out.println("super.x="+super.x);
	}

}
