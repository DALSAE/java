package exam;

public class Tv {
	//속성, 특징 : 멤버변수
	String color; //클래스 만들때는 초기값 필요 ㄴㄴ 알아서 해줌
	boolean power;
	int channel;
	
	
	//기능, 액션 움직이는 것 : 멤버메소드
	void power(){			//보이드 리턴 타입이 없다.
		power = !power;		//toggle버튼하나로 누를때마다 반대상태로 만듦
	} 
	
	
	void channelUp() {
		channel++;
	}
	void channelDown() {
		channel--;
	}
	
	

}
