package day_04_20220407;

public class EX03_ForExample {

	public static void main(String[] args) {
		// 1���� 10������ �հ豸�ϱ�
		// ������
		// ��� ����� 1+2+3+4+5+6+7+8+9+10=55 ���������� �ϼ���.

		int sum = 0;
		for(int i=1;i<=10;i++) {
			sum+=i;
		//	sum = sum+i;
		System.out.print(i);
		if(i<10) {
			System.out.print("+");
		  }else {
			System.out.print("=");
		  }
		}
		System.out.println(sum);
	}
}
		
		
		
		
	

