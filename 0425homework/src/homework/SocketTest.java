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
			System.out.printf("�ش� �ܼ�Ʈ�� %d�� �Դϴ�. %n", s[i].number);
		}
		
			System.out.println( );
			
		Socket s1 = new Socket();
		s1.color="gray";
		s1.power=true;
		s1.number=2;
		s1.shape="round";
		
		System.out.println("�ܼ�Ʈ�� ��: "+s1.color);
		//System.out.println(s1.power);
		System.out.println("�ܼ�Ʈ ����: " +s1.number);
		System.out.println("�ܼ�Ʈ ���: "+s1.shape);
	}

}
