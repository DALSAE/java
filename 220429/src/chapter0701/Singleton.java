package chapter0701;

public class Singleton {//여러 객체 만들어도 하나의 객ㄱ체로만 사용하도록 
	private static Singleton s;
	private Singleton(){}
	
	public static Singleton getInstance() {//리턴타입 자기자신. 싱글턴
		if(s==null) s=new Singleton();
		return s;//조건 만족 못할때도 s값 반환
	}
}
//생성자 프라이빗으로 만들기 
//자기자신을 가리키는 참조변수 스태틱 자기자신 타입의으로 선언
//외부에서 접근하도록 퍼블릭 , 스태틱 언제나 접근하도록. 내이름 타입의 겟인스턴스 메소드 만들
//메소드에 조건 값이 널이면 새로운 싱글톤 만들고 조ㅓ건 만족 못해도 리턴 새로운 싱글턴값 나오게