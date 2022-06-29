package chap07;

public class polyTest {//다형성 테스트

	public static void main(String[] args) {
		Tv t = new Tv();
		CaptionTv ct = new CaptionTv();
		
		Tv t2 = new CaptionTv();//부모타입으로 자식 
	}

}
