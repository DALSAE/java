package answer;

public class Num2 {

	public static void main(String[] args) {
		//홀수면 2씩 증가하거나 2씩 빼면 됨
		
		int sum=0;
		int i=1;
		
		for(i=1; i<=100;i+=2) {
			sum = sum+i;
			
		}System.out.println(sum);
		
		//while(i=0; i<=100; i++ ){
			//sum = sum+i;
			//i+=2;					
		//}
		do {
			if(i%2==1) {
				sum+=1;				
			}
			i++;		
		}while(i<=	.100);
		System.out.println(sum);
		

	}//안되면 다른 식으로 바꿔서 생각해보기 답은 없음 퓨

}
