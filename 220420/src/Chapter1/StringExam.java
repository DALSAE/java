package Chapter1;

public class StringExam {

	public static void main(String[] args) {
		//�������� ����� ������ ���� ��ü�� �����ؾ���. ��Ʈ���� ��������. 
		String str1 = "abc";
		String str2 = new String("abc");//���ڿ��� �� �ּ� ��ġ�� ����ϰ� ���� ��Ʈ����.
		
		//new������ ��Ʈ���� �ϸ� ������ ���� ����. �ٵ� new �Ⱦ��� ������ ���� ���� ������ ��Ȱ���ؼ� ���.
		//�׷��� str1�� ���� 100(�ּ���ġ)��� �ϸ� str3�� ���� ���� ���ڿ��̶� ��Ȱ���ؼ� 100�� ����!!!!
		
		System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc"=="abc"); //�׷��� �̷��� ������==���� �ϸ� �ּ���ġ�� ���ϴ� �Ŷ� ���� �� ��
		System.out.printf("str1==\"abc\" ? %b%n", str1=="abc");
		System.out.printf("str2==\"abc\" ? %b%n", str2=="abc");
		System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc"));
		System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc"));
		System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC"));
		System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC"));
		
		//%d�� �Ҹ�. ������ �Ǵ�. %n�� �ٹٲ�
		// \�� �ٷ� ���� ���ڸ� �׷��� ����ϱ����� ���. \�� �״�� ����Ϸ��� \\�ΰ� �Է�. 
		
		//string�� ���� ���� ������ ����Ʈ�� ����Ʈ ��. �׷� �� �ڹ�.lang�̶� �� 
		//���ۿ� java api�˻��ϸ� ���� �� �� �� ������ 
		
	}

}
