package chapter13_Ex;

public class ThreadEx1_2 implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<500; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
	

}
