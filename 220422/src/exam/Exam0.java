package exam;

public class Exam0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr=new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=i;
			System.out.print(arr[i]);
		}
		
		System.out.println();
		for(int i=0; i<100; i++) {
			int tmp = arr[0];
			int n =(int)(Math.random()*10);
			arr[0] = arr[n];
			arr[n]=tmp;
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}

	}//p197

}
