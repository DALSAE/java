package chapter15_937;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerialEx1 {

	public static void main(String[] args) {
		FileOutputStream fos =null;
		ObjectOutputStream out =null;
		
		try {
		String fileName = "UserInfo.ser"; 
		fos = new FileOutputStream(fileName); //���� �غ�
		out = new ObjectOutputStream(fos);//��ü �غ�
		
		UserInfo u1 = new UserInfo("kwon", "1234", 10);
		UserInfo u2 = new UserInfo("won", "0000", 20);
		ArrayList<UserInfo> list = new ArrayList<UserInfo>();//�� �޾ƿ� �迭
		list.add(u1);//���� ���� !!!!!!!!!!!!!!
		list.add(u2);
		
		//out.writeObject(u1);
		//out.writeObject(u2);
		out.writeObject(list);
		
		
		}catch(IOException e) {
			e.printStackTrace();
			
		}finally {
			try {
				if(out!=null) out.close();
				if(fos!=null) fos.close();
				
			}catch(Exception e2) {
				e2.printStackTrace();
			}
			
		}
		
	}

}
