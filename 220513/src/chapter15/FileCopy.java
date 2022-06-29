package chapter15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.*;

public class FileCopy {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\1\\eclipse-workspace\\220513\\src\\chapter15");
			FileOutputStream fos = new FileOutputStream("FileCopy.bak");
		
		int data=0;
		while((data=fis.read())!=-1) {
			fos.write(data);
		}
		fis.close();
		fos.close();
		
	}catch(IOException e) {
		e.printStackTrace();
		}
		
	}

}
