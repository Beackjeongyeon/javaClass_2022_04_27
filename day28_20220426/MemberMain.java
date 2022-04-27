package day28_20220426;

import java.util.Scanner;

public class MemberMain {
	public static void main(String[] args) {
		Member member1 = new Member(1L,"id1","1234","name1","010-1111-1111",11);
		Member member2 = new Member();
		member2.memberId = "id2";
		member2.memberPassword = "0000";
		member2.memberName = "name2";
		member2.memberPhone = "010-2222-2222";
		member2.memberAge = 22;
		
		// 조회
		System.out.println(member1.id);
		System.out.println(member1.memberId);
		System.out.println(member1.memberPassword);
		System.out.println(member1.memberName);
		System.out.println(member1.memberPhone);
		System.out.println(member1.memberAge);
		
		System.out.println(member2.id);
		System.out.println(member2.memberId);
		System.out.println(member2.memberPassword);
		System.out.println(member2.memberName);
		System.out.println(member2.memberPhone);
		System.out.println(member2.memberAge);
		
		// 조회(메서드 호출)
		member1.findById();
		member2.findById();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("아이디:");
		String memberId = scan.next();
		System.out.println("비밀번호:");
		String memberPassword = scan.next();
		boolean loginResult = 
					member1.memberLogin(memberId, memberPassword);
		if(loginResult) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("아이디 또는 비밀번호를 확인하세요");
		}
		System.out.println("변경할 전화번호:");
		String memberPhone = scan.next();
		member1.update(memberPhone);
		member1.findById();
		
	}

}
