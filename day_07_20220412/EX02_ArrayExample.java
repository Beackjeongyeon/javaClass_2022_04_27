package day_07_20220412;

import java.util.Scanner;

public class EX02_ArrayExample {
	public static void main(String[] args) {
		// 500 100 50 10
		// 680

		/*Scanner scan = new Scanner(System.in);
		boolean run = true;
		int[] coin = { 500, 100, 50, 10 };
		while (run) {
			System.out.println("금액입력:");
			int num = scan.nextInt();
			for (int i = 0; i < coin.length; i++) {
			System.out.println(coin[i] + "원동전" + num / coin[i] + "개");
	        num %= coin[i];*/
	int[] coins = {500,100,50,10};
	Scanner scan = new Scanner(System.in);
	System.out.println("금액입력:");
	int change = scan.nextInt();
	int coinCount = 0;
	
	for(int i = 0;i< coins.length;i++) {
		coinCount = change / coins[i];
		System.out.println(coins[i]+"원 동전"+coinCount +"개");
		
		change = change% coins[i];
		
	}
 }
}