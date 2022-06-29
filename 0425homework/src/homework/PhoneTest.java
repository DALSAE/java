package homework;

public class PhoneTest {

	public static void main(String[] args) {
		Phone p = new Phone();
		
		p.color = "white";
		p.company = "apple";
		p.setYear(2020);
		
		System.out.println("색깔 : " + p.color);
		System.out.println("제조사 : "+p.company);
		System.out.println("제조 년도 : "+((Phone) p).getYear());
	}

}
