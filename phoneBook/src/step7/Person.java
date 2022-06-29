package step7;

import java.util.Objects;

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
		if(birth!=null)
			System.out.printf("%s : %s : %s%n",name, phoneNum,birth);
		else System.out.printf("%s : %s %n",name, phoneNum);
	}

	@Override
	public boolean equals(Object obj) { 
		if(obj instanceof Person) {//obj의 타입 체크
			Person tmp = (Person)obj;
			return name.equals(tmp.name); //if에도 return 값필요!! 
		}else 
			return false;//if값 아닐때(거짓일때도)return될 것 적어주기!~!~!~
	}
	
	@Override
	public int hashCode() {
		return name.hashCode(); //이름같으면 해쉬코드 같게 넘겨줘서 중복된 값이라고 인식하게 함.
		//return Objects.hash(name);
	}

	
	
	
	
}
