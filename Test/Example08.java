package Test;

public class Example08 {
	public static void main(String[] args) {
		//2�� ������
		for(int i = 2; i<=9;i++) {
			System.out.print(i+"�� ������");
			for(int j = 1; j<=9;j++) {
				System.out.print(i+"x"+j+"="+(i*j)+"\t");
			}
			System.out.println();
		}
	}

}
