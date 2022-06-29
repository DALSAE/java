package generics;

public class BoxTest {
	
	public static void main(String[] args) {
		Box<Box> b1 = new Box<Box>();
		Box b2 = new Box();
		
		//b1.setItem("hello");// 세터게터 이용해서 직접 접근이 아닌 메서드나 생성자를 통해서 값 저장(이게 객체지향)
		//b1.setItem(35267);
		b1.setItem(b2);
		//b.item = "hello";//직접 값 설정
		
		
		Box<Box> b3 = b1.getItem(); //getitem은 리턴값이 오브젝트(=모든 값 다 가능) so box가 리터값인 왼쪽이 더 작음->형변환
	
		
	}

}
