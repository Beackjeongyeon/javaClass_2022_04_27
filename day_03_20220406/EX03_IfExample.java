package day_03_20220406;

import java.security.DomainCombiner;
import java.util.Scanner;

public class EX03_IfExample {
	
public static void main(String[] args) {
	/*
	 * 학점 계산 예제
	 * 점수를 하나 입력해서 학점 출력하기
	 * 0보다 작거나 100보다 큰 점수를 입력했다면 입력범위를 초과했습니다. 출력
	 * 90~100 a 
	 * 80~89 b
	 * 70~79 c
	 * 60~69 d
	 * 59 이하 f
	 * 
	 * 조금더 응용ㅇ print 메서드를 3개만 쓰기
	 */
	Scanner scan = new Scanner(Systen.in);
	int score = 0;
	System.out.println("점수:");
	score = scan.nextInt();
	if(score >=0 && score <=100) {
	if(score >=90) {
		System.out.println("A학점입니다.");
	}else if (score >=80) {
		System.out.println("B학점입니다.");
	}else if (score >=70) {
		System.out.println("c학점입니다.");
	}else if (score >=60) {
		System.out.println("D학점입니다.");
	}else {
		System.out.println("F학점입니다.");
	}
			
	}else {
		System.out.println("입력범위 초과");
	}System.out.println(grade +"학점입니다.");


	

