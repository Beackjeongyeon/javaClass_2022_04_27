package day_03_20220406;

import java.util.Scanner;

public class Ex01_IFExample {

	public static void main(String[]args) {
		// TODO Auto-generated method stub
		/*
		 * ��ĳ�ʷ� ������ �Է¹޾� �Է¹��� ������ ������� �������� ���
		 * 0�� �Է��ߴٸ� 0�Դϴ�. ���
		 */
		Scanner scan = new Scanner(System.in);
		int num = (0);
		System.out.println("�����Է�:");
		num = scan.nextInt();
		System.out.println("�Է��� ���� :"+ num);
		if(num >0) {
			System.out.println("����Դϴ�.");
		}	else if(num< 0) {
			System.out.println("�����Դϴ�.");
		}	else if(num ==0) {
			System.out.println("0�Դϴ�.");
		}			
	  }
	}

