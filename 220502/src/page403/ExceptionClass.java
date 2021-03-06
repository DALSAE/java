package page403;

public class ExceptionClass {

	public static void main(String[] args) throws ArithmeticException {
		try{
				method();
		}catch(ArithmeticException e) {
			System.out.println("0");
		}
		
		/*try {//try안 문장에서 오류나면 캐치 블럭에서 잡아서 캐치 블럭 안이 실행.
			System.out.println(number/0);
		} catch (ArithmeticException e) {//수학적 계산 오류
			System.out.println("0으로 나눌 수 없음");
		}//오류가 발생했지만 처리를 해준 것 
		catch(NullPointerException e) {//널값 오류
			System.out.println("NULL");
		}catch(Exception e) {//모든 오류. 마지막으로 캐치하게 함. 
			System.out.println("오류발생");//이걸 제일 위에두면 세세한 오류 잡지못함
		}//해당하는 캐치에 가서 오류면 캐치 안을 실행하고 나옴
		*/
	}
	
static void method() throws ArithmeticException, Exception{
	int number = 100;
	int result = 0;
	
	for(int i=0; i<10; i++) {
		//System.out.println(result);
		//number/0~9사이 임의의 수 
		try {
			result = number / (int)(Math.random()*10);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("0");
		}
	}
}

}
