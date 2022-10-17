package method;

import java.util.Scanner;

public class Q10 {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		//은행 예금 예제를 메서드로 만들어 봅시다.
		
		int balance = 0; //잔액
		boolean run = true;

		System.out.println("안녕하세요 G BANK입니다.");

		while(run) {
			int selectNum = menu();
			switch(selectNum) {
			case 1:
				balance = deposit(balance);
				break;
			case 2:
				balance = withdraw(balance);
				break;
			case 3:
				check(balance);
				break;
			case 4:
				run = exit();
				break;
			default :
				error();
			}
		}
	}
	public static void error() {
		System.out.println("잘못 입력하였습니다.");
		System.out.println("1~4 값 중 선택해주세요.");

	}
	
	public static boolean exit() {
		System.out.println("프로그램을 종료합니다.");
		return false;
	}
	
	public static int deposit(int a) {
		System.out.println("예금할 금액을 입력해주세요.");
		int n = scan.nextInt();
		if((a+n)>1000000) {
			System.out.println("총 잔액이 백만원을 초과하였습니다.");
			return a;
		}else {
		a +=n;
		System.out.println(n + "원을 입금하였습니다.");
		System.out.println("총 금액은: " + a + "입니다.");
		return a;
		}
	}
	public static int withdraw(int a) {
		System.out.println("출금할 금액을 입력해주세요.");
		int n = scan.nextInt();
		if(a<n){
			System.out.println("잔액이 부족합니다.");
			return a;
		}else {
		a -=n;
		System.out.println(n + "원을 출금하였습니다.");
		System.out.println("총 금액은: " + a + "입니다.");
		return a;
		}
	}
	public static void check(int a) {
		System.out.println("잔액은 "+ a+"원입니다.");
	}
	
	
	public static int menu() {
		System.out.println("***************************");
		System.out.println("그린 뱅크에 오신것을 환영합니다.");
		System.out.println("메뉴를 선택해 주세요.");
		System.out.println("1. 예금");
		System.out.println("2. 출금");
		System.out.println("3. 잔액조회");
		System.out.println("4. 종료");
		System.out.print(">");
		int selectNum = scan.nextInt();
		return selectNum;
	}

}
