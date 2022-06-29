package TestExam;

public class ClassTest {

	public static void main(String[] args) {
		Shape s = new Circle();
		Circle c = new Circle();
		
		s.draw();
		s.draw();
		c.draw();
		c.sayCircle();
	}

}
