package day27_20220425;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// add1 메서드를 호출
		Calculator Calculator1 = new Calculator();
		// 리턴이 있는 메서드를 호출할 때는 호출결과 처리를 위한 코드 필요
		int result =  Calculator1.add1();
		System.out.println(result);
		
		// add2 메서드 호출
		result = Calculator1.add2(10,20);
		System.out.println(result);
		
		int num1 =10;
		int num2 =20;
		result = Calculator1.add2(num1, num2);
		System.out.println(result);
		
		
		//add3 메서드 호출
		//리턴이 없는 메서드는 그냥 호출후 끝nu
		
		Calculator1.add3();
		
		//add4 메서드 호출
		Calculator1.add4(num1, num2);
		
		//add5 메서드 호출
		String strResult = Calculator1.add5();
		System.out.println(strResult);
		//add6 메서드 호출
		strResult = Calculator1.add6("안녕", 10);
		System.out.println(strResult);
		//add7 메서드 호출
		boolean boolResult = Calculator1.add7(10, 20);
		System.out.println(boolResult);
	}
	

}
