package day_04_20220407;

public class EX02_For {
	
	public static void main(String[] args) {
		int i=0;
		for(i =2; i<=3;i++) {
			System.out.println(i);
			/*
			 *int i=0; 은 그냥 선언값이고 i=2 부터 시작이다.
			 */
		}
		System.out.println("반복문 종료후 i:"+ i);
		
		
		// 반복횟수를 정할때
		for (i=1; i<=3; i++) {
			System.out.println("안녕하세요");
			/*
			 * 출력을 몇번을 외치는지 for 문을 이용하여서 
			 * 나타낼수 있다.
			 */
		}
		
	}

}
