package chapter11;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		int [] arr = {0,1,2,3,4};
		int [] arr2 = {0,1,2,3,4};		//�ܼ��� ��ü�� ����. 
										//�� �޼ҵ�� �ּҰ��� ���ϱ⶧���� �ٸ����̶�� ���.
		System.out.println(arr.equals(arr2)); //object class�� equals. 
		System.out.println(Arrays.equals(arr, arr2));//���� ���밪 ���� ���� �� �޼ҵ�. 
		System.out.println();
		
		String[][] str = {{"aaa","bbb"},{"AAA","BBB"}};
		String[][] str2 = {{"aaa","bbb"},{"AAA","BBB"}};
		//System.out.println(str[0]); //������ �迭�̶� �̷��� ����ϸ� �ּҰ� ���.
		//System.out.println(str[0][0]);//���밪 ����Ϸ���
		System.out.println(str.equals(str2));
		System.out.println(Arrays.deepEquals(str, str2));
		
	}

}
