package day_06_20220411;
io
import java.util.Scanner;

public class Ex03_ArrayExample {
	
	public static void main(String[] args) {
		/*ũ�Ⱑ 5�� ������ �迭�� �����ϰ�
		 * ��ĳ�ʷ� ���� �迭�� �����ؼ� �հ�� ��հ��.
		 */
	
	Scanner scan = new Scanner(System.in);
	
	int[]numbers = new int[5];
	
	int[]numbers1 = null;
	numbers1 = new int[5];
	
	int sum = 0;
	
	for(int i =0; i <numbers.length;i++) {
		//int num = scan.nextInt();
		//numbers[i] = num;
		
		System.out.print((i+1) + "�� ° ���� �Է�:");
		numbers[i] = scan.nextInt();
		sum += numbers[i];
	}
	
	System.out.println("�հ�:" + sum);
	System.out.println("���:" + sum/numbers.length);
}
}