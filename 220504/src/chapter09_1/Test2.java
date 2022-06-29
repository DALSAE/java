package chapter09_1;

public class Test2 {

	public static void main(String[] args) {
	String s = "abc";
	StringBuffer sb = new StringBuffer("ABC");
	StringBuffer sb2 = new StringBuffer("ABC");
	
	System.out.println(s.length());
	System.out.println(sb.length());
	System.out.println(sb.capacity());
	
	System.out.println(sb==sb2);
	System.out.println(sb.equals(sb2));
	String s1 = sb.toString();
	String s2 = sb2.toString();
	System.out.println(s1.equals(s2));
	
	StringBuffer ss = new StringBuffer("0123456");
	StringBuffer ss2 = ss.delete(3, 6);
	System.out.println(ss2);
	System.out.println(ss.reverse());
	
	}

}
