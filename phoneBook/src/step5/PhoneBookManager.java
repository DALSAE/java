package step5;

public class PhoneBookManager {
	private static PhoneBookManager pm;
	final int MAX_CNT=100;
	Person[] infoStorage = new Person[MAX_CNT];
	int curCnt = 0;
	
	private PhoneBookManager() {}
	
	public static PhoneBookManager getInstance() {
		if(pm==null) pm = new PhoneBookManager();
		return pm;
	}
	
	private Person readNomalPerson() {
		System.out.print("�̸�==>");
		String name = MenuViwer.sc.nextLine();
		System.out.print("����==>");
		String phoneNumber = MenuViwer.sc.nextLine();
		System.out.print("����==>");
		String birth = MenuViwer.sc.nextLine();
		
		return new Person(name, phoneNumber, birth);
	}
	
	private Person readUnivPerson() {
		System.out.print("�̸�==>");
		String name = MenuViwer.sc.nextLine();
		System.out.print("����==>");
		String phoneNumber = MenuViwer.sc.nextLine();
		System.out.print("����==>");
		String birth = MenuViwer.sc.nextLine();
		System.out.print("����==>");
		String major = MenuViwer.sc.nextLine();
		System.out.print("�г�==>");
		int grade =Integer.parseInt(MenuViwer.sc.nextLine(););
		
		return new UnivPerson(name, phoneNumber,birth, major, grade);
	}
	
	private Person readCompPerson() {
		System.out.print("�̸�==>");
		String name = MenuViwer.sc.nextLine();;
		System.out.print("����==>");
		String phoneNumber = MenuViwer.sc.nextLine();;
		System.out.print("����==>");
		String birth = MenuViwer.sc.nextLine();;
		System.out.print("ȸ��==>");
		String company = MenuViwer.sc.nextLine();;
		return new CompanyPerson(name, phoneNumber,birth, company);
	}
	
	void inputData() {
		System.out.print("�Ϲ�(1), ����(2), ȸ��(3)");
		int choice = Integer.parseInt(MenuViwer.sc.nextLine(););
		Person tmp = null;
		
		switch(choice) {
		case 1:
			tmp = readNomalPerson();
			break;
		case 2:
			tmp  =  readUnivPerson();
			break;
		case 3:
			tmp = readCompPerson();
			break;
		default:
			System.out.println("�߸��Է��߽��ϴ�.");
			return;
		}
		infoStorage[curCnt] = tmp;
		curCnt++;
		System.out.println("�Է¿Ϸ�");
	}
	
	void allDisplay() {
		for(int i=0; i<curCnt; i++) {
			infoStorage[i].showPhoneInfo();
		}
	}
	
	void searchData() {
		System.out.print("�˻��� �̸���?==>");
		String name = MenuViwer.sc.nextLine();;
		Person tmp = null;
		int index = -1;
		
		index = search(name);
		/*
		for(int i=0; i<curCnt; i++) {
			if(name.equals(infoStorage[i].name)) {
				//tmp = infoStorage[i];
				index = i;
				break;
			}
		}
		*/
		//if(tmp!=null) {   	//�˻� �����ϸ� ���
		if(index > -1) {   	//�˻� �����ϸ� ���
			//tmp.showPhoneInfo();
			infoStorage[index].showPhoneInfo();
		}else { 			//�˻� ���н� �޼���
			System.out.println("�ش��ϴ� ������ �������� ����");
		}
	}
	
	private int search(String name) {
		
		for(int i=0; i<curCnt; i++) {
			if(name.equals(infoStorage[i].name)) {
				//tmp = infoStorage[i];
				return i;
			}
		}
		return -1;
	}
	
	void updateData() {
		//1. �������̸��� ã�� --> �迭�� ��ġ�� ã��
		System.out.print("������ �̸���?==>");
		String name = MenuViwer.sc.nextLine();;
		Person tmp = null;
		int index = -1;
		index = search(name);
		/*
		for(int i=0; i<curCnt; i++) {
			if(name.equals(infoStorage[i].name)) {
				//tmp = infoStorage[i];
				index = i;
				break;
			}
		}
		*/
		//2. ����, ������ ���� �Է¹޾Ƽ� �����ϱ�
		//if(tmp!=null) {   //�˻� �����ϸ� ���
		if(index>-1) {   	//�˻� �����ϸ� ���
			System.out.print("new �����Է� ==>");
			//tmp.phoneNumber =  MenuViewer.sc.nextLine();
			infoStorage[index].phoneNumber =  MenuViwer.sc.nextLine();;
			System.out.print("new �����Է� ==>");
			//tmp.birth =  MenuViewer.sc.nextLine();
			infoStorage[index].birth =  MenuViwer.sc.nextLine();;
			System.out.println("�����Ϸ�");
		}else { 			//�˻� ���н� �޼���
			System.out.println("������ ������ �������� ����");
		}
	}
	void deleteData() {
		//1.������ �̸� ã��
		System.out.print("������ �̸���?==>");
		String name = MenuViwer.sc.nextLine();;
		int index = -1;
		index = search(name);
		
		/*
		for(int i=0; i<curCnt; i++) {
			if(name.equals(infoStorage[i].name)) {
				index = i;
				break;
			}
		}
		*/
		//2.�迭���� ���� ����
		if(index > -1) {   //������ ������ ã������
			for(int i = index; i<curCnt; i++) {
				infoStorage[i] = infoStorage[i+1];
			}
			curCnt--;
			System.out.println("�����Ϸ�");
		}else {  //������ ������ ���°��
			System.out.println("������ ������ �����ϴ�.");
		}
	}
}
