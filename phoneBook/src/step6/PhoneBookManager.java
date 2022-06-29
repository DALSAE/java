package step6;

public class PhoneBookManager {//누구나 접근가능한 폰북매니져 클래스 선언?
	private static PhoneBookManager pm;//같은 클래스 내에서만 접근 가능하고(private) 
	//변수 선언 전에도 사용가능하면서(인스턴스를 생성하지 않고도 =객체를 생성하지 않고도) 변수 값이 변하면 해당 변수의 값이 모두 한번에 변경되는(static)
	//phonbookmanager형태로(타입으로) 리턴하는(반환되는) 변수pm을 선언.

	final int MAX_CNT=100;//바꿀 수 없는 인티저타입(정수)의 상수 MAX_CNT.상수는 대문자로 표현해야함. 
	Person[] infoStorage = new Person[MAX_CNT];//PERSON타입의 배열 변수 이름infostorage 선언.
	//person타입이라는 건 person클래스에서 생성자를 지정한 것처럼 name,birth,phonenum를 가진다는 것.?(해당 클래스에 선언된 변수를 타입에 맞게 가진다는 건가?)
	//새로운 배열 infostorage에 상수 값100을 대입한 것 생성.
	int curCnt = 0;//정수 타입 변수 선언하고 0으로 초기값 설정(초기화함)
	//타입에 대해 정리,, 
	private PhoneBookManager() {}//생성자. 메서드와 달리 리턴값(반환타입)적지 않음.
	//메서드:반환타입 메서드이름 (타입 변수명...)(선언부){구현부 =실행할 메서드 적기}
	//생성자:생성자이름(클래스이름과 같음)(){}  !!리턴값(반환타입)없음.!!
	public static PhoneBookManager getInstance() {//모두 사용할 수 있는(public) 값이 변하면 변한 값으로 모두 공유되는, 객체생성 전에도 사용가능한(static)
		//phonebookmanager형태로 반환하는 메서드인 getinstance //폰북매니저 형태란 변수pm을 가짐.?
		if(pm==null) pm = new PhoneBookManager();//만약 pm이 널값이면 pm에는 새로운 변수??생성.
		return pm;//변수 pm값을 반환.
	}
	
	private Person readNomalPerson() {//이 클래스 내에서만 접근할 수 있는 person타입의 메서드readnomalperson
		System.out.print("이름==>");//"내용" 출력하는 메서드
		String name = MenuViwer.sc.nextLine ();//문자열 타입의 변수name에 메뉴뷰어클래스에서 입력받은 값 대입.
		System.out.print("전번==>");
		String phoneNumber = MenuViwer.sc.nextLine();
		System.out.print("생일==>");
		String birth = MenuViwer.sc.nextLine();
		
		return new Person(name, phoneNumber, birth);//입력받은 값들 person타입 형태로 반환
	}
	
	private Person readUnivPerson() {//메서드
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
		//scanner로 입력받는 값은 문자열 타입이라서 정수 타입으로 바꿔서 대입시킴.
		
		return new UniversityPerson(name, phoneNumber,birth, major, grade);
	}//입력받은 값들 universityperson클래스의 타입으로 새로운 값 생성. ?????
	
	private Person readCompPerson() {//메서드
		System.out.print("이름==>");
		String name = MenuViwer.sc.nextLine();;
		System.out.print("전번==>");
		String phoneNumber = MenuViwer.sc.nextLine();;
		System.out.print("생일==>");
		String birth = MenuViwer.sc.nextLine();;
		System.out.print("회사==>");
		String company = MenuViwer.sc.nextLine();;
		return new CompanyPerson(name, phoneNumber,birth, company);
	}//companyperson클래스의 타입따라?? 생성자 따라?? 새로운 값 생성.
	
	void inputData() throws MenuChoiceException{//리턴타입 없는 메서드inputdata
		//메서드에 예외를 선언해서 예외를 처리하는 방법임. throws 블라블라~
		//menuchoiceexception이라는 클래스의 예외를 처리하도록 함.
		//클래스 가보면 모든 예외를 처리하고 
		System.out.print("일반(1), 대학(2), 회사(3)");
		int choice = Integer.parseInt(MenuViwer.sc.nextLine());
		//왜 새로운 변수 선언햇나 
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
			System.out.println("잘못입력했습니다.");
			return;
		}
		infoStorage[curCnt] = tmp;
		curCnt++;
		System.out.println("입력완료");
	}
	
	void allDisplay() {
		for(int i=0; i<curCnt; i++) {
			infoStorage[i].showPhoneinfo();
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
			infoStorage[index].showPhoneinfo();
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
			infoStorage[index].phoneNum =  MenuViwer.sc.nextLine();;
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
