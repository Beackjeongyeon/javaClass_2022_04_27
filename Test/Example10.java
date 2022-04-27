package Test;

public class Example10 {
	public static void main(String[] args) {

		for (int i = 1; i <= 4; i++) {
			for (int j =4-i; j >= 1; j--) {
				System.out.print(" ");}
	
			for (int c= 1; c<=i; c++) {
				System.out.print("*");}
			System.out.println();
		}
	}
}
