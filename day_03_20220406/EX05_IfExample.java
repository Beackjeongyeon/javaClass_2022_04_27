package day_03_20220406;

import java.util.Scanner;

public class EX05_IfExample {
	
	public static void main(String[] args) {
		/*
		 * �հ� ���հ� ����ϱ�
		 * �г�(1~4) , ����(0~100)�� �����Է¹޴´�.
		 * 1~3�г� : ���� 60���̻��̸� �հ� �̸� ���հ�
		 * 4�г�: ���� 70�� �հ� �̸����԰�
		 * 
		 * �г�, ������ ������ �°� �Է��ߴٰ� ����.
		 */
	}
	Scanner scan = new Scanner(System.in);
	int year = 0;
	System.out.println("�г�");
	year = scan.nextInt();
	System.out.println("����");
	score = scan.nextInt();
	System
	if(year >=1 && year <4 && score >=60) {
		System.out.println("�հ�");
	} else if (year == 4 && score >=70) {
		System.out.println("�հ�");
	} else {
		System.out.println("���հ�");
	}
	if(score >=60) {
		//year =1,2,3 score >=60
		System.out.println( "�հ�");
	}else if (score >=70) {
		System.out.println("�հ�");
	}else {
		System.out.println("���հ�");
	} 
}else {
	System.out.println("���հ�");
}
	

}
