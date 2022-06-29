package munjo;

public class MyFirst {

	public static void main(String[] args) {
		//변수 선언과 초기화: 변수타입 이름=초기값
		int age = 0; //정수 기본은 int, =은 대입 연산자 ==이라고 적어야 같다는 의미
		double height = 0.0; //실수 기본 변수는 double임
		//float 하면 오류 뜸. 자바에서 실수형은 기본이 더블이라서. float타입 쓰려면 뒤에 f붙이기 
		char result = 'Y'; //char는 글ㅈㅏ딱 한개만 넣을 수 있음 
		boolean result2 = false; 
		//참 거짓을 나타냄 변수 같은 이름 못씀 뭐 문조2 이런식으로 써야하고 숫자는 젤 앞에 못옴
		
		//정수 기본이 int고 실수 기본이 double이니가 저장공간 지우겠다고 
		//더 작은 byte float쓰면 크기 줄이는 과정 한번 더 거치는거라 더 복잡해지는 것임.
		
		age = 30; //final로 고정해버렸는데 값 별화시키면 오류 뜸
		height = 161.5; //float형태 쓰려면 f붙이기
		result2= true;
		//변수 갈색은 사용자가 설정한 변수 이름임 빨간색은 자바가 이미 설정해둔 이름이라 사용 못함
		
		System.out.println("나이: " + age);//"안에 넣으면 그 글자 그대로 출력됨
		System.out.println("키: " +height);
		System.out.println("결과: " +result);
		System.out.println("결과2: " +result2);
		System.out.println(age > 50); //조건에 맞춰 t or f나옴
	}

}
