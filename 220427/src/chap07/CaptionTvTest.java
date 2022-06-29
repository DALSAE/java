package chap07;

public class CaptionTvTest {

	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		
		ctv.channel = 10;
		ctv.channelUp();
		System.out.println(ctv.channel);
		ctv.displayCaption("Hello, World"); //true값 안줘서 출력ㄴㄴ
		ctv.caption = true;
		ctv.displayCaption("Hello, World");// true값주고 displaycaption쓰니 출력ㅇ
		
		
	}

}
