package day_08_20220413;

import java.util.Scanner;

public class Ex02_ArrayExample {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int a = 0;
		int b[] = null;
		int c = 0;
		int d = 0;
		int e = 0;
		int max = 0;
		double sum = 0;
		int temp = 0;
		while (run) {
			System.out.println("---------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է�| 3. ��������Ʈ |4.�м�|5. ����");
			System.out.println("---------------------------------------------");
			System.out.print("����>");
			int select = scan.nextInt();

			if (select == 1) {
				System.out.print("�л���:");
				a = scan.nextInt();
				b = new int[a];
				System.out.print("�л�����" + a + "���Դϴ�.");
			} else if (select == 2) {
				
				
				for (int i = 0; i < a; i++) {
					System.out.print("�����Է�:");
					b[i] = scan.nextInt();
				}

			} else if (select == 3) {
				System.out.println("��������Ʈ:");
				for (int i = 0; i < a; i++) {
					System.out.println(i + 1 + "�� ° �л� ����:" + b[i]);

				}
			} else if (select == 4) {
				for (int i = 0; i < b.length; i++) {

					if (b[i] > max) {

						max = b[i];

					}
					sum += b[i];

				}
				System.out.print("�ְ�����:" + max);

				System.out.println("�������:" + sum / b.length);
				for (int i = 0; i < b.length; i++) {
					for (int j = 0; j < b.length; j++) {
						if (b[i] < b[j]) {
							temp = b[i];
							b[i] = b[j];
							b[j] = temp;

						}
					}
				}
				for (int i = 0; i < b.length; i++) {
					System.out.println(b[i]);
				}
			} else if (select == 5)
			{
				run = false;
				System.out.println("����");

			}
		}

	}
}
