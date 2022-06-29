package step6;

public class MenuChoiceException extends Exception {
	int wrongChoice;
	
	public MenuChoiceException(int choice) {
		super("잘못된 선택이 이루어졌습니다.");
		//초이스라는 변수 선언하고 /""메세지를 출력한다??? 
		wrongChoice = choice;//변수 wr에 choice 값 저장??? 
	}
	public void showWrongChoice() {
		System.out.println(wrongChoice+"에 해당하는 선택은 존재하지 않습니다. ");
	}
}
