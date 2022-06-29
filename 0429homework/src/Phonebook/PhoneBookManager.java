package Phonebook;

public final class PhoneBookManager {
	final static int MAX_CNT=100; //상수
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
		System.out.print("이름 : ");
		String name = 	MenuViwer.sc.nextLine(); //MenuViwer라는 클래스에 
		System.out.print("전화번호 : ");//스태틱으로 있으니 클래스.으로 불러올 수 있음
		String phoneNum = MenuViwer.sc.nextLine();
		System.out.print("생일 : ");
		String birth = MenuViwer.sc.nextLine();
		return new Person(name, phoneNum, birth);
	}
	
	private Person readUniversityPerson(){
		System.out.print("이름 : ");
		String name = 	MenuViwer.sc.nextLine(); //MenuViwer라는 클래스에 
		System.out.print("전화번호 : ");//스태틱으로 있으니 클래스.으로 불러올 수 있음
		String phoneNum = MenuViwer.sc.nextLine();
		System.out.print("생일 : ");
		String birth = MenuViwer.sc.nextLine();
		System.out.print("전공 : ");
		String major = MenuViwer.sc.nextLine();
		System.out.print("학년 : ");
		int grade = Integer.parseInt(MenuViwer.sc.nextLine());
		return new UniversityPerson(name, phoneNum, birth, major, grade);
	}
	
	private CompanyPerson readCompanyPerson() {
		System.out.print("이름 : ");
		String name = 	MenuViwer.sc.nextLine(); //MenuViwer라는 클래스에 
		System.out.print("전화번호 : ");//스태틱으로 있으니 클래스.으로 불러올 수 있음
		String phoneNum = MenuViwer.sc.nextLine();
		System.out.print("생일 : ");
		String birth = MenuViwer.sc.nextLine();
		System.out.print("회사 : ");
		String company = MenuViwer.sc.nextLine();
		return new CompanyPerson(name, phoneNum, birth,company);
	}
	void inputData() {  //다른 메소드 작성
		int choice=0;
		System.out.println("친구 유형 선택 1.일반 2.대학 3.회사");
		choice = Integer.parseInt(MenuViwer.sc.nextLine());
		String name, phoneNum, birth;
		
		switch(choice) {
		case 1:
			infoStorage[curCnt]= readNomalPerson();
			curCnt++; //새로운 데이터 들어갈 자리가 커런트카운드
			System.out.println("입력 완료");
			break;
			
		case 2:
			infoStorage[curCnt]= readUniversityPerson();
			curCnt++; //새로운 데이터 들어갈 자리가 커런트카운드
			System.out.println("입력 완료");
			break;
			
		case 3:
			readCompanyPerson();
			infoStorage[curCnt++]= new CompanyPerson(name, phoneNum, birth, company);
			curCnt++; //새로운 데이터 들어갈 자리가 커런트카운드
			System.out.println("입력 완료");
			break;
			
		default:
			System.out.println("잘못 입력하셨습니다. ");
		
		}
		
	}
	
	void allDisplay() {
		for(int i=0; i<curCnt; i++) {
			infoStorage[i].showPhoneinfo();
		}
	}
	void searchData() {
		System.out.println("검색할 이름은? ");
		String name = MenuViwer.sc.nextLine();
		int index = -1;
		
		index = search(name);
			
		
		if(index>-1) {
			
		}else {
			System.out.println("해당 정보가 존재하지 않음.");
		}}
	
	void updateData() {//수정할 이름 찾기.->배열의 위치를 찾기 번호,생일 새로 입력받아서 다시 저장(데이터 덮어쓰기).
		System.out.println("수정할 이름은? ");
		String name = MenuViwer.sc.nextLine();
		Person tmp = null;
		
		for(int i=0; i<curCnt; i++) {
		if(name.equals(infoStorage[i].name)) {
			tmp = infoStorage[i];
			break;}
		
			System.out.println("전화번호 재입력 : ");
			String phoneNum = MenuViwer.sc.nextLine();
			System.out.println("생일 재입력 : ");
			String birth = MenuViwer.sc.nextLine();
			}
		
	}
	void deleteData() {
		System.out.println("삭제할 이름은? ");
		String name = MenuViwer.sc.nextLine();
		int index = -1; //index는 삭제하 ㄹ 위치 말함
	 
	for(int i=0; i<curCnt; i++) {
		if(name.equals(infoStorage[i].name)) {
			index=i;
			break;
		}//삭제? null값을 넣으면 되나,,?  ㄴㄴ없어진 값때문에 빈 배열에 뒤의 데이터 당겨들어옴
	}
	if(index>-1) {
		for(int i=index; i<curCnt; i++) {
			infoStorage[i] = infoStorage[i+1]; //뒤에 값을 덮어스면 앞 값이 삭제되는 것!
		}
		curCnt--;
		System.out.println("삭제 완료");
	}else {
		System.out.println("삭제할 정보가 없습니다.");
	}
	
		}
	
	private int search(String name) { //메소드에도 프라이빗 써서 
		for(int i=0; i<curCnt; i++) {
			if(name.equals(infoStorage[i].name)) {
				return i;
				
			}
	}
		return -1;
	}
	
		
	}
	

