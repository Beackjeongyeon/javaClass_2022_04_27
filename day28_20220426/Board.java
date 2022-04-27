package day28_20220426;

public class Board {
	long id;
	String password;
	String title;
	String name;
	String detail;
	int views = 0;
	String password1 = password;
	String name1 = name;
	String title1 = title;
	String detail1 = detail;

	/*
	 * 1. 객체 프로그래밍 연습(게시판 예제) 1. 게시글은 글번호, 글비밀번호, 제목, 작성자, 내용, 조회수 정보를 가진다. 2. 주요기능
	 * 1. 글작성(save) 1. 글작성시 두가지 방법이 있음. 1. 객체를 만들 때 모든 정보를 매개변수로 전달하여 필드값 지정하기 2.
	 * 객체를 만들고 난 후 필드값을 각각 지정하기
	 */
	Board(){
	}
	Board(long id,String password,String title,String name,String detail,int views){
		this.id = id;
		this.password = password;
		this.title = title;
		this.name = name;
		this.detail = detail;
		this.views = views;
	}  
	

	/*
	 * 2. 글조회(findById) 1. 해당 객체의 글조회 메서드를 호출하면 해당 회원의 전체 정보를 출력함. 1. 전체 정보 출력 전에
	 * 조회수를 하나 올린다.
	 */
	boolean password(String password) {
		boolean loginResult = false;
		if (this.password.equals(password)){
			loginResult = true;
		} else {
			loginResult = false;
		}
		return loginResult;
	}
	
	
	
	void save(String title,String name,String detail){
		this.title = title;
		this.name = name;
		this.detail = detail;
		
		
	}

	/*
	 * 3. 글수정(update) 1. 수정하고자 하는 글번호와 비밀번호를 입력 받아서 두 정보가 모두 일치해야 제목, 내용을 수정할 수 있음.
	 * 1. 일치하지 않으면 수정 불가능.
	 */
	boolean password1(String password) {
		boolean loginResult = false;
		if (this.password.equals(password)){
			loginResult = true;
		} else {
			loginResult = false;
		}
		return loginResult;
	}
	
	void update(String title,String name,String detail) {
		this.title1 = title1;
		this.name1 = name1;
		this.detail1 = detail1;
	}
}
