package chapter06;

public class Methodtest {

	public static void main(String[] args) { //void:������ ���ٴ� �ǹ� 
		int [] arr= new int[10];
		
		initArr(arr); //�޼ҵ� init�� 
		printArr(arr);
		
		System.out.println("Hello");
		
	}
	static void initArr(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*10)+1;
			}
	}
	
	static void printArr(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	}


