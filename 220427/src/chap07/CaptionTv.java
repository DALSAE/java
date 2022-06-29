package chap07;

public class CaptionTv extends Tv{ //»ó¼Ó
	boolean caption;
	
	void displayCaption(String text) {
		if(caption==true) {
			System.out.println(text);
		}
	}

}
