package exam;

public class Tvtest {

	public static void main(String[] args) {
		Tv t1 = new Tv(); //�ν��Ͻ�ȭ =��üȭ ���� ������ Ƽ��� �ܽ�Ʈ����? �ʱ�ȭ
		Tv t2=new Tv();   //�ν��Ͻ�ȭ�� �ȿ��� �޸� �� ���ö��
		
		System.out.println(t1.color);
		
		 t1.power = true;
		 t1.channel=10;
		 t1.color="red";
		 
		 t1.channelUp();
		 System.out.println(t1.channel);
		 System.out.println(t2.channel);
		 System.out.println(t1);
		 System.out.println(t2);
		 
		 t2.channel=5;
		 t2.channelDown();
		 System.out.println(t2.channel);
		
	}

}