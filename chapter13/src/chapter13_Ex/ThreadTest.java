package chapter13_Ex;

public class ThreadTest {

	public static void main(String[] args) {
		Sum s = new Sum();
		
		AdderThread t1 = new AdderThread(s,1,50);
		AdderThread t2 = new AdderThread(s,51,100);
		
		t1.start();
		t2.start();
		
		try{
			t1.join();
			t2.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("1~100?????? ??: "+s.getNum());
	}

}
