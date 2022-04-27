5package day_06_20220411;

public class EX02_Array {
	
	private static int[] sum;

	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		
		/*
		 * 정수형 배열
		 * 배열이름 :numbers
		 * 크기 : 5
		 */
		int[]number = null;
		int number1[] = null;
		int[] number3;
		double[]number2 = null;
		String[]strArray = null;
		
		//초깃값을 갖는 배열 객체 선언
		int[] intArray = {1, 7, 9, 4, 5};
		
		//intArray배열의 2번 인덱스에 저장된 값 출력
		System.out.println(intArray[2]);
	
		System.out.println(intArray[4]);
		//System.out.println(intArray[5]);
		 // 범위를 초과하는 인덱스는 사용불가하다.
		
		
		// intArray[3]에 저장된 데이터를
		// 정수형 변수 num1에 저장하고 num1에 저장된 데이터를 출력
		int num1 = intArray[3];
		System.out.println(num1);
		// intArray[2]에 10을 저장
		System.out.println(intArray[2]);
		intArray[2] = 10;
		System.out.println(intArray[2]);
		
		// 배열 크기 확인(배열에 데이터가 몇개 있느냐)
		System.out.println(intArray.length);
		
		/*
		 * 배열이름: intArray1
		 * 크기:3
		 */
		int[] intArray1 = new int[3];
		System.out.println(intArray[0]);
		System.out.println(intArray[1]);
		System.out.println(intArray[2]);
		
		double[] doubleArray1 = new double[3];
		System.out.println(intArray[0]);
		System.out.println(intArray[1]);
		System.out.println(intArray[2]);
		
		/*
		 * 23 ,11 ,351 ,99가 저장된 정수형 배열을 선언하고
		 * 이 배열에 저장된 값을 for문을 이용해서 출력해봅시다.
		 */
		//첫번째
		int[] intArray3 = {23, 11,351,99};
		//두번째
		int[] intArray4 = new int[4];
		intArray4[0] = 23;
		intArray4[1] = 11;
		intArray4[2] = 351;
		intArray4[3] = 99;
		//세번째
		int[] intArray5 = null;
		intArray5 = new int[4];
		intArray5[0] =23;
		intArray5[1] =11;
		intArray5[2] =351;
		intArray5[3] =99;
		
		System.out.println(intArray5[0]);
		System.out.println(intArray5[1]);
		System.out.println(intArray5[2]);
		System.out.println(intArray5[3]);
		
		int sum = 0;
		for(int i=0; i<=intArray5.length; i++) {
			System.out.println(intArray5[i]);
		
		
		// intArray5에 저장된 데이터의 총합, 평균을 계산하시오.
		
		
		//총합:
		   	sum+= intArray5[i];{
			System.out.println("합계:"+sum);
			System.out.println("합계:"+sum/intArray5.length);
		}
		}
		
		
		
		
		
		
		
		
		
		
		
		//안돼요.
	//	intArray5[0] =23;
	//	System.out.println(intArray5[0]);
		
		
		
	}
}
