package lambda;

@FunctionalInterface
public interface MyFunction {
	//인텊-이스 는 메서드는 모두 퍼블릭 애브스트랙트 
	public abstract int max(int a, int b); //구현부x
}	//람다식 사용하려면 메서드 하나만 딱 있어야함
