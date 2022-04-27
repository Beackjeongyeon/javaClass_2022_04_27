package day_04_20220407;

public class EX01_For {

	public static void main(String[] args) {
		// 1부터 5까지 출력하는 코드를 작성해보세요
		System.out.println("for 문 시작전");
	
		for(int i = 1; i<=3; i++) {
			System.out.println(i); //1 2 3
			// for 문 안에 내용상 1~3에 숫자를 나타냄
		}
		
		for(int i = 1; i<3; i++) {
			System.out.println(i); // 1 2
			/* 3이표출되지 않은이유는 i 의 값에 3을대입하였을때
			  / 변수범위 i<3 이 default 되기 때문에 3은 출력
			   되지않는다.*/
		}
		for(int i = 1; i==3; i++) {
			System.out.println(i); // 출력없음
			/*
			 * int i 의값이 1 로 선언되었을때 변수범위 3 과같지
			 * 않기때문에 default 된다. 
			 */
		}
		for(int i = 1; i<=10; i+=2) {
			System.out.println(i); 
		}
		
		System.out.println("for 문 종료 후");
		
		 
	
	}
}
