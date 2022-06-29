package step7;

public class PhoneBookVer07 {

	public static void main(String[] args) {
		PhoneBookManager pm = PhoneBookManager.getInstance();
		PhoneBookManager pm2 = PhoneBookManager.getInstance();

		//System.out.println(pm);
		//System.out.println(pm2);

		int choice = 0;

		while (true) {
			try {
				MenuViwer.showMenu(); // 메소드2.클래스MenuViwer의 쇼메뉴를 함
				choice = Integer.parseInt(MenuViwer.sc.nextLine());

				switch (choice) {
				case MainMenu.INPUT: // 상수사용한 가독성 증가
					pm.inputData(); // 메소드3.
					break;
				case MainMenu.SEARCH:
					pm.searchData();
					break;
				case MainMenu.UPDATE:
					pm.updateData();
					break;
				case MainMenu.DELETE:
					pm.deleteData();
					break;
				case MainMenu.DISPLAY:
					pm.allDisplay();
					break;
				case MainMenu.DELETEALL:
					pm.deleteAll();
					break;
				case MainMenu.EXIT:
					System.out.println("프로그램 종료");
					return;
				}
			} catch (NumberFormatException e) {
				System.out.println("숫자만 입력하세요");
			} catch (MenuChoiceException e) {
				e.showWrongChoice();
				System.out.println("처음부터 다시 진행");
			}

		}

	}

}
