package chapter09;

public class HashCodeEx1 {

	public static void main(String[] args) {//stringŬ���� Ư¡
		String str1 = new String ("abc");//��������
		String str2 = "abc";
		
		System.out.println(str1.equals(str2));
		System.out.println(str1==str2);
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(str2.hashCode());
	}

}
