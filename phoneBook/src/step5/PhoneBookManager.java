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
		System.out.print("이름==>");
		String name = MenuViwer.sc.nextLine();
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
		int grade =Integer.parseInt(MenuViwer.sc.nextLine(););
		
		return new UnivPerson(name, phoneNumber,birth, major, grade);
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
	
	void inputData() {
		System.out.print("일반(1), 대학(2), 회사(3)");
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
			System.out.println("잘못입력했습니다.");
			return;
		}
		infoStorage[curCnt] = tmp;
		curCnt++;
		System.out.println("입력완료");
	}
	
	void allDisplay() {
		for(int i=0; i<curCnt; i++) {
			infoStorage[i].showPhoneInfo();
		}
	}
	
	void searchData() {
		System.out.print("검색할 이름은?==>");
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
		//if(tmp!=null) {   	//검색 성공하면 출력
		if(index > -1) {   	//검색 성공하면 출력
			//tmp.showPhoneInfo();
			infoStorage[index].showPhoneInfo();
		}else { 			//검색 실패시 메세지
			System.out.println("해당하는 정보가 존재하지 않음");
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
		//1. 수정할이름을 찾기 --> 배열의 위치를 찾기
		System.out.print("수정할 이름은?==>");
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
		//2. 전번, 생일을 새로 입력받아서 저장하기
		//if(tmp!=null) {   //검색 성공하면 출력
		if(index>-1) {   	//검색 성공하면 출력
			System.out.print("new 전번입력 ==>");
			//tmp.phoneNumber =  MenuViewer.sc.nextLine();
			infoStorage[index].phoneNumber =  MenuViwer.sc.nextLine();;
			System.out.print("new 생일입력 ==>");
			//tmp.birth =  MenuViewer.sc.nextLine();
			infoStorage[index].birth =  MenuViwer.sc.nextLine();;
			System.out.println("수정완료");
		}else { 			//검색 실패시 메세지
			System.out.println("수정할 정보가 존재하지 않음");
		}
	}
	void deleteData() {
		//1.삭제할 이름 찾기
		System.out.print("삭제할 이름은?==>");
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
		//2.배열에서 정보 삭제
		if(index > -1) {   //삭제할 정보를 찾았으면
			for(int i = index; i<curCnt; i++) {
				infoStorage[i] = infoStorage[i+1];
			}
			curCnt--;
			System.out.println("삭제완료");
		}else {  //삭제할 정보가 없는경우
			System.out.println("삭제할 정보가 없습니다.");
		}
	}
}
