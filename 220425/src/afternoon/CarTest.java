package afternoon;

public class CarTest {

	public static void main(String[] args) {
		Car c1 = new Car();
		//c1.color = "white";
		//c1.gearType = "auto";
		//c1.door = 4;
		
		Car c2 = new Car("white", "auto", 4);
		
		Car c3 = new Car("red");
		
		System.out.println("c1�� color=" + c1.color+", gearType="+c1.gearType+", door="+c1.door);
				System.out.println("c2�� color=" + c2.color+", gearType="+c2.gearType+", door="+c2.door);

		System.out.println("c3�� color=" + c3.color+", gearType="+c3.gearType+", door="+c3.door);
	}

}

//Ŭ���� �� ���� ����� �׽�Ʈ �ϴ� �ͱ���. �׽�Ʈ�� �ѱ������� �ص� ��.����� ���Ϸ� ��Ʈ�� �ڵ��� ,,, 