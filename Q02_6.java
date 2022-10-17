package method;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		// 숫자를 입력받으면 해당 숫자의 구구단을 출력하세요.
		Scanner scan = new Scanner(System.in);
		int dan=scan.nextInt();
		gugudan(dan);
		}
	public static void gugudan(int n) {
		System.out.println(n+"단");
		for(int i=1;i<=9;i++) {
			System.out.println(n+"*"+i+"="+(n*i));
		}
	}
}
