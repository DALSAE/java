package chapter07;

public class PointTest {

	public static void main(String[] args) {
		Point p = new Point();
		Point3D c = new Point3D();
		
		System.out.println(p.getLocation());
		System.out.println(c.getLocation());
		
		Point3D p3 = new Point3D();//객체만들어서 초기화
		System.out.println("p3.x="+p3.x);
		System.out.println("p3.y="+p3.y);
		System.out.println("p3.z="+p3.z);
		
	}

}
