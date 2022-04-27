package Test;

public class Example16 {
	public static void main(String[] args) {

		int max = 0;
		int num = 0;
		int[] Array = { 1, 5, 3, 8, 2 };
	for(int i =0;i<Array.length;i++) {
		if(max <Array[i]) {
			max = Array[i];
		}

	}
	System.out.println(max);
	}
}