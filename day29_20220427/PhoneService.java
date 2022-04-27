package day29_20220427;

import java.util.List;

public class PhoneService {

	void save(PhoneDTO phone) {
		System.out.println("PhoneService.save()");
		System.out.println(phone);
		// phone 객체를 Repository의 save 메서드로 넘겨서 잘 넘어갔는지 sysout 확인
		PhoneRepository pr = new PhoneRepository();
		pr.save(phone);
	}
	
	void findAll() {
		System.out.println("PhoneService.findAll()");
		PhoneRepository pr = new PhoneRepository();
		// Repository에서 목록을 출력
		pr.findAll();
		// Repository에서 리스트를 가져와서 여기서 출력
		List<PhoneDTO>phoneList = pr.findAll1();
		for(PhoneDTO p: phoneList) {
			System.out.println("PhoneService.findAll() for문");
			System.out.println(p);
		}
	}
}
