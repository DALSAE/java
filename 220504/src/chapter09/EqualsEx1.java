package chapter09;

public class EqualsEx1 {

	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if(v1.equals(v2))
			System.out.println("v1과 v2는 같습니다. ");
		else System.out.println("v1과 v2는 다릅니다. ");
		
		//v2=v1;
		if(v1==v2)
			System.out.println("v1과 v2는 같습니다. ");
		else System.out.println("v1과 v2는 다릅니다. ");
	}

}

class Value implements Cloneable{
	int value;
	
	Value(int value){
		this.value = value;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj!=null && obj instanceof Value)
			return value==((Value)obj).value; //obj가 부모타입의 변수라서 Value타입으로 
											//다운캐스팅 되어야함.다형성.
		 
		else return false;
	}

	@Override
	protected Object clone() {
		Object obj = null;
		try {
			obj = super.clone();
		}catch(CloneNotSupportedException e) {}
		return obj;
	}
	
}