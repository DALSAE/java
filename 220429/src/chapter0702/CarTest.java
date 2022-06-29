package chapter0702;

public class CarTest {

	public static void main(String[] args) {
		Car car = null; //참조할 객체가 아직 없음 참조형 변수 4바이트
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		car = fe; //new FireEngine()을 car랑 fe가 같이 가리킴
		fe.water();
		//car.water();
		car.door=2;
		System.out.println(fe.door);
		
		fe2 = (FireEngine)car;//상속관계라서 다운캐스팅이 가능함,, 
		
		fe2.water();
		
		
	}

}
