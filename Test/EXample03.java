package Test;

public class EXample03 {
	public static void main(String[] args) {

		int time = (int) (Math.random() * 4) + 8;
		System.out.println("[����ð���"+time+"�Դϴ�.]");

		switch (time) {
		case 8:
			System.out.println("8���Դϴ�.");
		case 9:
			System.out.println("9���Դϴ�.");
		case 10:
			System.out.println("10���Դϴ�.");
		default:
			System.out.println("11���Դϴ�.");
		}
	}

}
