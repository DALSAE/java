package step3;

public class PhoneBookManager {
	final int MAX_CNT=100; //���
	Person [] infoStorage = new Person[MAX_CNT];
	int curCnt = 0;
	
	void inputData() {  //�ٸ� �޼ҵ� �ۼ�
		
		System.out.print("�̸� : ");
		String name = 	MenuViwer.sc.nextLine(); //MenuViwer��� Ŭ������ 
		System.out.print("��ȭ��ȣ : ");//����ƽ���� ������ Ŭ����.���� �ҷ��� �� ����
		String phoneNum = MenuViwer.sc.nextLine();
		System.out.print("���� : ");
		String birth = MenuViwer.sc.nextLine();
		
		infoStorage[curCnt++]= new Person(name, phoneNum, birth);
		curCnt++; //���ο� ������ �� �ڸ��� Ŀ��Ʈī���
		System.out.println("�Է� �Ϸ�");
	}
	
	void allDisplay() {
		for(int i=0; i<curCnt; i++) {
			infoStorage[i].showPhoneinfo();
		}
	}
	void searchData() {
		System.out.println("�˻��� �̸���? ");
		String name = MenuViwer.sc.nextLine();
		int index = -1;
		
		index = search(name);
			
		
		if(index>-1) {
			
		}else {
			System.out.println("�ش� ������ �������� ����.");
		}}
	
	void updateData() {//������ �̸� ã��.->�迭�� ��ġ�� ã�� ��ȣ,���� ���� �Է¹޾Ƽ� �ٽ� ����(������ �����).
		System.out.println("������ �̸���? ");
		String name = MenuViwer.sc.nextLine();
		Person tmp = null;
		
		for(int i=0; i<curCnt; i++) {
		if(name.equals(infoStorage[i].name)) {
			tmp = infoStorage[i];
			break;}
		
			System.out.println("��ȭ��ȣ ���Է� : ");
			String phoneNum = MenuViwer.sc.nextLine();
			System.out.println("���� ���Է� : ");
			String birth = MenuViwer.sc.nextLine();
			
			
		
			}
		
	}
	void deleteData() {
		System.out.println("������ �̸���? ");
		String name = MenuViwer.sc.nextLine();
		int index = -1; //index�� ������ �� ��ġ ����
	 
	for(int i=0; i<curCnt; i++) {
		if(name.equals(infoStorage[i].name)) {
			index=i;
			break;
		}//����? null���� ������ �ǳ�,,?  ���������� �������� �� �迭�� ���� ������ ��ܵ���
	}
	if(index>-1) {
		for(int i=index; i<curCnt; i++) {
			infoStorage[i] = infoStorage[i+1]; //�ڿ� ���� ����� �� ���� �����Ǵ� ��!
		}
		curCnt--;
		System.out.println("���� �Ϸ�");
	}else {
		System.out.println("������ ������ �����ϴ�.");
	}
	
		}
	
	private int search(String name) { //�޼ҵ忡�� �����̺� �Ἥ 
		for(int i=0; i<curCnt; i++) {
			if(name.equals(infoStorage[i].name)) {
				return i;
				
			}
	}
		return -1;
	}
	
		
	}
	

