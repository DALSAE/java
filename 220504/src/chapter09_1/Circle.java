package chapter09_1;

public class Circle implements Cloneable{
	Point p;
	double r;
	
	Circle(Point p, double r){
		this.p = p;
		this.r = r;
	}
	
	@Override
	public String toString() {
		return "[p=" + p + ", r=" + r + "]";
	}

	@Override   //공변 반환
	protected Circle clone() throws CloneNotSupportedException {
		Object obj = null;
		try {
			obj = super.clone();
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		Circle c = (Circle)obj;
		c.p = new Point(this.p.x, this.p.y);
		
		return (Circle)c;
		
		}
	
	
}
