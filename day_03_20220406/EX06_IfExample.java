package day_03_20220406;

import java.util.Scanner;

public class EX06_IfExample {
	
	public static void main(String[] args) {
		/*
		 * 서로 다른 3개의 정수를 입력 받아서 가장 큰수 입력하기
		 * 실행 예시
		 * 첫번쨰 숫자 :20
		 * 두반쨰 숫자 :22
		 * 세번째 숫자 :18
		 * 가장 큰 수는 22입니다.
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		int num1 = 0 , num2 = 0 , num3= 0;
		System.out.println("숫자1");
		num1 = scan.nextInt;
		System.out.println("숫자1");
		num2 = scan.nextInt;
		System.out.println("숫자1");
		num3 = scan.nextInt;
		
		if(num1 > num2 && num1>num3) {
			System.out.println("가장 큰 수는 " +num1);
		}if(num2 > num1 && num2>num3) {
			System.out.println("가장 큰 수는 " +num2);
		}if(num3 > num1 && num3>num1) {
			System.out.println("가장 큰 수는 " +num3);
		}
		
		int max = 0; //최댓값을 담는 변수
		if(num1 > num2) {
			if(num1>num3) {
				max = num1;
			} else {
				max = num3;
			}
		}else { 
			if(num2 >num3) {
				max = num2;
			} else {
				max =num3;
			}
		}
		System.out.println("가장 큰 수는" + max);
	}

}
