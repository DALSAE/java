package exam;

public class Tv {
	//�Ӽ�, Ư¡ : �������
	String color; //Ŭ���� ���鶧�� �ʱⰪ �ʿ� ���� �˾Ƽ� ����
	boolean power;
	int channel;
	
	
	//���, �׼� �����̴� �� : ����޼ҵ�
	void power(){			//���̵� ���� Ÿ���� ����.
		power = !power;		//toggle��ư�ϳ��� ���������� �ݴ���·� ����
	} 
	
	
	void channelUp() {
		channel++;
	}
	void channelDown() {
		channel--;
	}
	
	

}
