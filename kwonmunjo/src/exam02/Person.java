package exam02;

public class Person {
	String name;
	String phoneNum;
	
	Person(String name, String phoneNum){
		this.name = name;
		this.phoneNum = phoneNum;
	}
	
	Person(){
		this("�ǹ���", "010-1234-1234");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	@Override
	public String toString() {
		return "�̸�:" + name + " ��ȭ��ȣ:" + phoneNum ;
	}
	
}
