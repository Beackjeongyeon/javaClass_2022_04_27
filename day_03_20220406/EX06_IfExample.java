package day_03_20220406;

import java.util.Scanner;

public class EX06_IfExample {
	
	public static void main(String[] args) {
		/*
		 * ���� �ٸ� 3���� ������ �Է� �޾Ƽ� ���� ū�� �Է��ϱ�
		 * ���� ����
		 * ù���� ���� :20
		 * �ιݤ� ���� :22
		 * ����° ���� :18
		 * ���� ū ���� 22�Դϴ�.
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		int num1 = 0 , num2 = 0 , num3= 0;
		System.out.println("����1");
		num1 = scan.nextInt;
		System.out.println("����1");
		num2 = scan.nextInt;
		System.out.println("����1");
		num3 = scan.nextInt;
		
		if(num1 > num2 && num1>num3) {
			System.out.println("���� ū ���� " +num1);
		}if(num2 > num1 && num2>num3) {
			System.out.println("���� ū ���� " +num2);
		}if(num3 > num1 && num3>num1) {
			System.out.println("���� ū ���� " +num3);
		}
		
		int max = 0; //�ִ��� ��� ����
		if(num1 > num2) {
			if(num1>num3) {
				max = num1;
			} else {
				max = num3;
			}
		}else { 
			if(num2 >num3) {
				max = num2;
			} else {
				max =num3;
			}
		}
		System.out.println("���� ū ����" + max);
	}

}
