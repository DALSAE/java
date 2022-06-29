package chapter09;

public class EqualsEx1 {

	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if(v1.equals(v2))
			System.out.println("v1�� v2�� �����ϴ�. ");
		else System.out.println("v1�� v2�� �ٸ��ϴ�. ");
		
		//v2=v1;
		if(v1==v2)
			System.out.println("v1�� v2�� �����ϴ�. ");
		else System.out.println("v1�� v2�� �ٸ��ϴ�. ");
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
			return value==((Value)obj).value; //obj�� �θ�Ÿ���� ������ ValueŸ������ 
											//�ٿ�ĳ���� �Ǿ����.������.
		 
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