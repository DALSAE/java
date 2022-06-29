
public class Tvtest3 {

	public static void main(String[] args) {

		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1의 channel값은 " +t1.channel+"입니다. ");
		System.out.println("t2의 channel값은 " +t2.channel+"입니다. ");
		
		t1 = t2;
		t1.channel = 7;
		System.out.println("t1의 channel값을 7로 변경하였습니다. ");
		

		System.out.println("t1의 channel값은 " +t1.channel+"입니다. ");
		System.out.println("t2의 channel값은 " +t2.channel+"입니다. ");
		
		System.out.println(t2); //같은 객체를 가리킴
		System.out.println(t1); //객체 하나에 참조변수가 두개된 것.
		
		t2.channelUp();
		System.out.println("t1의 channel값은 " +t1.channel+"입니다. ");
		System.out.println("t2의 channel값은 " +t2.channel+"입니다. ");
		
	}

}
