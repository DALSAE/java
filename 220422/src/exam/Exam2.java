package exam;

public class Exam2 {

	public static void main(String[] args) {
		//max�� �迭�� ���������� ���ؼ� ũ�� �ƽ��� ����
			//�ִ� ���
		
		
		int [] score = {30,50,60,70,80};
		int max = score[0];
		int min = score[0];
		
		for(int i=0; i<score.length; i++ ) { //i�� ������ �� ���� ���ھ� �迭 ����ŭ��!! �׳� ���� �迭 �������� �ϸ� ���� �� �ٱ͸� �۵� ����
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
		System.out.println("�ִ� : "+max);
		System.out.println("�ּڰ� : "+min);
			
			
				
			}
		

	}


