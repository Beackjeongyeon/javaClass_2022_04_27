package day_05_20220408;

import java.util.Scanner;

public class TEST {
	public static void main(String[] args) {
		int input = 0; // �����Է�
		int count = 0; // �Է�Ƚ��
		boolean run = true;
		Scanner scan = new Scanner(System.in);
		System.out.println("UP&Down");
		final int answer = (int)(Math.random()*100)+1;
		do {
			System.out.println("1���� 100������ ���ڸ� �Է��ϼ��� :" + answer);
			input = scan.nextInt();
			count++;
			if(input >answer) {
				System.out.println("�� ���� ���� �Է��ϼ���.");
			}else if (input <answer) {
				System.out.println("�� ū ���� �Է��ϼ���.");
			}else {
				System.out.println("������ϴ�.");
				System.out.println("�õ� Ƚ����" + count + "ȸ�Դϴ�.");
				run = false;
			}
		}while(run);
		
		
	}

}
