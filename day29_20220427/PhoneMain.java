package day29_20220427;

public class PhoneMain {
	public static void main(String[] args) {
		
	
	
	//새로운 phone등록. => List 에 저장(List는 Repository 가 가지고있음.)
	 PhoneDTO phone1 =new  PhoneDTO(1L,"아이폰","123-123",1000000);
	 PhoneDTO phone2 =new  PhoneDTO(2L,"갤럭시","333-333",2000000);
	 
	 //Service 클래스에 phone1 객체를 넘김.
	 PhoneService phoneService = new PhoneService();
	 //Service 클래스가 가지고 있는 save 메서드호출
	 phoneService.save(phone1);
	 phoneService.save(phone2);
// 	 phoneService.save(id, modelName, modelNumber,price);
	 
	 //list 에 담긴 전체 데이터 조회
	phoneService.findAll();
	
	} 
}
