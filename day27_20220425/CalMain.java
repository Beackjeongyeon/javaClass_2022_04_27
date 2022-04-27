package day27_20220425;

import java.util.Scanner;

public class CalMain {
	public static void main(String[] args) {

		Cal cal1 = new Cal();
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int a1 = 0, b1 = 0, Number = 0;
		while (run) {
			System.out.println("===========================");
			System.out.println("1.덧셈 | 2. 뺄셈 |3. 곱셈 |4. 나눗셈");
			System.out.println("===========================");
			System.out.println("선택>");
			Number = scan.nextInt();
			if (Number == 1) {
				System.out.println("숫자:");
				a1 = scan.nextInt();
				System.out.println("숫자:");
				b1 = scan.nextInt();
				cal1.sum(a1, b1);

			} else if (Number == 2) {
				System.out.println("숫자:");
				a1 = scan.nextInt();
				System.out.println("숫자:");
				b1 = scan.nextInt();
				cal1.subtraction(a1, b1);

			} else if (Number == 3) {
				System.out.println("숫자:");
				a1 = scan.nextInt();
				System.out.println("숫자:");
				b1 = scan.nextInt();
				cal1.multiplication(a1, b1);
			} else if (Number == 4) {
				System.out.println(cal1.division());

			}
		}
	}
}
