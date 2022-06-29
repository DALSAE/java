package step1;

public class Person {
	String name;
	String phoneNum;
	String birth;
	
	Person(){
		this("홍길동", "010-0000-0000", "1900/00/00"); //초기값 설정
	}
	
	Person(String name, String phoneNum, String birth){
		this.name = name;
		this.phoneNum = phoneNum; 
		this.birth = birth;
	}
	
	Person(String name, String phoneNum){
		this(name, phoneNum, null); //빈문자열 넣고싶으면 " " null은 완전한 빈값
	}
	
	void showPhoneinfo() {
		if(birth!=null && !birth.equals("")) //birth.length()!=0
			System.out.printf("%s : %s : %s%n",name, phoneNum,birth);
		
		else System.out.printf("%s : %s %n",name, phoneNum);
	}

}
