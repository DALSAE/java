package genericExam;

public class FruitBoxEx1 {

	public static void main(String[] args) {
		Box<Fruit> fruitBox = new Box<Fruit>();
		Box<Apple> appleBox = new Box<>(); //뒤에는 <> 생략해도 자동으로 같은 지네릭값 들어감 
		Box<Toy> toyBox = new Box<Toy>();
		Box<Grape> grapeBox = new Box<Grape>();
		FruitBox<Fruit> fb = new FruitBox<Fruit>();
		//FruitBox<Toy> fb2 = new FruitBox<>();
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		
		appleBox.add(new Apple());
		appleBox.add(new Apple());
		//appleBox.add(new Toy());
		
		toyBox.add(new Toy());
		//toyBox.add(new Apple());
		grapeBox.add(new Grape());
		
		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(grapeBox);
		System.out.println(toyBox);
		
	}

}
