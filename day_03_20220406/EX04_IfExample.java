package day_03_20220406;

import java.util.Scanner;

public class EX04_IfExample {

	public static void main(String[] args) {
		/*
		 * 정수를 하나 입력 받아서 입력받은 숫자가
		 * 3 의 배수인지
		 * 5 의 배수인지
		 * 5 의 공배수인지
		 * 3 의 배수도 아니고 5의 배수도 아닌지 출력
		 * 음수를 입력하면 0보다 큰수를 입력하세요 출력
		 */
		Scanner scan = new Scanner(System.in);
		
		
		int num = 0;
		System.out.println(":");
		num = scan.nextInt();
		if(num >0) {
			if(num %3==0 && num%5==0) {
				System.out.println("3과 5의 공배수");
			}else if(num %3 ==0) {
				System.out.println("3의 배수");
			}else if(num %5 == 0) {
				System.out.println("5의 배수");
			}else {
				System.out.println("3 또는 5의 배수가 아닙니다.");
			}
		}else {
			System.out.println("0보다 큰수를 입력해주세요.");
		}
	}
}
