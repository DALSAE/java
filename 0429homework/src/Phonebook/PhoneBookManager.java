package Phonebook;

public final class PhoneBookManager {
	final static int MAX_CNT=100; //���
	static Person [] infoStorage = new Person[MAX_CNT];
	static int curCnt = 0;
	private static PhoneBookManager pm;
	
	private PhoneBookManager() {}
	
	public static PhoneBookManager getInstance() {
		if(pm==null) {pm = new PhoneBookManager();
		}
		return pm;
	}
	
	private Person readNomalPerson() {
		System.out.print("�̸� : ");
		String name = 	MenuViwer.sc.nextLine(); //MenuViwer��� Ŭ������ 
		System.out.print("��ȭ��ȣ : ");//����ƽ���� ������ Ŭ����.���� �ҷ��� �� ����
		String phoneNum = MenuViwer.sc.nextLine();
		System.out.print("���� : ");
		String birth = MenuViwer.sc.nextLine();
		return new Person(name, phoneNum, birth);
	}
	
	private Person readUniversityPerson(){
		System.out.print("�̸� : ");
		String name = 	MenuViwer.sc.nextLine(); //MenuViwer��� Ŭ������ 
		System.out.print("��ȭ��ȣ : ");//����ƽ���� ������ Ŭ����.���� �ҷ��� �� ����
		String phoneNum = MenuViwer.sc.nextLine();
		System.out.print("���� : ");
		String birth = MenuViwer.sc.nextLine();
		System.out.print("���� : ");
		String major = MenuViwer.sc.nextLine();
		System.out.print("�г� : ");
		int grade = Integer.parseInt(MenuViwer.sc.nextLine());
		return new UniversityPerson(name, phoneNum, birth, major, grade);
	}
	
	private CompanyPerson readCompanyPerson() {
		System.out.print("�̸� : ");
		String name = 	MenuViwer.sc.nextLine(); //MenuViwer��� Ŭ������ 
		System.out.print("��ȭ��ȣ : ");//����ƽ���� ������ Ŭ����.���� �ҷ��� �� ����
		String phoneNum = MenuViwer.sc.nextLine();
		System.out.print("���� : ");
		String birth = MenuViwer.sc.nextLine();
		System.out.print("ȸ�� : ");
		String company = MenuViwer.sc.nextLine();
		return new CompanyPerson(name, phoneNum, birth,company);
	}
	void inputData() {  //�ٸ� �޼ҵ� �ۼ�
		int choice=0;
		System.out.println("ģ�� ���� ���� 1.�Ϲ� 2.���� 3.ȸ��");
		choice = Integer.parseInt(MenuViwer.sc.nextLine());
		String name, phoneNum, birth;
		
		switch(choice) {
		case 1:
			infoStorage[curCnt]= readNomalPerson();
			curCnt++; //���ο� ������ �� �ڸ��� Ŀ��Ʈī���
			System.out.println("�Է� �Ϸ�");
			break;
			
		case 2:
			infoStorage[curCnt]= readUniversityPerson();
			curCnt++; //���ο� ������ �� �ڸ��� Ŀ��Ʈī���
			System.out.println("�Է� �Ϸ�");
			break;
			
		case 3:
			readCompanyPerson();
			infoStorage[curCnt++]= new CompanyPerson(name, phoneNum, birth, company);
			curCnt++; //���ο� ������ �� �ڸ��� Ŀ��Ʈī���
			System.out.println("�Է� �Ϸ�");
			break;
			
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�. ");
		
		}
		
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
	

