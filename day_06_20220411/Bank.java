package day_06_20220411;

import java.util.Scanner;

public class Bank {
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
boolean run = true;
int balance = 0; // �ܰ� 
int deposit = 0; // �Աݾ� 
int withdraw = 0; // ��ݾ� 
int select = 0; // ��ɼ���



while(run) {
System.out.println("=====================\n"
	+"1.���� | 2. ��� | 3. �ܰ� | 4. ����\n"
	+"====================");
System.out.println("����>");
select = sc.nextInt();

if(select == 1) 
{ 
	System.out.println("����");
	deposit = sc.nextInt();
	// �ܾ� : ���� �ܾ� + ���ݾ� => �ܾ�
	balance = balance + deposit;
	System.out.println( "�����ܾ���" +balance +"�Դϴ�.");

}else if(select == 2) {
	
	System.out.println("��ݾ�");
	withdraw = sc.nextInt();
	if(withdraw > balance) {
	System.out.println("�ܰ����");
	System.out.println( "�����ܾ���" +balance +"�Դϴ�.");
	}else {
		balance -= withdraw;
		System.out.println( "�����ܾ���" +balance +"�Դϴ�.");}
	
}else if (select == 3) {
	//�ܰ�
	deposit = sc.nextInt();
	
	
	System.out.println( "�����ܾ���" +balance +"�Դϴ�.");
	
}else if (select == 4){
	System.out.println("����");
	run = ""
	
	//�߸��� ����
}


}

}
	

}

