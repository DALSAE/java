package step7;

import java.util.HashSet;
import java.util.Iterator;

public class PhoneBookManager {//������ ���ٰ����� ���ϸŴ��� Ŭ���� ����?
	private static PhoneBookManager pm;//
	//final int MAX_CNT=100;//�迭���� ���� ����
	//person [] infoStorage = new person[0];
	//int curCnt = 0;//�迩������ ���亯��
	
	HashSet<Person> infostorage = new HashSet<Person>(); 
	
	private PhoneBookManager() {}
	
	public static PhoneBookManager getInstance() {
		if(pm==null) pm = new PhoneBookManager();
		return pm;
	}
	
	private Person readNomalPerson() {
		System.out.print("�̸�==>");
		String name = MenuViwer.sc.nextLine ();
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
		int grade =Integer.parseInt(MenuViwer.sc.nextLine());
		
		return new UniversityPerson(name, phoneNumber,birth, major, grade);
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
	
	void inputData() throws MenuChoiceException{
		System.out.print("�Ϲ�(1), ����(2), ȸ��(3)");
		int choice = Integer.parseInt(MenuViwer.sc.nextLine());
		
		if(choice<SubMenu.NORMAL || choice>SubMenu.COMPANY)
			throw new MenuChoiceException(choice);
		
		
		Person tmp = null;
		
		switch(choice) {
		case SubMenu.NORMAL:
			tmp = readNomalPerson();
			break;
		case SubMenu.UNIVERSITY:
			tmp  =  readUnivPerson();
			break;
		case SubMenu.COMPANY:
			tmp = readCompPerson();
			break;
		default:
			System.out.println("�߸��Է��߽��ϴ�.");
			return;
		}
		//infoStorage[curCnt] = tmp;
		//curCnt++;
		if(infostorage.add(tmp)) {//�� �����ϱ�
			System.out.println("�Է¿Ϸ�");
		}else
		System.out.println("�Է½��� : �ߺ��ڷ�");
	}
	
	void allDisplay() {
		/* for(int i=0; i<curCnt; i++) {
			infoStorage[i].showPhoneinfo();
		}*/
		//set�� ���� ��� index���� �׷��� int i�̷��� �ӤǤ���
		Iterator<Person> it = infostorage.iterator();
		while(it.hasNext()) {//������ �ִ��� ����
			Person tmp = (Person)it.next();//next :���� �о���� �� 
			tmp.showPhoneinfo();
		}
	}
	
	void searchData() {
		System.out.print("�˻��� �̸���?==>");
		String name = MenuViwer.sc.nextLine();;
		Person tmp = null;
	//	int index = -1;
		
		tmp = search(name);
		
		if(tmp!=null) {
			tmp.showPhoneinfo();
		}else System.out.println("�ش� ������ �������� ����");
		
		/*if(index > -1) {   	
			infoStorage[index].showPhoneinfo();
		}else { 			//�˻� ���н� �޼���
			System.out.println("�ش��ϴ� ������ �������� ����");
		}*/
	}
	
	private Person search(String name) { 
		Iterator<Person> it = infostorage.iterator();
		while(it.hasNext()) {
			Person tmp = (Person)it.next();
			if(name.equals(tmp.name))
				return tmp;
		}
		return null;
		}
		/* for(int i=0; i<curCnt; i++) {
			if(name.equals(infoStorage[i].name)) {
				
				return i;
			}
		}
		return -1;*/
	
	
	void updateData() {
		System.out.print("������ �̸���?==>");
		String name = MenuViwer.sc.nextLine();
		Person tmp = null;
		//int index = -1;
		tmp = search(name);
		Iterator<Person> it = infostorage.iterator();
		
		
		if(tmp!=null) {   	
			System.out.print("new �����Է� ==>");
			tmp.phoneNum =  MenuViwer.sc.nextLine();
			System.out.print("new �����Է� ==>");
			tmp.birth =  MenuViwer.sc.nextLine();
			System.out.println("�����Ϸ�");
		}else { 			
			System.out.println("������ ������ �������� ����");
		}
	}
	
	void deleteData() {
		//1.������ �̸� ã��
		System.out.print("������ �̸���?==>");
		String name = MenuViwer.sc.nextLine();;
		Person tmp = null;
		
		tmp= search(name);
		
		//2.�迭���� ���� ����
		Iterator<Person> it = infostorage.iterator();
		while(it.hasNext()) {
			tmp = (Person)it.next();
			if(name.equals(tmp.name)) {
				it.remove();
				System.out.println("���� �Ϸ�");
				return; 
			}
		}
		System.out.println("���� ���� : ������ �������� ����");
		
		//�� ���·� �ص� �� 
		 /* if(tmp!=null) {   	
			infostorage.remove(tmp);
			System.out.println("�����Ϸ�");
		}else { 			
			System.out.println("������ ������ �������� ����");
		} */
	}
	
	void deleteAll() {//�𸣰����� �ϴ� void���� ����! 
		System.out.println("��� �����Ͻðڽ��ϱ�? ");
		System.out.println("1.yes  2.no");
		
		
		//�̰� �� �Է¹޾ƾ����ݾ�? �׷� ��ĳ��? 
		Iterator<Person> it = infostorage.iterator();
		while(it.hasNext()) {
			it.next();
			it.remove();//removeƯ���� �о�ͼ� ������ �ؾ���!! 
		}
		System.out.println("��� ������ ���� �Ϸ�");
		//�ݺ��ؼ� ��� �����? �ٵ� �ε����� �����ϱ� �Էµ� �����͸� ���� �����? 
	}
}
