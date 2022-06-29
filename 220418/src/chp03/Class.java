package chp03;

public class Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 20;
		int z =0;
		
		System.out.printf("x=%d y=%d \n", x,y);
		
		//x¿Í y Ä¡È¯
		z=x;
		x=y;
		y=z; 
		
		System.out.printf("x=%d y=%d", x,y);
	}

}
