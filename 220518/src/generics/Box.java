package generics;

public class Box<T> {//t는 아직 안정해졌다는 의미. 
	T item;

	public T getItem() {
		return item; //값 ㄲㅓ내서 알려줌 
	}

	public void setItem(T item) { //값 지정?저장/해줌 
		this.item = item;
	}
	
	

}
