package day_06_20220411;

import java.util.Scanner;

public class EX04_ArrayExample {
public static void main(String[] args) {

	//ũ�Ⱑ 5�� ������ �迭�� �����ϰ�
	//��ĳ�ʷ� ���� ���� ��
	//�Է¹��� �� �߿��� ���� ū ���� ����Ͻÿ�.
	Scanner scan = new Scanner(System.in);
	int[]num =new int[5];
	int max = 0;
	// �迭�� �� �ֱ�
	for(int i =0; i <num.length;i++) {
		 num[i] = scan.nextInt();}
	// �ִ� ã��
	for(int i =0; i <num.length;i++) {
		 if(max < num[i]) {
			 max =num[i];
			 
		 
	}
	}
	System.out.println("�ִ�" +max);

	

	
}

}


