package day_03_20220406;

import java.util.Scanner;

public class EX08_SwitchCaseExample {
	
	public static void main(String[] args) {
		/*
		 * 간단한 사전
		 * 4개의 단어만 가지고 있는 사전
		 * dest(책상), chair(의자) , monitor(모니터) , mouse(마우스)
		 * 
		 * 실행하면 영어 단어를 입력받고 해당 의미를 출력해줌.
		 * 사전에 없는 단어를 입력하면 "사전에 없는 단어입니다." 출력
		 */
		
		Scanner scan = new Scanner(System.in);
		String word ="";
		System.out.println("영어단어 입력:");
		word =scan.nextLine();
		switch(word) { 
		case "desk":
		System.out.println("desk 의뜻은 책상입니다.");
		break;
		case "monitor":
		System.out.println("monitor 의뜻은 모니터입니다.");
		break;
		case "mouse":
		System.out.println("desk 의뜻은 마우스입니다.");
		break;
		default:
		System.out.println("사전에 없는 단어입니다.");
		break;
	}

}
