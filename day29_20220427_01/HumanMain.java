package day29_20220427_01;

public class HumanMain {
	public static void main(String[] args) {
		//human1 은 HumanDTO 타입의 수이다.
		HumanDTO human1 = new HumanDTO(1L, "백정연", 25);
		HumanDTO human2 = new HumanDTO(2L,"정연백",26);
		HumanService hs = new HumanService();
		
		hs.save(human1);
		hs.save(human2);
		hs.findAll();
		
		//id가 1인사람조회
		//조회한 데이터는 service에서 출력
		hs.findById(1L);
		
		//id가 1인 사람 삭제
		//삭제 후 리스트를 가져와서 service에서 출력
		hs.findById(1L);
	}
}
