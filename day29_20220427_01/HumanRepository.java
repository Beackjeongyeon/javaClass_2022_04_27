package day29_20220427_01;


import java.util.*;
// * = 자바유틸키에포함되있는 모든것을 사용한다.

public class HumanRepository {

	static List<HumanDTO> humanList = new ArrayList<>();

	void save(HumanDTO human) {
		humanList.add(human);
		
	}

	List<HumanDTO> findAll1() {
		return humanList;

	}
	HumanDTO findById(Long id) {
		HumanDTO human = new HumanDTO();
		//id값과 일치하는 객체를 찾음.
		//한명의 정보를 찾아야 하기 때문에 리턴할 때 HumanDTO 객체가 필요.
		for(int i=0;i<humanList.size();i++) {
			if(id.equals(humanList.get(i).getid())) {
				human = humanList.get(i);
			}
		}
		return human;
	}
}
