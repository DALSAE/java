package chapter06;

public class Time {
	private int hour;  //private=���� ���ѽ�Ŵ. �ƿ� ������ �ܺο� �����Ű�� �ʴ� ��. ������.
	private int minute; //���� ���ѽ��Ѽ� ���⼭ ���� ���� �ɾ �� ����. �� Ŭ���������� ��� ����
	private float second;
	//������� 3�� 
	
	
	public int getHour() {    //���� ���� ���ϴ� �������� ���ֱ�. ���콺 ��Ŭ���ؼ� 
		return hour;
	}
	public void setHour(int hour) {
		if (hour<0 || hour >23)
			return; //���α׷� �����Ű��°�. ������ �� ���������� ����. ���� �ɸ��� �׳� �⺻�� ���� 
		
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
