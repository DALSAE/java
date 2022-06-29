package chapter0703;

public class Buyer {
	int money = 1000;
	int bonusPoint = 0; //생성자 없. 디폴트값 들어갈 것.
	Product [] item = new Product[10];
	int curCnt=0;
	
	void buy(Product p) {//()안에는 매개변수
		if(money < p.price) {
			System.out.println("잔액부족. 구입불가.");
			return;
		}
		money = money - p.price;//false면 이쪽으로 바로 빠지니까 else 
		//쓸필요 ㄴㄴ
		bonusPoint = bonusPoint + p.bonusPoint;
		
		item[curCnt]= p;
		curCnt++;
		//System.out.println(p+"을/를 구입했습니다.");
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
		System.out.println("구입하신 물품의 총금액은 "+sum+"만원입니다. ");
		System.out.println("구입하신 물품은 "+itemList+"입니다. ");
	}
}
