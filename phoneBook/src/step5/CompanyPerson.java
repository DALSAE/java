package step5;

public class CompanyPerson extends Person{
	String company;
	String position;
	
	CompanyPerson(){
		this("Sk", "���");
	}
	CompanyPerson(String company,String position){
	}
	
	void showInfo() {
		System.out.printf("ȸ�� : %s ���� : %s", company, position);
	}

}
