package day_07_20220412;

public class Ex03_ArraySort {
	public static void main(String[] args) {

		int[] number = { 3, 2, 1, 5, 4 };
		System.out.print("정렬전:");
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i]);
		}
		/*int temp = 0;
		temp = number[0];
		number[0] = number[2];
		number[2] = temp;
		/*temp = number[3];
		number[3] = number[4];
		number[4] = temp;*/
		
		/*1턴: 0-1, 0-2, 0-3, 0-4
		/ 2턴: 1-2, 1-3, 1-4
		  3턴: 2-3, 2-4
		  4턴: 3-4
		*/
		
		for(int i =0; i<number.length; i++) {
		for(int j = i +1; j <number.length; j++) {
			if(number[i] <number[j]) {
				temp = number[i];
				number[i] = number[j];
				number[j] = temp;
			}
		}
		/*for(int i=0;i<number.length;i++){
		for(int j=0;j<number.length;j++) 
		{
			if(number[i]<number[j]) {
			temp = number[i];
			number[i] = number[j];
			number[j] = temp;
			}
			
		}
		
			
		}
		
		
		System.out.println("\n정렬후:");
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i]);*/
		}

	}

}
