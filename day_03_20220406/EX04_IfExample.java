package day_03_20220406;

import java.util.Scanner;

public class EX04_IfExample {

	public static void main(String[] args) {
		/*
		 * ������ �ϳ� �Է� �޾Ƽ� �Է¹��� ���ڰ�
		 * 3 �� �������
		 * 5 �� �������
		 * 5 �� ���������
		 * 3 �� ����� �ƴϰ� 5�� ����� �ƴ��� ���
		 * ������ �Է��ϸ� 0���� ū���� �Է��ϼ��� ���
		 */
		Scanner scan = new Scanner(System.in);
		
		
		int num = 0;
		System.out.println(":");
		num = scan.nextInt();
		if(num >0) {
			if(num %3==0 && num%5==0) {
				System.out.println("3�� 5�� �����");
			}else if(num %3 ==0) {
				System.out.println("3�� ���");
			}else if(num %5 == 0) {
				System.out.println("5�� ���");
			}else {
				System.out.println("3 �Ǵ� 5�� ����� �ƴմϴ�.");
			}
		}else {
			System.out.println("0���� ū���� �Է����ּ���.");
		}
	}
}
