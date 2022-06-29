package chp03;

public class Class4 {

	public static void main(String[] args) {

		/*int i =5;
		//i++; i = i +1 과 같은 의미 ++i;
		System.out.println(++i); //전위 후위 연산자 차이ㅇㅇ
		
		System.out.println(--i);
		System.out.println(i); */
		
		
		int i=5, j=0;
		j = i++;   //후위니까 j=i(5)가 들어가고!! 다음줄에서 ++들어가서 i는 6됨 
		//헷갈리기 쉬움 ㅠㅠ 
		System.out.println("j=i++; 실행 후, i=" + i +", j="+ j);
		
		i=5;
		j=0;
		
		j=++i;
		System.out.println("j=++i; 실행 후, i=" + i +", j="+ j);
						
	}

}
