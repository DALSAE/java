package step3;


public class PhoneBookVer03 {
	
	public static void main(String[] args) { 
		PhoneBookManager pm = new PhoneBookManager();
		
		int choice = 0;
		
		while(true) {
			MenuViwer.showMenu();  //메소드2.클래스MenuViwer의 쇼메뉴를 함
			choice = Integer.parseInt(MenuViwer.sc.nextLine());
			
			switch(choice) {
			case 1:
				pm.inputData();  //메소드3.
				break; 
			
			case 2:
				pm.searchData();
				break;
			case 3:
				pm.updateData();
				break;
			case 4:
				pm.deleteData();
				break;
			case 6:
				pm.allDisplay();
				break;	
			case 7:
				System.out.println("프로그램 종료");
				return;
			}
			
		}
		
	}
	
	

}
