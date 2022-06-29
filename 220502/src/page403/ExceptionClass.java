package page403;

public class ExceptionClass {

	public static void main(String[] args) throws ArithmeticException {
		try{
				method();
		}catch(ArithmeticException e) {
			System.out.println("0");
		}
		
		/*try {//try�� ���忡�� �������� ĳġ ������ ��Ƽ� ĳġ �� ���� ����.
			System.out.println(number/0);
		} catch (ArithmeticException e) {//������ ��� ����
			System.out.println("0���� ���� �� ����");
		}//������ �߻������� ó���� ���� �� 
		catch(NullPointerException e) {//�ΰ� ����
			System.out.println("NULL");
		}catch(Exception e) {//��� ����. ���������� ĳġ�ϰ� ��. 
			System.out.println("�����߻�");//�̰� ���� �����θ� ������ ���� ��������
		}//�ش��ϴ� ĳġ�� ���� ������ ĳġ ���� �����ϰ� ����
		*/
	}
	
static void method() throws ArithmeticException, Exception{
	int number = 100;
	int result = 0;
	
	for(int i=0; i<10; i++) {
		//System.out.println(result);
		//number/0~9���� ������ �� 
		try {
			result = number / (int)(Math.random()*10);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("0");
		}
	}
}

}
