package day_01_20220404;

public class HumanMain {

	public static void main(String[] args) {
		
		// 순서
		// Human 클래스에 대한 객체(인스턴스) 생성
			Human Human1 = new Human();
			// human1 객체에 정보를 담아봅시다.
			System.out.println(Human1.name);
			Human1.name = "홍길동";
			System.out.println(Human1.name);
			
			Human human2 = new Human();
			System.out.println(human2.name);

			Human human3 = new Human("가니?");
			
			Human human4 = new Human(1);
			
			String var1 = "ㅎㅎㅎ";
			Human human5 = new Human(var1);
			// human6객체
			Human human6 = new Human("이름1",11,"인천","남");
			System.out.println(human6.name);
			System.out.println(human6.age);
			System.out.println(human6.local);
			System.out.println(human6.gender);
	}

}
