package chapter09;

public class Person {
	long id;
	
	Person(long id){
		this.id = id;
	}

	@Override //컴파일러가 해석할 수 있는 주석
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Person) {
			return id == ((Person)obj).id;//대입이 아니라 값비교라서 ==
		}else
			return false;
	}
}
