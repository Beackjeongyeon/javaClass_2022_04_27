package day_03_20220406;

import java.security.DomainCombiner;
import java.util.Scanner;

public class EX03_IfExample {
	
public static void main(String[] args) {
	/*
	 * ���� ��� ����
	 * ������ �ϳ� �Է��ؼ� ���� ����ϱ�
	 * 0���� �۰ų� 100���� ū ������ �Է��ߴٸ� �Է¹����� �ʰ��߽��ϴ�. ���
	 * 90~100 a 
	 * 80~89 b
	 * 70~79 c
	 * 60~69 d
	 * 59 ���� f
	 * 
	 * ���ݴ� ���뤷 print �޼��带 3���� ����
	 */
	Scanner scan = new Scanner(Systen.in);
	int score = 0;
	System.out.println("����:");
	score = scan.nextInt();
	if(score >=0 && score <=100) {
	if(score >=90) {
		System.out.println("A�����Դϴ�.");
	}else if (score >=80) {
		System.out.println("B�����Դϴ�.");
	}else if (score >=70) {
		System.out.println("c�����Դϴ�.");
	}else if (score >=60) {
		System.out.println("D�����Դϴ�.");
	}else {
		System.out.println("F�����Դϴ�.");
	}
			
	}else {
		System.out.println("�Է¹��� �ʰ�");
	}System.out.println(grade +"�����Դϴ�.");


	

