package step1;

public class PhoneBookVer01 {

	public static void main(String[] args) {
		//Person p1 = new Person();
	//	Person p2 = new Person("유관순","011-444-3434","1990/09/09");
		//Person p3 = new Person("세종대왕","011-7777-77777");
		
		Person[] p = new Person[3];
		
		p[0] = new Person();
		p[1] = new Person("유관순","011-444-3434","1990/09/09");
		p[2] = new Person("세종대왕","011-7777-77777");
		
		for(int i=0; i<p.length; i++) {
			p[i].showPhoneinfo();
		}
		
		//p1.showPhoneinfo();
		//p2.showPhoneinfo();
		//p3.showPhoneinfo();
	}
}
