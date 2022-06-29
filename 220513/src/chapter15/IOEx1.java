package chapter15;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class IOEx1 {

	public static void main(String[] args) {
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		//����Ʈ �迭�� �Ѱܾ��ϴ� ��Ʈ��
		ByteArrayInputStream input = new ByteArrayInputStream(inSrc); 
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		
		int data = 0; //�ѹ���Ʈ�� �о�� 
		while((data=input.read())!=-1) {//���̻� �о�� ������ ������ -1��ȯ�ϴϱ�. 
			output.write(data);
		}
		outSrc = output.toByteArray();
										//arraysŬ������ �޼��� tostring
		System.out.println("input source :" +Arrays.toString(inSrc));
		System.out.println("output source :" +Arrays.toString(outSrc));
		
		
		
		
	}

}
