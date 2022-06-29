package set;

import java.util.HashSet;
import java.util.Objects;

public class HashSetEx4 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		set.add(new String("abc"));
		set.add(new String("abc"));
		set.add(new Person2("David",10));
		set.add(new Person2("David",10));
		
		System.out.println(set);
	}

}
class Person2{
	String name;
	int age;
	
	Person2(String name, int age){
		this.name = name;
		this.age = age;
	}
	public boolean equals(Object obj) {
		if(obj instanceof Person2) { //� Ŭ�������� � Ŭ������ ��ӹ޾Ҵ��� ��� t/f
			Person2 tmp = (Person2)obj;
			return name.equals(tmp.name) && age==tmp.age;
		}
		return false;
	}
	public int HashCode() {
		//return (name+age).hashCode();
		return Objects.hash(name, age); 
	}
	public String toString() {//��ü�� ���� ����,���� ���ڿ��� ����� ��������. 
		return name+":"+age;
	}
}