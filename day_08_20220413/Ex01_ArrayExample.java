package day_08_20220413;

import java.util.Scanner;

public class Ex01_ArrayExample {
	
public static void main(String[] args) {
	//스캐너로 입력받은 값으로 배열 크기 지정하기
	//크기 5인 정수형 배열
	int[] numbers = new int[5];
	
	int[] numbers1 = null;
	numbers1 = new int[5];
	System.out.println(numbers1.length);
	
	Scanner scan = new Scanner(System.in);
	int size = 0;
	int[] numbers2 = null;
	size = scan.nextInt();
// size에 입력된 값을 numbers2 의 크기로 지정하기
   
	numbers2 = new int[size];
	System.out.println(numbers2.length);

	}

}
