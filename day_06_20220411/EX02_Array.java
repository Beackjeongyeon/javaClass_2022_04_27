5package day_06_20220411;

public class EX02_Array {
	
	private static int[] sum;

	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		
		/*
		 * ������ �迭
		 * �迭�̸� :numbers
		 * ũ�� : 5
		 */
		int[]number = null;
		int number1[] = null;
		int[] number3;
		double[]number2 = null;
		String[]strArray = null;
		
		//�ʱ갪�� ���� �迭 ��ü ����
		int[] intArray = {1, 7, 9, 4, 5};
		
		//intArray�迭�� 2�� �ε����� ����� �� ���
		System.out.println(intArray[2]);
	
		System.out.println(intArray[4]);
		//System.out.println(intArray[5]);
		 // ������ �ʰ��ϴ� �ε����� ���Ұ��ϴ�.
		
		
		// intArray[3]�� ����� �����͸�
		// ������ ���� num1�� �����ϰ� num1�� ����� �����͸� ���
		int num1 = intArray[3];
		System.out.println(num1);
		// intArray[2]�� 10�� ����
		System.out.println(intArray[2]);
		intArray[2] = 10;
		System.out.println(intArray[2]);
		
		// �迭 ũ�� Ȯ��(�迭�� �����Ͱ� � �ִ���)
		System.out.println(intArray.length);
		
		/*
		 * �迭�̸�: intArray1
		 * ũ��:3
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
		 * 23 ,11 ,351 ,99�� ����� ������ �迭�� �����ϰ�
		 * �� �迭�� ����� ���� for���� �̿��ؼ� ����غ��ô�.
		 */
		//ù��°
		int[] intArray3 = {23, 11,351,99};
		//�ι�°
		int[] intArray4 = new int[4];
		intArray4[0] = 23;
		intArray4[1] = 11;
		intArray4[2] = 351;
		intArray4[3] = 99;
		//����°
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
		
		
		// intArray5�� ����� �������� ����, ����� ����Ͻÿ�.
		
		
		//����:
		   	sum+= intArray5[i];{
			System.out.println("�հ�:"+sum);
			System.out.println("�հ�:"+sum/intArray5.length);
		}
		}
		
		
		
		
		
		
		
		
		
		
		
		//�ȵſ�.
	//	intArray5[0] =23;
	//	System.out.println(intArray5[0]);
		
		
		
	}
}
