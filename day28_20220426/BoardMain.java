package day28_20220426;

import java.util.Scanner;

public class BoardMain {
	public static void main(String[] args) {
		
		
		Board board1 = new Board(1,"1234","게시판1","백정연","내용1",0);
		
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("비밀번호를 입력하세요:");
		String password = scan.next();
		boolean loginResult =board1.password(password);
		if(loginResult) {
			System.out.println("로그인성공");
		}else {
			System.out.println("아이디 또는 비밀번호를 확인해주세요");
		}
		System.out.println("제목을 작성해주세요:");
		String title = scan.next();
		System.out.println("이름을 작성해주세요:");
		String name = scan.next();
		System.out.println("내용을 작성해주세요:");
		String detail = scan.next();
		
		System.out.println("비밀번호를 입력하세요:");
		String password1 = scan.next();
		boolean loginResult1 =board1.password1(password1);
		if(loginResult) {
			System.out.println("로그인성공");
		}else {
			System.out.println("아이디 또는 비밀번호를 확인해주세요");
		}
		System.out.println("제목을 수정해주세요:");
		String title1 = scan.next();
		System.out.println("이름을 수정해주세요:");
		String name1 = scan.next();
		System.out.println("내용을 작성해주세요:");
		String detail1 = scan.next();
		
		
		
		
	}
	

}
