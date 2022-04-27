package day_04_20220407;

import java.util.Scanner;

public class EX04_ForeExample {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int start =0, end = 0;
		System.out.print("시작값:");
		start = scan.nextInt();
		System.out.print("끝값");
		end = scan.nextInt();
		int sum = 0;
		
		for(int i =start; i <=end; i++) {
			sum+=i;
			System.out.print(i);
			if(i <end) {
				System.out.print("+");
			}else {
				System.out.print("=");
			}
			
		}
		System.out.println(sum);
		}
}
