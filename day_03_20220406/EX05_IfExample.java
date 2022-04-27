package day_03_20220406;

import java.util.Scanner;

public class EX05_IfExample {
	
	public static void main(String[] args) {
		/*
		 * 합격 불합격 출력하기
		 * 학년(1~4) , 점수(0~100)를 각각입력받는다.
		 * 1~3학년 : 점수 60점이상이면 합격 미만 불합격
		 * 4학년: 점수 70점 합격 미만불함격
		 * 
		 * 학년, 점수는 범위에 맞게 입력했다고 가정.
		 */
	}
	Scanner scan = new Scanner(System.in);
	int year = 0;
	System.out.println("학년");
	year = scan.nextInt();
	System.out.println("점수");
	score = scan.nextInt();
	System
	if(year >=1 && year <4 && score >=60) {
		System.out.println("합격");
	} else if (year == 4 && score >=70) {
		System.out.println("합격");
	} else {
		System.out.println("불합격");
	}
	if(score >=60) {
		//year =1,2,3 score >=60
		System.out.println( "합격");
	}else if (score >=70) {
		System.out.println("합격");
	}else {
		System.out.println("불합격");
	} 
}else {
	System.out.println("불합격");
}
	

}
