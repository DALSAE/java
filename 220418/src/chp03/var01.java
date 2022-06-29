package chp03;

public class var01 {

	public static void main(String[] args) {
		//변수 선언
		int kor = 85; //개발자들은 반복 싫어함. 한줄에 쓸 수 있으면 한줄에 쓰기
		int eng = 80; //int kor=80, eng=80, mat=80;   
		int mat = 80;
		int tot = kor + eng + mat;
		double avg = tot / 3.0;
		//정수로 나누면 정수값으로 나오게 됨. 실수형으로 값 나오게 하려면 계산식에서 실수형으로 적기. 3.0
		String name = "권문조"; 
		//문자열 변수가  필요할 때 사용. string은 한번 선언하면 불변
		
		/* System.out.println(kor+eng+mat); 계산식만 적어서 바로 출력 가능 
		System.out.println((kor+eng+mat)/3);
		그러나 System.out.println("총점: "+kor+eng+mat); 
		이 형태는 총점 계산이 안되고 총점: 858080 이렇게 문자열로 쭉 나열됨
		
		그러나 System.out.println("평균: " +(kor+eng+mat)/3); */
		
		//처리
		//tot = kor + eng + mat;
		//avg = tot / 3;
		
		//출력
		System.out.println("총점: " +tot);
		System.out.println("평균: " +avg); 
		//소수점까지 구하려면 선언할 때 int아닌 double으로 쓰기
		System.out.println("이름: " +name);
	}

}
