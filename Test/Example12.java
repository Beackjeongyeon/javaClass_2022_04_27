package Test;

public class Example12 {
public static void main(String[] args) {

	//랜덤 주사위 6일때만 정지
	while(true) {
		int num = (int)(Math.random()*6)+1;
		System.out.println(num);
		if(num ==6) {
			break;
			
		}
	}
	System.out.println("프로그램 종료");
}
}
