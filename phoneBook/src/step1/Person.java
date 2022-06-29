package step1;

public class Person {
	String name;
	String phoneNum;
	String birth;
	
	Person(){
		this("ȫ�浿", "010-0000-0000", "1900/00/00"); //�ʱⰪ ����
	}
	
	Person(String name, String phoneNum, String birth){
		this.name = name;
		this.phoneNum = phoneNum; 
		this.birth = birth;
	}
	
	Person(String name, String phoneNum){
		this(name, phoneNum, null); //���ڿ� �ְ������ " " null�� ������ ��
	}
	
	void showPhoneinfo() {
		if(birth!=null && !birth.equals("")) //birth.length()!=0
			System.out.printf("%s : %s : %s%n",name, phoneNum,birth);
		
		else System.out.printf("%s : %s %n",name, phoneNum);
	}

}
