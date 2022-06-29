package step5;


public class PhoneBookVer05 {
	
	public static void main(String[] args) { 
		PhoneBookManager pm = PhoneBookManager.getinstance();
		PhoneBookManager pm2 = PhoneBookManager.getinstance();
		
		System.out.println(pm);
		System.out.println(pm2);
		
		int choice = 0;
		
		while(true) {
			MenuViwer.showMenu();  //�޼ҵ�2.Ŭ����MenuViwer�� ��޴��� ��
			choice = Integer.parseInt(MenuViwer.sc.nextLine());
			
			switch(choice) {
			case MainMenu.INPUT: //�������� ������ ����
				pm.inputData();  //�޼ҵ�3.
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
			case MainMenu.EXIT:
				System.out.println("���α׷� ����");
				return;
			}
			
		}
		
	}
	
	

}
