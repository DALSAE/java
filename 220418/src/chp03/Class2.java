package chp03;

public class Class2 {

	public static void main(String[] args) {
		char ch = 'Y';
		//byte code = (byte)ch; //int char서로 형변환 가능 (int) 빼도 자동 형변환 해줌.
		//char은 2byte int는 4byte. char이 작은 거니까 알아서 자동 형변환 ㅇㅇ.  크기 줄어드는건 강제로 해야함.
		
		int i = 500; //128dms 자바에서는 기본적으로 인트타입으로 저장.형변환 다운캐스팅. 큰사이즈 억지로 형변화하면 오버플로우 부분의 값 소실됨.
				//오버플로우 된 부분 값 소실되면 데이터 타입 큰걸로 바꿀 수 밖에 업음.
		boolean b = false; // 불린은 형변환 ㄴㄴ. 
		
		
		float f = 5.5f; //따로 f 안붙이면 기본인 double형으로 적혀서 오류뜸.
		double d =10.9;
		
		//f= (float)d;
		//f = i; //딱 떨어지는 500이 실수형 됨.
		
		i = (int)f; //실수를 정수에 담는 것은 자동 형변환ㄴㄴ.
	
		//정수 = 실수; 다운캐스팅해야해서 강제 형변환 필요. 
		//실수 = 정수; 자동형변환 ㅇㅇ 
		
		System.out.println(i); //A의 유니코드 값 나옴 = 65.
		
	}
}
