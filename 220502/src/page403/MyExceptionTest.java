package page403;

import java.util.Scanner;

public class MyExceptionTest {

	public static void main(String[] args) {
		try{
			method();
		}catch(MyException e) {
			System.out.println(e.getErrCode());
			System.out.println(e.getMessage());
		}
		
	}
	static void method() throws MyException {
		Scanner sc = new Scanner(System.in);
		System.out.println("1 �Ǵ� 0�� �Է��Ͻÿ� : ");
		int input = Integer.parseInt(sc.nextLine());
		if(input==1)
			throw new MyException("���� ����");
		else
			System.out.println("����");
	}
}
