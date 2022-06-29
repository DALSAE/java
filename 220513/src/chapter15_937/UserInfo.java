package chapter15_937;

import java.io.Serializable;

public class UserInfo implements Serializable{
	String name;
	String password;
	int age;
	
	public UserInfo(String name, String password, int age) {
		super();
		this.name = name;
		this.password = password;
		this.age = age;
	}


	@Override
	public String toString() {
		return "(" +name +","+ password+ ","+ age + ")";
	}
	

}
