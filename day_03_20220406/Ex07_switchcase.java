package day_03_20220406;

public class Ex07_switchcase {
	
	public static void main(String[] args) {
		// switch case
		int num=5;
		switch(num) {
		case 0 : // num == 0
			System.out.println("num���� 0�� �� ���");
			break;	
		case 1 : //	num == 1
			System.out.println("num���� 1�� �� ���");
			break;	
		case 2:	 //	num == 2
			System.out.println("num���� 2�� �� ���");
			break;
			default:
				System.out.println("case ���ǿ� ���� ��� ���");
				break;
		}
		
		string str ="������";
		switch(str) {
		case "������":
			System.out.println("�������Դϴ�.");
			break;
		case "�󸶹�":
			System.out.println("�󸶹��Դϴ�.");
			break;
		default :
			System.out.println("�ѱ��� �ƴմϴ�.");
			break;
		}
	}

