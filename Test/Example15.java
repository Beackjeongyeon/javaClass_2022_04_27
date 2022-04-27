package Test;

public class Example15 {
	public static void main(String[] args) {
		int sum=0;
		int[]score={83,80,78};{
		for(int i =0;i<score.length;i++) {
			sum+=score[i];
			System.out.println(score[i]);
			
		}
		System.out.println("score의 합:"+sum);
		System.out.println("score의 평균값:"+sum/score.length);
		
	}

}
}
