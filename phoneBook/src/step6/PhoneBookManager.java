package step6;

public class PhoneBookManager {//������ ���ٰ����� ���ϸŴ��� Ŭ���� ����?
	private static PhoneBookManager pm;//���� Ŭ���� �������� ���� �����ϰ�(private) 
	//���� ���� ������ ��밡���ϸ鼭(�ν��Ͻ��� �������� �ʰ� =��ü�� �������� �ʰ�) ���� ���� ���ϸ� �ش� ������ ���� ��� �ѹ��� ����Ǵ�(static)
	//phonbookmanager���·�(Ÿ������) �����ϴ�(��ȯ�Ǵ�) ����pm�� ����.

	final int MAX_CNT=100;//�ٲ� �� ���� ��Ƽ��Ÿ��(����)�� ��� MAX_CNT.����� �빮�ڷ� ǥ���ؾ���. 
	Person[] infoStorage = new Person[MAX_CNT];//PERSONŸ���� �迭 ���� �̸�infostorage ����.
	//personŸ���̶�� �� personŬ�������� �����ڸ� ������ ��ó�� name,birth,phonenum�� �����ٴ� ��.?(�ش� Ŭ������ ����� ������ Ÿ�Կ� �°� �����ٴ� �ǰ�?)
	//���ο� �迭 infostorage�� ��� ��100�� ������ �� ����.
	int curCnt = 0;//���� Ÿ�� ���� �����ϰ� 0���� �ʱⰪ ����(�ʱ�ȭ��)
	//Ÿ�Կ� ���� ����,, 
	private PhoneBookManager() {}//������. �޼���� �޸� ���ϰ�(��ȯŸ��)���� ����.
	//�޼���:��ȯŸ�� �޼����̸� (Ÿ�� ������...)(�����){������ =������ �޼��� ����}
	//������:�������̸�(Ŭ�����̸��� ����)(){}  !!���ϰ�(��ȯŸ��)����.!!
	public static PhoneBookManager getInstance() {//��� ����� �� �ִ�(public) ���� ���ϸ� ���� ������ ��� �����Ǵ�, ��ü���� ������ ��밡����(static)
		//phonebookmanager���·� ��ȯ�ϴ� �޼����� getinstance //���ϸŴ��� ���¶� ����pm�� ����.?
		if(pm==null) pm = new PhoneBookManager();//���� pm�� �ΰ��̸� pm���� ���ο� ����??����.
		return pm;//���� pm���� ��ȯ.
	}
	
	private Person readNomalPerson() {//�� Ŭ���� �������� ������ �� �ִ� personŸ���� �޼���readnomalperson
		System.out.print("�̸�==>");//"����" ����ϴ� �޼���
		String name = MenuViwer.sc.nextLine ();//���ڿ� Ÿ���� ����name�� �޴����Ŭ�������� �Է¹��� �� ����.
		System.out.print("����==>");
		String phoneNumber = MenuViwer.sc.nextLine();
		System.out.print("����==>");
		String birth = MenuViwer.sc.nextLine();
		
		return new Person(name, phoneNumber, birth);//�Է¹��� ���� personŸ�� ���·� ��ȯ
	}
	
	private Person readUnivPerson() {//�޼���
		System.out.print("�̸�==>");
		String name = MenuViwer.sc.nextLine();
		System.out.print("����==>");
		String phoneNumber = MenuViwer.sc.nextLine();
		System.out.print("����==>");
		String birth = MenuViwer.sc.nextLine();
		System.out.print("����==>");
		String major = MenuViwer.sc.nextLine();
		System.out.print("�г�==>");
		int grade =Integer.parseInt(MenuViwer.sc.nextLine());
		//scanner�� �Է¹޴� ���� ���ڿ� Ÿ���̶� ���� Ÿ������ �ٲ㼭 ���Խ�Ŵ.
		
		return new UniversityPerson(name, phoneNumber,birth, major, grade);
	}//�Է¹��� ���� universitypersonŬ������ Ÿ������ ���ο� �� ����. ?????
	
	private Person readCompPerson() {//�޼���
		System.out.print("�̸�==>");
		String name = MenuViwer.sc.nextLine();;
		System.out.print("����==>");
		String phoneNumber = MenuViwer.sc.nextLine();;
		System.out.print("����==>");
		String birth = MenuViwer.sc.nextLine();;
		System.out.print("ȸ��==>");
		String company = MenuViwer.sc.nextLine();;
		return new CompanyPerson(name, phoneNumber,birth, company);
	}//companypersonŬ������ Ÿ�Ե���?? ������ ����?? ���ο� �� ����.
	
	void inputData() throws MenuChoiceException{//����Ÿ�� ���� �޼���inputdata
		//�޼��忡 ���ܸ� �����ؼ� ���ܸ� ó���ϴ� �����. throws �����~
		//menuchoiceexception�̶�� Ŭ������ ���ܸ� ó���ϵ��� ��.
		//Ŭ���� ������ ��� ���ܸ� ó���ϰ� 
		System.out.print("�Ϲ�(1), ����(2), ȸ��(3)");
		int choice = Integer.parseInt(MenuViwer.sc.nextLine());
		//�� ���ο� ���� �����޳� 
		if(choice<SubMenu.NORMAL || choice>SubMenu.COMPANY)
			throw new MenuChoiceException(choice);
		
		
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
			infoStorage[i].showPhoneinfo();
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
			infoStorage[index].showPhoneinfo();
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
			infoStorage[index].phoneNum =  MenuViwer.sc.nextLine();;
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
