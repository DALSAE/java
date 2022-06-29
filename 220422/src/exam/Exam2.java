package exam;

public class Exam2 {

	public static void main(String[] args) {
		//max와 배열을 순차적으로 비교해서 크면 맥스에 저장
			//최댓값 출력
		
		
		int [] score = {30,50,60,70,80};
		int max = score[0];
		int min = score[0];
		
		for(int i=0; i<score.length; i++ ) { //i값 어디까지 할 지는 스코어 배열 수만큼임!! 그냥 내가 배열 개수세서 하면 변수 ㅑ 바귀면 작동 안함
			if(max<score[i]) {
				max=score[i];
			}
			if(min>score[i]) {
				max=score[i];
			
		}
		}
		/*for(int i=0; i<score.length;i++) {
			if (max<score[i]) {
				max=score[i];
			}
		}*/
		System.out.println("최댓값 : "+max);
		System.out.println("최솟값 : "+min);
			
			
				
			}
		

	}


