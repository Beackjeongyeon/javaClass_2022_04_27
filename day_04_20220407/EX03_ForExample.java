package day_04_20220407;

public class EX03_ForExample {

	public static void main(String[] args) {
		// 1부터 10까지의 합계구하기
		// 누적합
		// 출력 결과를 1+2+3+4+5+6+7+8+9+10=55 가나오도록 하세요.

		int sum = 0;
		for(int i=1;i<=10;i++) {
			sum+=i;
		//	sum = sum+i;
		System.out.print(i);
		if(i<10) {
			System.out.print("+");
		  }else {
			System.out.print("=");
		  }
		}
		System.out.println(sum);
	}
}
		
		
		
		
	

