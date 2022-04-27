package day_07_20220412;

import java.util.Scanner;

public class EX01_ArrayExample {
public static void main(String[] args) {

int[]num = {5,2,1,3,4,7,6,9,10,8};
Scanner scan = new Scanner(System.in);
boolean run = true;
while(run) { 
	System.out.println("숫자:");
	int number = scan.nextInt();
	for(int i =0; i<num.length; i++) {
		if(number == num[i]) {
			System.out.println(number + "는"+i+"번 인덱스에 있습니다.");
		}
	}
	
}
scan.close();
}
}

