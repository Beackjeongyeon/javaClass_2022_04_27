package day_04_20220407;

public class EX06_NestedFor {

	public static void main(String[] args) {
		// 중첩 for문
		System.out.println("바깥 for 문 들어가기 전");
		for (int i = 1; i <= 2; i++) {
			System.out.println("안쪽 for 문 들어가기 전");
			for (int j = 1; j <= 3; j++) {
				System.out.println("i:" + i + "\t j :" + j);
			}
			System.out.println("안쪽 for문 끝");
		}
		System.out.println("바깥 for 문 끝");
	}

}
