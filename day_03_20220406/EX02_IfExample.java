package day_03_20220406;

import java.util.Scanner;

public class EX02_IfExample {
	
	public static void main(String[] args) {
		/*
		 * Ȧ�� , ¦�� �Ǻ��ϱ�
		 * ��ĳ�ʷ� ���� �Է¹޾Ƽ�
		 * Ȧ�� , ¦�� ������ ����ϱ�
		 * 0���� ���� �Է¿� ���ؼ��� 0���� ū ���� �Է��ϼ����� ���.
		 */
		Scanner scan = new Scanner(System.in);
		int num = 0;
		System.out.println("���ڸ� �Է��ϼ���:");
		num = scan.nextInt();
		
		if(num%2 == 0) {
			System.out.println("¦���Դϴ�.");
		} else if (num % 2 == 1) {
			System.out.println("Ȧ���Դϴ�.");
		} else if (num <= 0 ) {
			System.out.println("0���� ū ���� �Է����ּ���.");
		}
		
		try (/* && ������ ���ǽĿ� �����غ���
				 * ¦���̸鼭 ������ ¦���Դϴ�. ���
				 * Ȧ���̸鼭 ������ ¦���Դϴ�. ���
				 * �׷����ʴٸ� 0���� ū���� �Է��� �ּ���. ���
				 */
		Scanner scan1 = new Scanner(System.in)) {
			int num1 = 0;
			System.out.println("���ڸ� �Է��ϼ���");
			num1 = scan1.nextInt();
			
			if(num1 % 2 == 0 && num1 >0) {
				System.out.println("¦���̸鼭 ������ ����Դϴ�.");
			} else if( num1 % 2 == 1 && num1 >0 ) {
				System.out.println("Ȧ���̸鼭 ������ ����Դϴ�.");
			} else {
				System.out.println("0���� ū���� �Է����ּ���.");
			}
			// ��ø if 
			if(num > 0) {
				//0 ���� ū ���ڸ� ������ Ȧ ,¦�� �Ǵ�
				if(num %2 ==0) {
					System.out.println("¦���Դϴ�.");
				}else if( num%2 ==1) {
					System.out.println("Ȧ���Դϴ�.");
				}
			}else { 
				System.out.println("0���� ū ���� �Է����ּ���.");
			}
		}	
		
		
	}

}
