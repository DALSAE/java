package chapter0702;

public class CarTest {

	public static void main(String[] args) {
		Car car = null; //������ ��ü�� ���� ���� ������ ���� 4����Ʈ
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		car = fe; //new FireEngine()�� car�� fe�� ���� ����Ŵ
		fe.water();
		//car.water();
		car.door=2;
		System.out.println(fe.door);
		
		fe2 = (FireEngine)car;//��Ӱ���� �ٿ�ĳ������ ������,, 
		
		fe2.water();
		
		
	}

}
