package Chapter1;

public class StringExam {

	public static void main(String[] args) {
		//참조형은 뉴라는 선언을 통해 객체를 선언해야함. 스트링도 참조형임. 
		String str1 = "abc";
		String str2 = new String("abc");//문자열이 들어간 주소 위치를 기억하고 있음 스트링은.
		
		//new를쓰고 스트링을 하면 무조건 새로 만듦. 근데 new 안쓰면 기존에 같은 값이 있으면 재활용해서 사용.
		//그래서 str1의 값이 100(주소위치)라고 하면 str3의 값도 같은 문자열이라 재활용해서 100을 가짐!!!!
		
		System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc"=="abc"); //그래서 이렇게 연산자==으로 하면 주소위치를 비교하는 거라 같을 수 없
		System.out.printf("str1==\"abc\" ? %b%n", str1=="abc");
		System.out.printf("str2==\"abc\" ? %b%n", str2=="abc");
		System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc"));
		System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc"));
		System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC"));
		System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC"));
		
		//%d는 불린. 참거짓 판단. %n은 줄바꿈
		// \는 바로 뒤의 문자를 그래도 출력하기위해 사용. \를 그대로 출력하려면 \\두개 입력. 
		
		//string은 워낙 자주 쓰여서 디폴트로 임폴트 됨. 그런 걸 자바.lang이라 함 
		//구글에 java api검색하면 설명서 죽 볼 ㅅ ㅜ있음 
		
	}

}
