package Test;

public class EXample03 {
	public static void main(String[] args) {

		int time = (int) (Math.random() * 4) + 8;
		System.out.println("[현재시간은"+time+"입니다.]");

		switch (time) {
		case 8:
			System.out.println("8시입니다.");
		case 9:
			System.out.println("9시입니다.");
		case 10:
			System.out.println("10시입니다.");
		default:
			System.out.println("11시입니다.");
		}
	}

}
