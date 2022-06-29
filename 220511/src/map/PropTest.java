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
		
		System.out.println(prop.getProperty("language"));//�ش� Ű�� �� �ҷ���.
		
		Enumeration e = prop.propertyNames();//�ݺ��ڸ� �޾ƿԵ�?
		while(e.hasMoreElements())//���� ��� ���� ���ִ��� Ȯ��
		{String tmp = (String)e.nextElement();
		System.out.println(tmp + " : "+prop.getProperty(tmp));
		}
		System.out.println();
		
		prop.setProperty("size", "20");
		
	}

}
