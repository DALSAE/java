package p777;

public class NewsReader extends Thread{
	Newspaper paper;
	
	NewsReader(Newspaper paper){
		this.paper = paper;
	}

	@Override
	public void run() {
		System.out.println("������ �Ѹ���: "+paper.getTodayNews());
	}
	
	
}
