package day_06_20220411;

import java.util.Scanner;

public class Bank {
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
boolean run = true;
int balance = 0; // 잔고 
int deposit = 0; // 입금액 
int withdraw = 0; // 출금액 
int select = 0; // 기능선택



while(run) {
System.out.println("=====================\n"
	+"1.예금 | 2. 출금 | 3. 잔고 | 4. 종료\n"
	+"====================");
System.out.println("선택>");
select = sc.nextInt();

if(select == 1) 
{ 
	System.out.println("예금");
	deposit = sc.nextInt();
	// 잔액 : 기존 잔액 + 예금액 => 잔액
	balance = balance + deposit;
	System.out.println( "현재잔액은" +balance +"입니다.");

}else if(select == 2) {
	
	System.out.println("출금액");
	withdraw = sc.nextInt();
	if(withdraw > balance) {
	System.out.println("잔고부족");
	System.out.println( "현재잔액은" +balance +"입니다.");
	}else {
		balance -= withdraw;
		System.out.println( "현재잔액은" +balance +"입니다.");}
	
}else if (select == 3) {
	//잔고
	deposit = sc.nextInt();
	
	
	System.out.println( "현재잔액은" +balance +"입니다.");
	
}else if (select == 4){
	System.out.println("종료");
	run = ""
	
	//잘못된 선택
}


}

}
	

}

