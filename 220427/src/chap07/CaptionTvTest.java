package chap07;

public class CaptionTvTest {

	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		
		ctv.channel = 10;
		ctv.channelUp();
		System.out.println(ctv.channel);
		ctv.displayCaption("Hello, World"); //true�� ���༭ ��¤���
		ctv.caption = true;
		ctv.displayCaption("Hello, World");// true���ְ� displaycaption���� ��¤�
		
		
	}

}
