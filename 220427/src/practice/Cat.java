package practice;

public class Cat {
	String name;
	int age;
	String gender;
	String color;
	
	Cat(){
		this("����", 0, "��","���"); //�⺻�� �޼ҵ忡 �ʱⰪ �־��� ��
	}
	
	Cat(String name, int age, String gender, String color){
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.color = color;
	}
	
	Cat(String name, int age, String gender){
		this(name, age, gender, null);
	}
	   				//�ٵ� ��ĳ�ʷ� �Է¹��� ���� "abc"�� �Է¹��� abc�� �ٸ��ٰ� �ν���. 
	void showInfo() {//color.length=0 �� ����
		if(color==null || color.length()==0) //color==" "�� �� �ȵǴ°���? ���ͷ� ġ�ϱ� ��. �� ""���̿� ���� �ȵ�.
			System.out.printf("����� �̸� : %s %n����� ���� : %d %n����� ���� : %s%n" ,name, age, gender);
		else	
		System.out.printf("����� �̸� : %s %n����� ���� : %d %n����� ���� : %s %n����� ��(����) : %s %n",name, age, gender, color);
	}
	

}
