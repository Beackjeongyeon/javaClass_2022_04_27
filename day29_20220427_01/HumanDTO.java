package day29_20220427_01;

public class HumanDTO {

	private Long id;
	private String name;
	private int age;

	// 최초생성자 생성
	HumanDTO(){
		
	}

	public HumanDTO(Long id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		
			
		
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "HumanDTO [id=" + id + ", name=" + name + "]";
	}

}
