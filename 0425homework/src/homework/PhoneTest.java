package homework;

public class PhoneTest {

	public static void main(String[] args) {
		Phone p = new Phone();
		
		p.color = "white";
		p.company = "apple";
		p.setYear(2020);
		
		System.out.println("���� : " + p.color);
		System.out.println("������ : "+p.company);
		System.out.println("���� �⵵ : "+((Phone) p).getYear());
	}

}
