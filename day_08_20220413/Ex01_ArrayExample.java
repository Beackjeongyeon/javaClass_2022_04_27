package day_08_20220413;

import java.util.Scanner;

public class Ex01_ArrayExample {
	
public static void main(String[] args) {
	//��ĳ�ʷ� �Է¹��� ������ �迭 ũ�� �����ϱ�
	//ũ�� 5�� ������ �迭
	int[] numbers = new int[5];
	
	int[] numbers1 = null;
	numbers1 = new int[5];
	System.out.println(numbers1.length);
	
	Scanner scan = new Scanner(System.in);
	int size = 0;
	int[] numbers2 = null;
	size = scan.nextInt();
// size�� �Էµ� ���� numbers2 �� ũ��� �����ϱ�
   
	numbers2 = new int[size];
	System.out.println(numbers2.length);

	}

}
