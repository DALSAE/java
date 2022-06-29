package afternoon;

public class MyMath {
	int add(int a, int b) {   //void는 필수
		int result = a+b;
		return result;    //==return a+b;
	}	
	int add2(int a, int b, int c){
		return a+b+c;
	}
	double add3(double a, double b){
		return a+b;}
		
	int subtract(int a, int b) {
		return a-b;	
	}
	//int x(int a, int b) {
	//	int result = a*b;
	//	return result;
	//}
	int multiply(int a,int b) {
		return a*b;
	}
	double divide(int a,int b) {
		return a/(double)b;
	}
	void showNum(int a, int b) {
		System.out.println("입력한 수는 %d, %d 입니다.");
	}

}
