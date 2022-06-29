package chapter15;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class IOEx1 {

	public static void main(String[] args) {
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		//바이트 배열을 넘겨야하는 스트림
		ByteArrayInputStream input = new ByteArrayInputStream(inSrc); 
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		
		int data = 0; //한바이트를 읽어옴 
		while((data=input.read())!=-1) {//더이상 읽어올 데이터 없으면 -1반환하니까. 
			output.write(data);
		}
		outSrc = output.toByteArray();
										//arrays클래스의 메서드 tostring
		System.out.println("input source :" +Arrays.toString(inSrc));
		System.out.println("output source :" +Arrays.toString(outSrc));
		
		
		
		
	}

}
