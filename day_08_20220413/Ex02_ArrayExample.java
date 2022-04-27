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
			System.out.println("1.학생수 | 2.점수입력| 3. 점수리스트 |4.분석|5. 종료");
			System.out.println("---------------------------------------------");
			System.out.print("선택>");
			int select = scan.nextInt();

			if (select == 1) {
				System.out.print("학생수:");
				a = scan.nextInt();
				b = new int[a];
				System.out.print("학생수는" + a + "명입니다.");
			} else if (select == 2) {
				
				
				for (int i = 0; i < a; i++) {
					System.out.print("점수입력:");
					b[i] = scan.nextInt();
				}

			} else if (select == 3) {
				System.out.println("점수리스트:");
				for (int i = 0; i < a; i++) {
					System.out.println(i + 1 + "번 째 학생 점수:" + b[i]);

				}
			} else if (select == 4) {
				for (int i = 0; i < b.length; i++) {

					if (b[i] > max) {

						max = b[i];

					}
					sum += b[i];

				}
				System.out.print("최고점수:" + max);

				System.out.println("평균점수:" + sum / b.length);
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
				System.out.println("종료");

			}
		}

	}
}
