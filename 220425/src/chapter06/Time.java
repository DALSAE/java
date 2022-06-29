package chapter06;

public class Time {
	private int hour;  //private=접근 제한시킴. 아워 변수를 외부에 노출시키지 않는 것. 은닉함.
	private int minute; //접근 제한시켜서 여기서 값에 조건 걸어서 값 세팅. 이 클래스에서만 사용 가능
	private float second;
	//멤버변수 3개 
	
	
	public int getHour() {    //직접 접근 못하니 간접으로 값넣기. 마우스 우클릭해서 
		return hour;
	}
	public void setHour(int hour) {
		if (hour<0 || hour >23)
			return; //프로그램 종료시키라는거. 밑으로 더 못내려가고 나감. 여기 걸리면 그냥 기본값 나옴 
		
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		if(minute<0 || minute>60)
			return;
		this.minute = minute;
	}
	public float getSecond() {
		return second;
	}
	public void setSecond(float second) {
		if(second<0.0f || second>60.0f)
			return;
		this.second = second;
	}
	
	public void showTime() {
		System.out.printf("%d:%d:%f%n", hour, minute, second);
		
	}
	
	
	

}
