package step6;

public class MenuChoiceException extends Exception {
	int wrongChoice;
	
	public MenuChoiceException(int choice) {
		super("�߸��� ������ �̷�������ϴ�.");
		//���̽���� ���� �����ϰ� /""�޼����� ����Ѵ�??? 
		wrongChoice = choice;//���� wr�� choice �� ����??? 
	}
	public void showWrongChoice() {
		System.out.println(wrongChoice+"�� �ش��ϴ� ������ �������� �ʽ��ϴ�. ");
	}
}
