package day_06_20220411;
io
import java.util.Scanner;

public class Ex03_ArrayExample {
	
	public static void main(String[] args) {
		/*크기가 5인 정수형 배열을 선언하고
		 * 스캐너로 값을 배열에 저장해서 합계와 평균계산.
		 */
	
	Scanner scan = new Scanner(System.in);
	
	int[]numbers = new int[5];
	
	int[]numbers1 = null;
	numbers1 = new int[5];
	
	int sum = 0;
	
	for(int i =0; i <numbers.length;i++) {
		//int num = scan.nextInt();
		//numbers[i] = num;
		
		System.out.print((i+1) + "번 째 숫자 입력:");
		numbers[i] = scan.nextInt();
		sum += numbers[i];
	}
	
	System.out.println("합계:" + sum);
	System.out.println("평균:" + sum/numbers.length);
}
}