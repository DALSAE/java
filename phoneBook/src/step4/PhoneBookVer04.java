package step4;


public class PhoneBookVer04 {
	
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
			case 1:
				pm.inputData();  //�޼ҵ�3.
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
				System.out.println("���α׷� ����");
				return;
			}
			
		}
		
	}
	
	

}
