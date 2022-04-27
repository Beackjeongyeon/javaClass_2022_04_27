package Test;

public class Example14 {
	public static void main(String[] args) {
		int[]score = {87,86,32};
		int sum = 0;
		System.out.println("score[0]의점수:"+score[0]);
		System.out.println("score[1]의점수:"+score[1]);
		System.out.println("score[2]의점수:"+score[2]);
		
		for(int i =0;i<3;i++) {
			sum+=score[i];
			}
		
		System.out.println("총합계="+sum);
		double avg =(double)sum/3;
		System.out.println("평균="+avg);
	}

}       


