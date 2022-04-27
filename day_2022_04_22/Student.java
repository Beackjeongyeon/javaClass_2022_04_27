package day_2022_04_22;

public class Student {

		String name;
		String major;
		String studentNumber;
		int age;
		// 기본생성자
		Student(){
			
		}
		//이름, 나이를 매개변수로 하는 생성자
		Student(String name, int age){
			this.name = name;
			this.age = age;
			this.studentNumber ="123456789";
			this.major = "컴퓨터공학";
		}
		// 모든 필드를 매개변수로 하는 생성자
		Student(String name, String major, String studentNumber,int age){
			this.name = name;
			this.major = "컴퓨터공학";
			this.studentNumber ="123456789";
			this.age = age;
			
		}
		// 필드값 출력을 위한 메서드
		// 메서드라는 것은 선언을해줄때 무조건 return 값을 줘야한다 void = 리턴할게없다.
		void studentPrint() {
			System.out.println(this.name);
			System.out.println(this.major);
			System.out.println(this.studentNumber);
			System.out.println(this.age);
		}
	

}

