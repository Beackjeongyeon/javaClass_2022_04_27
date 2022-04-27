package day27_20220425;

import java.util.Scanner;

public class Cal {

	/*
	 * 1. sum 메서드 1. 매개변수: 정수형 변수 2개 2. 리턴타입: 없음 3. 실행내용: 덧셈 결과 출력
	 * 
	 */

	void sum(int a1, int b1) {
		System.out.println(a1+b1);
	}

	/*
	 * 2. subtraction 메서드 1. 매개변수: 정수형 변수 2개 2. 리턴타입: 없음 3. 실행내용: 뺄셈 결과 출력
	 * 
	 */
	void subtraction(int a1, int b1) {
		int result = a1 - b1;
		System.out.println(result);
	}
		/*
		 *3. multiplication 메서드 
            1. 매개변수: 정수형 변수 2개
            2. 리턴타입: 정수
            3. 실행내용: 곱셈후 곱셈 결과 리턴  
		 * 
		 */
	
	int multiplication(int a1,int b1) {
		int result = a1*b1;
		return result;
	}
	
		/*
		 * 4. division 메서드 
            1. 매개변수: 없음
            2. 리턴타입: 정수
            3. 실행내용: 스캐너로 정수 2개 입력 받고 나눗셈 결과 리턴 
		 * 
		 */
	 int division() {
		 Scanner scan = new Scanner(System.in);
		 int a1 = scan.nextInt();
		 int b1 = scan.nextInt();
		 int result = a1 /b1;
		 return result;
	 }
		 
		 
		 
			 
		 }
	 
	

