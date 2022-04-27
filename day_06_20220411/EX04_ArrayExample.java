package day_06_20220411;

import java.util.Scanner;

public class EX04_ArrayExample {
public static void main(String[] args) {

	//크기가 5인 정수형 배열을 선언하고
	//스캐너로 값을 받은 뒤
	//입력받은 값 중에서 가장 큰 값을 출력하시오.
	Scanner scan = new Scanner(System.in);
	int[]num =new int[5];
	int max = 0;
	// 배열에 값 넣기
	for(int i =0; i <num.length;i++) {
		 num[i] = scan.nextInt();}
	// 최댓값 찾기
	for(int i =0; i <num.length;i++) {
		 if(max < num[i]) {
			 max =num[i];
			 
		 
	}
	}
	System.out.println("최댓값" +max);

	

	
}

}


