package day_04_20220407;

public class EX01_For {

	public static void main(String[] args) {
		// 1���� 5���� ����ϴ� �ڵ带 �ۼ��غ�����
		System.out.println("for �� ������");
	
		for(int i = 1; i<=3; i++) {
			System.out.println(i); //1 2 3
			// for �� �ȿ� ����� 1~3�� ���ڸ� ��Ÿ��
		}
		
		for(int i = 1; i<3; i++) {
			System.out.println(i); // 1 2
			/* 3��ǥ����� ���������� i �� ���� 3�������Ͽ�����
			  / �������� i<3 �� default �Ǳ� ������ 3�� ���
			   �����ʴ´�.*/
		}
		for(int i = 1; i==3; i++) {
			System.out.println(i); // ��¾���
			/*
			 * int i �ǰ��� 1 �� ����Ǿ����� �������� 3 ������
			 * �ʱ⶧���� default �ȴ�. 
			 */
		}
		for(int i = 1; i<=10; i+=2) {
			System.out.println(i); 
		}
		
		System.out.println("for �� ���� ��");
		
		 
	
	}
}
