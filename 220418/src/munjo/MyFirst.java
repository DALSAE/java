package munjo;

public class MyFirst {

	public static void main(String[] args) {
		//���� ����� �ʱ�ȭ: ����Ÿ�� �̸�=�ʱⰪ
		int age = 0; //���� �⺻�� int, =�� ���� ������ ==�̶�� ����� ���ٴ� �ǹ�
		double height = 0.0; //�Ǽ� �⺻ ������ double��
		//float �ϸ� ���� ��. �ڹٿ��� �Ǽ����� �⺻�� �����̶�. floatŸ�� ������ �ڿ� f���̱� 
		char result = 'Y'; //char�� �ۤ����� �Ѱ��� ���� �� ���� 
		boolean result2 = false; 
		//�� ������ ��Ÿ�� ���� ���� �̸� ���� �� ����2 �̷������� ����ϰ� ���ڴ� �� �տ� ����
		
		//���� �⺻�� int�� �Ǽ� �⺻�� double�̴ϰ� ������� ����ڴٰ� 
		//�� ���� byte float���� ũ�� ���̴� ���� �ѹ� �� ��ġ�°Ŷ� �� ���������� ����.
		
		age = 30; //final�� �����ع��ȴµ� �� ��ȭ��Ű�� ���� ��
		height = 161.5; //float���� ������ f���̱�
		result2= true;
		//���� ������ ����ڰ� ������ ���� �̸��� �������� �ڹٰ� �̹� �����ص� �̸��̶� ��� ����
		
		System.out.println("����: " + age);//"�ȿ� ������ �� ���� �״�� ��µ�
		System.out.println("Ű: " +height);
		System.out.println("���: " +result);
		System.out.println("���2: " +result2);
		System.out.println(age > 50); //���ǿ� ���� t or f����
	}

}
