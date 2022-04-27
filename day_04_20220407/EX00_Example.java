package day_04_20220407;

import java.util.Scanner;

public class EX00_Example {//1~100 3배수
public static void main(String[] args) {
	/*
	 * 정수를 하나 입력 받아서 입력받은 숫자가
	 * 3 의 배수인지
	 * 5 의 배수인지
	 * 5 의 공배수인지
	 * 3 의 배수도 아니고 5의 배수도 아닌지 출력
	 * 음수를 입력하면 0보다 큰수를 입력하세요 출력
	 */
	
	int a=0;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("num:");
	int num = Sc.nextInt();
	if(a%3==0 && a%5==0) {
		System.out.println("3과 5의 공배수");
		}if (a<0){
			System.out.println("3과 5의 공배수가 아님");
		}else {System.out.println("0보다 큰수를 입력하세요.");
	}
	}
}
