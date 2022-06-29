package exam;

public class Ex175p {

	public static void main(String[] args) {

		int sum=0;
		int i=0;
		
		
		while(true) {
			if(sum>100) {
				break;
			}
			sum=sum+i;
			i++;
		} 
		 System.out.println(sum);
	}

}
