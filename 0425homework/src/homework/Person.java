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
		this("홍길동", "010-0000-0000", "1900-00-00");
	}
	
	void showPerson() {
		System.out.printf("이름: %s%n전화번호: %s%n생년월일: %s%n",name,phoneNumber,birth);
	
	}
	}
