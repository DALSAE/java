package step7;

import java.util.Objects;

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
		if(birth!=null)
			System.out.printf("%s : %s : %s%n",name, phoneNum,birth);
		else System.out.printf("%s : %s %n",name, phoneNum);
	}

	@Override
	public boolean equals(Object obj) { 
		if(obj instanceof Person) {//obj�� Ÿ�� üũ
			Person tmp = (Person)obj;
			return name.equals(tmp.name); //if���� return ���ʿ�!! 
		}else 
			return false;//if�� �ƴҶ�(�����϶���)return�� �� �����ֱ�!~!~!~
	}
	
	@Override
	public int hashCode() {
		return name.hashCode(); //�̸������� �ؽ��ڵ� ���� �Ѱ��༭ �ߺ��� ���̶�� �ν��ϰ� ��.
		//return Objects.hash(name);
	}

	
	
	
	
}
