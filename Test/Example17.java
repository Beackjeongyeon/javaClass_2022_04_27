package Test;

public class Example17 {
public static void main(String[] args) {
	
	int[][]array = {
			{95,86},
			{83,92,96},
			{75,83,93,87,88}
	};
	
	int sum = 0;
	double avg = 0.0;
	//작성위치
	for(int i=0;i<array.length;i++) {
		sum+=array[i][i];
	}
	
	
	System.out.println("sum:"+sum);
	System.out.println("avg:"+avg);
}
}
