package chapter07;

public class Point3D extends Point {
	int z=30;

	Point3D(){
		this(100,200,300); //다른 생성자 밑의 생성자 가져옴.
	}//super(100,200);  z=300; 을 적어도 같은 뜻이긴 함.
	Point3D(int x, int y, int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}//근데 이건 기본 형태가 아닌데 왜 부모 클래스에 기본 생성자 적어야하지?
	 //따로 생성자 호출을 안해줘서 기본생성자를 자동으로 삽입함. 근데 기본 생성자 안나와있어서 오류.
	@Override
	String getLocation() {
		//return "x :" + x + ", y :" + y + ", z :" + z;
		return super.getLocation()+", z= "+z; 
	}
	
	
}
