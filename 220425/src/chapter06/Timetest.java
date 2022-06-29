package chapter06;

public class Timetest {

	public static void main(String[] args) {//main이 메소드임
		Time t = new Time();
		
		t.setHour(50); //t.hour = 50;
		t.setMinute(67); //t.minute = 67;
		t.setSecond(66); //t.second = 66;
		
		t.setHour(22);
		t.setMinute(30);
		t.setSecond(11);
		
		System.out.println(t.getHour());
		System.out.println(t.getMinute());
		System.out.println(t.getSecond());
		
		t.showTime();

		
	}

}
