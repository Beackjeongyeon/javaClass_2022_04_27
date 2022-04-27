package Test;
// 1부터 100 의합을 출력
public class Example06 {
	public static void main(String[] args) {
		
		int i = 1;
		int sum = 0;
		for(i=1;i<=100;i++) {
			sum += i;
		}
		System.out.println("1부터 100까지의합:"+sum);
	}
}  
