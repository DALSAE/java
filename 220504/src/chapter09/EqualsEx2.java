package chapter09;

public class EqualsEx2 {

	public static void main(String[] args) {
		Person p1 = new Person(8011081111222L);
		Person p2 = new Person(8011081111222L);
		
		if(p1.equals(p2)) {//메소드 EQUALS를 오버라이딩해서 주소값이 아닌 입력된 id값을 비교하게됨
			System.out.println("같습니다");
		}else System.out.println("다릅니다");
		
		if(p1==p2) { //Person클래스에서 오버라이딩 없이는 p1.equals(p2)과 같은 의미
			System.out.println("같습니다");
		}else System.out.println("다릅니다");
	}

}
