package day_03_20220406;

import java.util.Scanner;

public class EX08_SwitchCaseExample {
	
	public static void main(String[] args) {
		/*
		 * ������ ����
		 * 4���� �ܾ ������ �ִ� ����
		 * dest(å��), chair(����) , monitor(�����) , mouse(���콺)
		 * 
		 * �����ϸ� ���� �ܾ �Է¹ް� �ش� �ǹ̸� �������.
		 * ������ ���� �ܾ �Է��ϸ� "������ ���� �ܾ��Դϴ�." ���
		 */
		
		Scanner scan = new Scanner(System.in);
		String word ="";
		System.out.println("����ܾ� �Է�:");
		word =scan.nextLine();
		switch(word) { 
		case "desk":
		System.out.println("desk �Ƕ��� å���Դϴ�.");
		break;
		case "monitor":
		System.out.println("monitor �Ƕ��� ������Դϴ�.");
		break;
		case "mouse":
		System.out.println("desk �Ƕ��� ���콺�Դϴ�.");
		break;
		default:
		System.out.println("������ ���� �ܾ��Դϴ�.");
		break;
	}

}
