package chp03;

public class var01 {

	public static void main(String[] args) {
		//���� ����
		int kor = 85; //�����ڵ��� �ݺ� �Ⱦ���. ���ٿ� �� �� ������ ���ٿ� ����
		int eng = 80; //int kor=80, eng=80, mat=80;   
		int mat = 80;
		int tot = kor + eng + mat;
		double avg = tot / 3.0;
		//������ ������ ���������� ������ ��. �Ǽ������� �� ������ �Ϸ��� ���Ŀ��� �Ǽ������� ����. 3.0
		String name = "�ǹ���"; 
		//���ڿ� ������  �ʿ��� �� ���. string�� �ѹ� �����ϸ� �Һ�
		
		/* System.out.println(kor+eng+mat); ���ĸ� ��� �ٷ� ��� ���� 
		System.out.println((kor+eng+mat)/3);
		�׷��� System.out.println("����: "+kor+eng+mat); 
		�� ���´� ���� ����� �ȵǰ� ����: 858080 �̷��� ���ڿ��� �� ������
		
		�׷��� System.out.println("���: " +(kor+eng+mat)/3); */
		
		//ó��
		//tot = kor + eng + mat;
		//avg = tot / 3;
		
		//���
		System.out.println("����: " +tot);
		System.out.println("���: " +avg); 
		//�Ҽ������� ���Ϸ��� ������ �� int�ƴ� double���� ����
		System.out.println("�̸�: " +name);
	}

}
