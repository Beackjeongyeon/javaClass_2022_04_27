package Login;

import java.util.Scanner;

public class LoginMain {
	public static void main(String[] args) {

		Login login1 = new Login();
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		String id;
		String name;
		String age;
		String phoneNumber;
		int password = 0;
		int Number = 0;
		int a = 0;
		while (run) {
			System.out.println("===================================");
			System.out.println("1.회원가입	|2.로그인 |3.회원조회|4.정보수정");
			System.out.println("===================================");
			Number = scan.nextInt();
			if (Number == 1) {
				System.out.println("아이디를입력해주세요:");
				id = scan.next();
				System.out.println("비밀번호를입력해주세요:");
				password = scan.nextInt();
				System.out.println("이름을입력해주세요:");
				name = scan.next();
				System.out.println("나이입력해주세요:");
				age = scan.next();
				System.out.println("전화번호를입력해주세요:");
				phoneNumber = scan.next();
			}

			if (Number == 2) {
				System.out.println("아이디를입력해주세요:");
				id = scan.next();
				System.out.println("비밀번호를입력해주세요:");
				a = scan.nextInt();
				if (a != password) {
					System.out.println("id 또는 비밀번호가 틀렸습니다.");
				} else {
					System.out.println("로그인이 완료되었습니다.");
				}

			}
			if (Number ==3) {
				System.out.println("아이디를입력해주세요:");
				id = scan.next();
				System.out.println("비밀번호를입력해주세요:");
				password= scan.nextInt();
				if (a!=password) {
					System.out.println("로그인입력정보가 맞지않습니다.");
					run = false;}else {
						System.out.println();
					
						
				
						
						
						
				}
				
			}

		}

	}

}
