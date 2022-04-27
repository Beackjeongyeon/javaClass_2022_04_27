package day_2022_04_22;

public class StudentClass {
	public static void main(String[] args) {
		
		//기본생성자를 호출한 객체
		Student student1 = new Student();
		student1.name ="학생";
		student1.major ="전자공학";
		student1.studentNumber ="00999999";
		student1.age =22;
		System.out.println("--------------------");
		student1.studentPrint();
		//System.out.println(student1.name);
		//System.out.println(student1.major);
		//System.out.println(student1.studentNumber);
		//System.out.println(student1.age);
		
		//매개변수 2개인 생성자를 호출한 객체
		Student student2 = new Student("학생2",20);
		System.out.println("--------------------");
		student2.studentPrint();
		//System.out.println(student2.name);
		//System.out.println(student2.major);
		//System.out.println(student2.studentNumber);
		//System.out.println(student2.age);
		
		//매개변수 4개인 생성자를 호출한 객체
		Student student3 = new Student("학생2","동양화","1234",20);
		System.out.println("--------------------");
		System.out.println(student3.name);
		System.out.println(student3.major);
		System.out.println(student3.studentNumber);
		System.out.println(student3.age);
		
	}
	
		
	

}
