package chapter07;

public class Point3D extends Point {
	int z=30;

	Point3D(){
		this(100,200,300); //�ٸ� ������ ���� ������ ������.
	}//super(100,200);  z=300; �� ��� ���� ���̱� ��.
	Point3D(int x, int y, int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}//�ٵ� �̰� �⺻ ���°� �ƴѵ� �� �θ� Ŭ������ �⺻ ������ ���������?
	 //���� ������ ȣ���� �����༭ �⺻�����ڸ� �ڵ����� ������. �ٵ� �⺻ ������ �ȳ����־ ����.
	@Override
	String getLocation() {
		//return "x :" + x + ", y :" + y + ", z :" + z;
		return super.getLocation()+", z= "+z; 
	}
	
	
}
