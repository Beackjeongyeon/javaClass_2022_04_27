package day_08_20220413;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;

		while (run) {
			System.out.println("1. �Ա� | 2. ��� |3. �ܾ� | 4. ���� |");
			System.out.println("����>");
			int select = scan.nextInt();
			if (select == 1) {
				System.out.println("�Ա�");
				a = scan.nextInt();
				c += a;
				System.out.println("�ܾ���" + c + "�� �Դϴ�.");
			} else if (select == 2) {
				System.out.println("���");
				b = scan.nextInt();
				c -= b;
				if (c < b) {
					System.out.println("�ܾ��� �����մϴ�.");
				} else if (b < c) {
					c -= b;
					System.out.println("�ܾ���" + c + "�� �Դϴ�.");
				}
			} else if (select == 3) {
				System.out.println("�ܾ�" + c + "�� �Դϴ�.");
			} else if (select == 4) {
				run = false;
				System.out.println("�����մϴ�.");
			}

		}

	}
}
