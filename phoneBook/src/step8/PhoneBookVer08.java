package step8;

public class PhoneBookVer08 {

	public static void main(String[] args) {
		PhoneBookManager_1 pm = PhoneBookManager_1.getInstance();
		PhoneBookManager_1 pm2 = PhoneBookManager_1.getInstance();

		//System.out.println(pm);
		//System.out.println(pm2);

		int choice = 0;

		while (true) {
			try {
				MenuViwer.showMenu(); // �޼ҵ�2.Ŭ����MenuViwer�� ��޴��� ��
				choice = Integer.parseInt(MenuViwer.sc.nextLine());

				switch (choice) {
				case MainMenu.INPUT: // �������� ������ ����
					pm.inputData(); // �޼ҵ�3.
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
					System.out.println("���α׷� ����");
					pm.saveData();
					return;
				}
			} catch (NumberFormatException e) {
				System.out.println("���ڸ� �Է��ϼ���");
			} catch (MenuChoiceException e) {
				e.showWrongChoice();
				System.out.println("ó������ �ٽ� ����");
			}

		}

	}
	
}
