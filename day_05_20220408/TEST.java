package day_05_20220408;

import java.util.Scanner;

public class TEST {
	public static void main(String[] args) {
		int input = 0; // 숫자입력
		int count = 0; // 입력횟수
		boolean run = true;
		Scanner scan = new Scanner(System.in);
		System.out.println("UP&Down");
		final int answer = (int)(Math.random()*100)+1;
		do {
			System.out.println("1부터 100까지의 숫자를 입력하세요 :" + answer);
			input = scan.nextInt();
			count++;
			if(input >answer) {
				System.out.println("더 작은 수를 입력하세요.");
			}else if (input <answer) {
				System.out.println("더 큰 수를 입력하세요.");
			}else {
				System.out.println("맞췄습니다.");
				System.out.println("시도 횟수는" + count + "회입니다.");
				run = false;
			}
		}while(run);
		
		
	}

}
