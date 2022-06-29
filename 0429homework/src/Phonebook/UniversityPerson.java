package Phonebook;

public class UniversityPerson extends Person{
	String major;
	int grade;
	
	UniversityPerson(){
		this("컴퓨터공학과", 3);
	}
	UniversityPerson(String major,int grade){
		
	};
	
	void showInfo() {
		System.out.printf("전공: %s 학년: %d %n", major, grade);
	}
	
}
