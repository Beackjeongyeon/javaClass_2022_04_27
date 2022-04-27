package Login;

import java.util.ArrayList;
import java.util.List;

public class Ex01_ArrayListEx {

	public static void main(String[] args) {
		// String 객체를 담기위한 ArrayList
		List<String> list1 = new ArrayList<>();
		// 저장: add 메서드 사용
		list1.add("hello");
		list1.add("hihi");
		list1.add(1,"kkkk");
		// 괄호 안에 1은 배열 숫자이다.
		list1.add(1,"oooo");
		// 같은 배열순서를 쓰게되면 먼저적용된 배열은 후순위로 밀리게된다.
		
		// 꺼내기: get 메서드 사용
		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		System.out.println(list1.get(2));
		// 크기확인: size 메서드(배열된 숫자를 알려준다.)
		System.out.println(list1.size());
		// 삭제 : remove 메서드
		System.out.println(list1.get(1));
		list1.remove(1);
		System.out.println(list1.get(1));
		// for문을 이용하여 list에 담긴 내용 모두 출력하기
		for(int i =0;i<list1.size();i++) {
			System.out.println(list1.get(i));
		}
		//for each (advanced for)
		for(String a: list1)
			System.out.println(a);
		// 정수를 담는 list
		// wrapper Class
		// int=Integer,long-long,double-Double,boolean-Boolean
		List<Integer> list2 = new ArrayList<>();
		list2.add(10);
		list2.add(20);
		System.out.println(list2.get(0));
		for(Integer num:list2){
			System.out.println(num);
		}
		
	}

}
