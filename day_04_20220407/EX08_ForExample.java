package day_04_20220407;

public class EX08_ForExample {

	public static void main(String[] args) {
		
		for(int i =1; i>=5; i++) {// 줄수
			for(int j=1; j<=i; j++) {// 별 갯수
				System.out.print("*");
			}
				System.out.println();
		}
	}
}
