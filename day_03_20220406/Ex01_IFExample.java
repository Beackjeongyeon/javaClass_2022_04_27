package day_03_20220406;

import java.util.Scanner;

public class Ex01_IFExample {

	public static void main(String[]args) {
		// TODO Auto-generated method stub
		/*
		 * 스캐너로 정수를 입력받아 입력받은 정수가 양수인지 음수인지 출력
		 * 0을 입력했다면 0입니다. 출력
		 */
		Scanner scan = new Scanner(System.in);
		int num = (0);
		System.out.println("정수입력:");
		num = scan.nextInt();
		System.out.println("입력한 정수 :"+ num);
		if(num >0) {
			System.out.println("양수입니다.");
		}	else if(num< 0) {
			System.out.println("음수입니다.");
		}	else if(num ==0) {
			System.out.println("0입니다.");
		}			
	  }
	}

