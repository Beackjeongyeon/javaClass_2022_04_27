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
			System.out.println("1. 입금 | 2. 출금 |3. 잔액 | 4. 종료 |");
			System.out.println("선택>");
			int select = scan.nextInt();
			if (select == 1) {
				System.out.println("입금");
				a = scan.nextInt();
				c += a;
				System.out.println("잔액은" + c + "원 입니다.");
			} else if (select == 2) {
				System.out.println("출금");
				b = scan.nextInt();
				c -= b;
				if (c < b) {
					System.out.println("잔액이 부족합니다.");
				} else if (b < c) {
					c -= b;
					System.out.println("잔액은" + c + "원 입니다.");
				}
			} else if (select == 3) {
				System.out.println("잔액" + c + "원 입니다.");
			} else if (select == 4) {
				run = false;
				System.out.println("종료합니다.");
			}

		}

	}
}
