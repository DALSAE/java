package step7;

import java.util.HashSet;
import java.util.Iterator;

public class PhoneBookManager {//누구나 접근가능한 폰북매니져 클래스 선언?
	private static PhoneBookManager pm;//
	//final int MAX_CNT=100;//배열때매 생긴 변수
	//person [] infoStorage = new person[0];
	//int curCnt = 0;//배여ㄹ때마 생긴변수
	
	HashSet<Person> infostorage = new HashSet<Person>(); 
	
	private PhoneBookManager() {}
	
	public static PhoneBookManager getInstance() {
		if(pm==null) pm = new PhoneBookManager();
		return pm;
	}
	
	private Person readNomalPerson() {
		System.out.print("이름==>");
		String name = MenuViwer.sc.nextLine ();
		System.out.print("전번==>");
		String phoneNumber = MenuViwer.sc.nextLine();
		System.out.print("생일==>");
		String birth = MenuViwer.sc.nextLine();
		
		return new Person(name, phoneNumber, birth);
	}
	
	private Person readUnivPerson() {
		System.out.print("이름==>");
		String name = MenuViwer.sc.nextLine();
		System.out.print("전번==>");
		String phoneNumber = MenuViwer.sc.nextLine();
		System.out.print("생일==>");
		String birth = MenuViwer.sc.nextLine();
		System.out.print("전공==>");
		String major = MenuViwer.sc.nextLine();
		System.out.print("학년==>");
		int grade =Integer.parseInt(MenuViwer.sc.nextLine());
		
		return new UniversityPerson(name, phoneNumber,birth, major, grade);
	}
	
	private Person readCompPerson() {
		System.out.print("이름==>");
		String name = MenuViwer.sc.nextLine();;
		System.out.print("전번==>");
		String phoneNumber = MenuViwer.sc.nextLine();;
		System.out.print("생일==>");
		String birth = MenuViwer.sc.nextLine();;
		System.out.print("회사==>");
		String company = MenuViwer.sc.nextLine();;
		return new CompanyPerson(name, phoneNumber,birth, company);
	}
	
	void inputData() throws MenuChoiceException{
		System.out.print("일반(1), 대학(2), 회사(3)");
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
			System.out.println("잘못입력했습니다.");
			return;
		}
		//infoStorage[curCnt] = tmp;
		//curCnt++;
		if(infostorage.add(tmp)) {//값 저장하기
			System.out.println("입력완료");
		}else
		System.out.println("입력실패 : 중복자료");
	}
	
	void allDisplay() {
		/* for(int i=0; i<curCnt; i++) {
			infoStorage[i].showPhoneinfo();
		}*/
		//set은 순서 없어서 index없음 그래서 int i이렇게 머ㅗㅅ함
		Iterator<Person> it = infostorage.iterator();
		while(it.hasNext()) {//다음이 있는지 묻기
			Person tmp = (Person)it.next();//next :가서 읽어오는 것 
			tmp.showPhoneinfo();
		}
	}
	
	void searchData() {
		System.out.print("검색할 이름은?==>");
		String name = MenuViwer.sc.nextLine();;
		Person tmp = null;
	//	int index = -1;
		
		tmp = search(name);
		
		if(tmp!=null) {
			tmp.showPhoneinfo();
		}else System.out.println("해당 데이터 존재하지 않음");
		
		/*if(index > -1) {   	
			infoStorage[index].showPhoneinfo();
		}else { 			//검색 실패시 메세지
			System.out.println("해당하는 정보가 존재하지 않음");
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
		System.out.print("수정할 이름은?==>");
		String name = MenuViwer.sc.nextLine();
		Person tmp = null;
		//int index = -1;
		tmp = search(name);
		Iterator<Person> it = infostorage.iterator();
		
		
		if(tmp!=null) {   	
			System.out.print("new 전번입력 ==>");
			tmp.phoneNum =  MenuViwer.sc.nextLine();
			System.out.print("new 생일입력 ==>");
			tmp.birth =  MenuViwer.sc.nextLine();
			System.out.println("수정완료");
		}else { 			
			System.out.println("수정할 정보가 존재하지 않음");
		}
	}
	
	void deleteData() {
		//1.삭제할 이름 찾기
		System.out.print("삭제할 이름은?==>");
		String name = MenuViwer.sc.nextLine();;
		Person tmp = null;
		
		tmp= search(name);
		
		//2.배열에서 정보 삭제
		Iterator<Person> it = infostorage.iterator();
		while(it.hasNext()) {
			tmp = (Person)it.next();
			if(name.equals(tmp.name)) {
				it.remove();
				System.out.println("삭제 완료");
				return; 
			}
		}
		System.out.println("삭제 실패 : 데이터 존재하지 않음");
		
		//이 형태로 해도 됨 
		 /* if(tmp!=null) {   	
			infostorage.remove(tmp);
			System.out.println("삭제완료");
		}else { 			
			System.out.println("삭제할 정보가 존재하지 않음");
		} */
	}
	
	void deleteAll() {//모르겠으면 일단 void쓰고 시작! 
		System.out.println("모두 삭제하시겠습니까? ");
		System.out.println("1.yes  2.no");
		
		
		//이걸 또 입력받아야하잖아? 그럼 스캐너? 
		Iterator<Person> it = infostorage.iterator();
		while(it.hasNext()) {
			it.next();
			it.remove();//remove특성상 읽어와서 삭제를 해야함!! 
		}
		System.out.println("모든 데이터 삭제 완료");
		//반복해서 계속 지운다? 근데 인덱스가 없으니까 입력된 데이터를 전부 지운다? 
	}
}
