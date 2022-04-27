package Test;

public class Example09 {
	public static void main(String[] args) {

		for (int i = 2; i <= 9; i++) {
			System.out.print(i + "단 구구단\t");
			

			for (int j = 1; j <= 9; j++)
				System.out.print(i + "x" + j + "=" + (i * j) + "\t");
				System.out.println();
		}

		       	System.out.println();
	}

}
