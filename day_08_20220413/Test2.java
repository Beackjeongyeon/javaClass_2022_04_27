package day_08_20220413;

public class Test2 {
	public static void main(String[] args) {
		int[] number = { 3, 2, 1, 5, 4 };
		System.out.print("정렬전:");
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i]);
		}
		System.out.print("정렬후:");
		for (int i = 0; i < number.length; i++) {
			for (int j = i + 1; j < number.length; j++) {
				if (number[i] < number[j]) {
				int	temp = number[i];
					number[i] = number[j];
					number[j] = temp;
					System.out.println(number[j]);
					
				}
				
			}

		}
	}
}
