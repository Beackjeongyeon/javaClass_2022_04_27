package Login;

import day_2022_04_22.Student;

public class Login {

	/*객체 프로그래밍 연습(회원예제)
	    1. 회원은 회원번호, 아이디, 비밀번호, 이름, 전화번호, 나이 정보를 가진다. 
	    2. 주요기능 
	        1. 회원가입(save)
	            1. 회원가입시 두가지 방법이 있음. 
	                1. 객체를 만들 때 모든 정보를 매개변수로 전달하여 필드값 지정하기 
	                2. 객체를 만들고 난 후 필드값을 각각 지정하기  */
	
	String id;
	String name;
	String age;
	int password = 0;
	String phoneNumber;

	void save() {
	System.out.println(id);
	System.out.println(password);
	System.out.println(phoneNumber);
	System.out.println(name);
	System.out.println(age);

	
	}
	 /*2. 로그인(memberLogin)
	            1. 로그인 메서드를 호출할 때 가입시 입력한 아이디, 비밀번호를 매개변수로 전달하고 boolean 리턴을 받아서 로그인 성공, 실패 여부를 출력함.*/
	
	int memberLogin() {
	
	int memberlogin = (password);
	return password;

	}
	
	/*3. 회원조회(findById)
	            1. 해당 객체의 회원조회 메서드를 호출하면 해당 회원의 전체 정보를 출력함.*/
	void findById(String id ,int password,String name,String age,String phoneNumber) {
		
		boolean findById(int password) {
			int sum = num1 +num2;
			boolean result = false;
			if(sum >=10) {
	}
	
	/*4. 정보수정(update)
	            1. 정보수정은 전화번호만 된다고 가정하고 
	            2. 정보수정 메서드 호출시 변경하고자 하는 전화번호를 매개변수로 넘겨서 해당 필드값을 변경하도록 한다. 
	            3. 변경 후 회원조회 메서드를 호출하여 값이 변경됐는지 확인함.*/

}
