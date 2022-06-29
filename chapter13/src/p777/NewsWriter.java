package p777;

public class NewsWriter extends Thread{
	Newspaper paper;
	
	NewsWriter(Newspaper paper){
		this.paper = paper;
	}

	@Override
	public void run() {
		paper.setTodayNews("문조 화이팅");
	}

}
