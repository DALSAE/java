package chapter0703;

public class Buyer {
	int money = 1000;
	int bonusPoint = 0; //������ ��. ����Ʈ�� �� ��.
	Product [] item = new Product[10];
	int curCnt=0;
	
	void buy(Product p) {//()�ȿ��� �Ű�����
		if(money < p.price) {
			System.out.println("�ܾ׺���. ���ԺҰ�.");
			return;
		}
		money = money - p.price;//false�� �������� �ٷ� �����ϱ� else 
		//���ʿ� ����
		bonusPoint = bonusPoint + p.bonusPoint;
		
		item[curCnt]= p;
		curCnt++;
		//System.out.println(p+"��/�� �����߽��ϴ�.");
		System.out.println();
	}
	
	void summary() {
		int sum=0;
		String itemList="";
		
		for(int i=0; i<item.length; i++) {
			if(item[i]==null) break;
			sum+= item[i].price;
			itemList += item[i] + ", ";
		}
		System.out.println("�����Ͻ� ��ǰ�� �ѱݾ��� "+sum+"�����Դϴ�. ");
		System.out.println("�����Ͻ� ��ǰ�� "+itemList+"�Դϴ�. ");
	}
}