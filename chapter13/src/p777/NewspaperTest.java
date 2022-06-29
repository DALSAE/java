package p777;

public class NewspaperTest {

	public static void main(String[] args) {
		Newspaper paper = new Newspaper();
		
		NewsReader r1 = new NewsReader(paper);
		NewsReader r2 = new NewsReader(paper);
		
		NewsWriter w = new NewsWriter(paper);
		
		r1.start();
		r2.start();
		w.start();
		
	}

}
