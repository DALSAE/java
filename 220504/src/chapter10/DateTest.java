package chapter10;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		Date today = new Date(); //import 꼭! util date로 하기
		System.out.println(today);
		
		SimpleDateFormat sf = new SimpleDateFormat("yyyy/MM/dd");
		String td = sf.format(today);
		System.out.println(td);
		
		
	}

}
