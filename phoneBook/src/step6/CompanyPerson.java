package step6;

public class CompanyPerson extends Person{
	String company;
	
	CompanyPerson(){
	}
	CompanyPerson(String name, String phoneNum, String birth, String company){
		super(name, phoneNum, birth);
		this.company=company;
	}
	
	void showInfo() {
		System.out.printf("È¸»ç : %s", company);
	}

}
