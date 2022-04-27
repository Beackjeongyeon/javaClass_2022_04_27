package day_03_20220406;

import java.util.Scanner;

public class EX02_IfExample {
	
	public static void main(String[] args) {
		/*
		 * 홀수 , 짝수 판별하기
		 * 스캐너로 정수 입력받아서
		 * 홀수 , 짝수 인지를 출력하기
		 * 0보다 작은 입력에 대해서는 0보다 큰 수를 입력하세요라고 출력.
		 */
		Scanner scan = new Scanner(System.in);
		int num = 0;
		System.out.println("숫자를 입력하세요:");
		num = scan.nextInt();
		
		if(num%2 == 0) {
			System.out.println("짝수입니다.");
		} else if (num % 2 == 1) {
			System.out.println("홀수입니다.");
		} else if (num <= 0 ) {
			System.out.println("0보다 큰 수를 입력해주세요.");
		}
		
		try (/* && 연산을 조건식에 적용해보기
				 * 짝수이면서 양수라면 짝수입니다. 출력
				 * 홀수이면서 양수라면 짝수입니다. 출력
				 * 그렇지않다면 0보다 큰수를 입력해 주세요. 출력
				 */
		Scanner scan1 = new Scanner(System.in)) {
			int num1 = 0;
			System.out.println("숫자를 입력하세요");
			num1 = scan1.nextInt();
			
			if(num1 % 2 == 0 && num1 >0) {
				System.out.println("짝수이면서 양수라면 출력입니다.");
			} else if( num1 % 2 == 1 && num1 >0 ) {
				System.out.println("홀수이면서 양수라면 출력입니다.");
			} else {
				System.out.println("0보다 큰수를 입력해주세요.");
			}
			// 중첩 if 
			if(num > 0) {
				//0 보다 큰 숫자를 가지고 홀 ,짝수 판단
				if(num %2 ==0) {
					System.out.println("짝수입니다.");
				}else if( num%2 ==1) {
					System.out.println("홀수입니다.");
				}
			}else { 
				System.out.println("0보다 큰 수를 입력해주세요.");
			}
		}	
		
		
	}

}
