package day_04_20220407;

import java.util.Scanner;

public class EX00_Example {//1~100 3���
public static void main(String[] args) {
	/*
	 * ������ �ϳ� �Է� �޾Ƽ� �Է¹��� ���ڰ�
	 * 3 �� �������
	 * 5 �� �������
	 * 5 �� ���������
	 * 3 �� ����� �ƴϰ� 5�� ����� �ƴ��� ���
	 * ������ �Է��ϸ� 0���� ū���� �Է��ϼ��� ���
	 */
	
	int a=0;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("num:");
	int num = Sc.nextInt();
	if(a%3==0 && a%5==0) {
		System.out.println("3�� 5�� �����");
		}if (a<0){
			System.out.println("3�� 5�� ������� �ƴ�");
		}else {System.out.println("0���� ū���� �Է��ϼ���.");
	}
	}
}
