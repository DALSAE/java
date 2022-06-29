package homework;

public class SocketTest {

	public static void main(String[] args) {
		Socket [] s = new Socket[4];
		
		for(int i=0; i<s.length; i++) {
			s[i] = new Socket("black",1,"square");
			s[i].number = i+1;
		}
		for (int i=0; i<s.length; i++) {
			System.out.printf("s[%d]= ",i);
			System.out.printf("해당 콘센트는 %d구 입니다. %n", s[i].number);
		}
		
			System.out.println( );
			
		Socket s1 = new Socket();
		s1.color="gray";
		s1.power=true;
		s1.number=2;
		s1.shape="round";
		
		System.out.println("콘센트의 색: "+s1.color);
		//System.out.println(s1.power);
		System.out.println("콘센트 개수: " +s1.number);
		System.out.println("콘센트 모양: "+s1.shape);
	}

}
