package step5;

public class CompanyPerson extends Person{
	String company;
	String position;
	
	CompanyPerson(){
		this("Sk", "사원");
	}
	CompanyPerson(String company,String position){
	}
	
	void showInfo() {
		System.out.printf("회사 : %s 직급 : %s", company, position);
	}

}
