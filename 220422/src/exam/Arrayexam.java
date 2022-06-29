package exam;

public class Arrayexam {

	public static void main(String[] args) {

		int [] score = {20,30,100,88,90};
		
		int sum=0;
		double avg=0.0;
		
		for(int i=0; i < score.length; i++) {
			sum = sum + score[i];
		}
		avg = sum / (double)score.length;
		
	}

}
