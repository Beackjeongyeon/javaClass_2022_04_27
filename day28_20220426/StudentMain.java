package day28_20220426;

import java.util.ArrayList;
import java.util.List;

public class StudentMain {
	public static void main(String[] args) {

		// getter/setter사용전
		// student1.id =1L;//field값 지정
		// System.out.println(student1.id);//field값 출력

		// getter / setter적용
		// student1.setId(1L);
		// System.out.println(student1.getId());

		// Student 객체에
		// id:2
		// number:11223344
		// name:학생1
		// major:컴공
		// 을 각각 입력하고 필드값 각각 출력

		Student student1 = new Student();
		student1.setId(2L);
		System.out.println(student1.getId());
		student1.setNumber("11223344");
		System.out.println(student1.getNumber());
		student1.setName("학생1");
		System.out.println(student1.getName());
		student1.setMajor("컴퓨터 공학");
		System.out.println(student1.getMajor());
		System.out.println("========================");
		Student student2 = new Student();
		student2.setId(2L);
		student2.setNumber("999999");
		student2.setName("학생2");
		student2.setMajor("전자공학");

		// student 객체를 담기 위한 list
		List<Student> studentList = new ArrayList<>();
		studentList.add(student1);
		// get
		System.out.println("객체출력"+student2);
		studentList.add(student2);
		System.out.println(studentList.get(0));
		// 0번 인덱스에 담긴 Student객체의 id값을 출력한다면
		System.out.println(studentList.get(0).getId());
		System.out.println("========================");


		Student student3 = new Student();
		student3.setId(3L);
		student3.setNumber("999999");
		student3.setName("학생3");
		System.out.println(student3.getName());
		student3.setMajor("전자공학");
		studentList.add(student3);

		for (int i = 0; i < studentList.size(); i++) {
			System.out.println(studentList.get(i).getName());
		}

		for (Student stu : studentList) {
			System.out.println(stu.getName());
		}
		
		Student[]stuArray = new Student [10];
		stuArray[0] = student1;
		int[]intAarry = new int[10];
	}
}