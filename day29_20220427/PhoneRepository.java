package day29_20220427;

import java.util.ArrayList;
import java.util.List;

public class PhoneRepository {
	
	 List<PhoneDTO> phoneList = new ArrayList<>();
	void save(PhoneDTO phone) {
		System.out.println("PhoneService.save()");
		System.out.println(phone);
		phoneList.add(phone);
	}
	
	void findAll() {
		System.out.println("PhoneRepository.findAll()");
		for(PhoneDTO P: phoneList) {
			System.out.println(P);
			
		}
	}
	
	//findAll 메서드 정의
	//리턴: phoneList
	List<PhoneDTO>findAll1(){
		return phoneList;
	}
}
