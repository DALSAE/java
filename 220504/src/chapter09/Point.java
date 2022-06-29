package chapter09;

public class Point implements Cloneable{
	int x,y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	@Override
		public String toString() {
			return "(" + x + "," + y + ")";
		}
		
	@Override
	protected Object clone(){
		Object obj = null;
		try {
			obj = super.clone();
		}catch(CloneNotSupportedException e) {}
		return obj;
	}

	
}
