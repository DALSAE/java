package chapter15;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamEx1 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("sample.dat");
			DataInputStream dis = new DataInputStream(fis);
			
			System.out.println(dis.readInt());
			System.out.println(dis.readFloat());
			System.out.println(dis.readBoolean());
			dis.close();
		}catch(IOException e) {
			e.printStackTrace(); //현재 코드 위치까지 어떤 함수들을 거쳐왔는지 프린트
		}//에러메세지 근원지 찾아서 단계별로 에러 출력
	}

}
