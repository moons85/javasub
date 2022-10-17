package tmp02;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 05.은행 예금 (예금, 출금, 잔액조회, 종료)
		// 은행 문제
		int balance = 0; // 잔액
		Scanner scanner = new Scanner(System.in);
		int CaseNum = 0;
		while (true) {
			System.out.println("그린 뱅크에 오신것을 환영합니다.");
			System.out.println("메뉴를 선택 해 주세요.");
			System.out.println("1. 예금");
			System.out.println("2. 출금");
			System.out.println("3. 잔액조회");
			System.out.println("4. 종료");
			System.out.print(">");

			int selectNum = scanner.nextInt();

			switch (selectNum) {
			case 1: // 예금 기능
				System.out.println("입금할 금액을 입력하세요.");
				int deposit = scanner.nextInt();
				balance += deposit;
				System.out.println(deposit + "원이 예금 완료되었습니다.");
				System.out.println("금액 :" + balance + "원");
				break;
			case 2: // 출금 기능
				System.out.println("출금할 금액을 입력하세요.");
				int withdraw = scanner.nextInt();
				if (balance >= withdraw) {
					balance -= withdraw;
					System.out.println(withdraw + "원이 출금완료되었습니다.");
					System.out.println("금액 :" + balance + "원");
				} else
					System.out.println("잔액부족입니다.");
				break;
			case 3: // 잔액 조회 기능
				System.out.println("남은 잔액은 : " + balance + "원입니다.");
				break;
			case 4: // 프로그램 종료
				System.out.println("프로그램을 종료합니다.");
				CaseNum = 4;
				break;
			default:
				System.out.println("잘못 입력했습니다. 다시 선택해 주세요.");
			}
			if (CaseNum == 4)
				break;
		}
	}

}
