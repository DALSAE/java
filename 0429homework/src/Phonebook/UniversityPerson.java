package Phonebook;

public class UniversityPerson extends Person{
	String major;
	int grade;
	
	UniversityPerson(){
		this("��ǻ�Ͱ��а�", 3);
	}
	UniversityPerson(String major,int grade){
		
	};
	
	void showInfo() {
		System.out.printf("����: %s �г�: %d %n", major, grade);
	}
	
}
