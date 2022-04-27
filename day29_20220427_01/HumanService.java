package day29_20220427_01;

import java.util.List;

public class HumanService {
	HumanRepository hr = new HumanRepository();
		//HumanDTO 에서 받은걸 뜻한다.
	void save(HumanDTO human) {
		hr.save(human);
	}

	void findAll() {
	
		List<HumanDTO> humanList = hr.findAll();
		for(HumanDTO human:humanList) {
			System.out.println(human);
		}
	}
	void findById(Long id) {
		System.out.println("넘어온 ID값"+id);
		// Repository로부터 id가1L인 HumanDTO객체를 가져옴. 
		HumanDTO human = hr.findById(id);
		//hr.findById(1L);인경우 계속 아이디가 1인 필드밖에 볼수없다.
	}
	}

