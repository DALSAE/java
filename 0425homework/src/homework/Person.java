package homework;

public class Person {
	String name;
	String phoneNumber;
	String birth;
	
	
	Person(String name, String phonNumber, String birth){
		this.name = name;
		this.phoneNumber = phonNumber;
		this.birth = birth;
	}
	
	Person(){
		this("ȫ�浿", "010-0000-0000", "1900-00-00");
	}
	
	void showPerson() {
		System.out.printf("�̸�: %s%n��ȭ��ȣ: %s%n�������: %s%n",name,phoneNumber,birth);
	
	}
	}
