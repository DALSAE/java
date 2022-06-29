package step8;

public class UniversityPerson extends Person{
	String major;
	int grade;
	
	UniversityPerson(){
	}
	UniversityPerson(String name, String phoneNum, String birth, String major,int grade){
		super(name, phoneNum, birth);
		this.major=major;
		this.grade=grade;
	}
	
	void showInfo() {
		System.out.printf("전공: %s 학년: %d %n", major, grade);
	}
	
}
