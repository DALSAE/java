package generics;

public class BoxTest {
	
	public static void main(String[] args) {
		Box<Box> b1 = new Box<Box>();
		Box b2 = new Box();
		
		//b1.setItem("hello");// ���Ͱ��� �̿��ؼ� ���� ������ �ƴ� �޼��峪 �����ڸ� ���ؼ� �� ����(�̰� ��ü����)
		//b1.setItem(35267);
		b1.setItem(b2);
		//b.item = "hello";//���� �� ����
		
		
		Box<Box> b3 = b1.getItem(); //getitem�� ���ϰ��� ������Ʈ(=��� �� �� ����) so box�� ���Ͱ��� ������ �� ����->����ȯ
	
		
	}

}
