package map;

import java.util.Enumeration;
import java.util.Properties;

public class PropTest {

	public static void main(String[] args) {
		Properties prop = new Properties();
		
		prop.setProperty("timeout", "20");
		prop.setProperty("language", "kr");
		prop.setProperty("size", "10");
		prop.setProperty("capacity", "10");
		
		System.out.println(prop);
		
		System.out.println(prop.getProperty("language"));//해당 키의 값 불러옴.
		
		Enumeration e = prop.propertyNames();//반복자를 받아왔따?
		while(e.hasMoreElements())//다음 요소 ㄱ밧 더있는지 확인
		{String tmp = (String)e.nextElement();
		System.out.println(tmp + " : "+prop.getProperty(tmp));
		}
		System.out.println();
		
		prop.setProperty("size", "20");
		
	}

}
