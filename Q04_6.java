package method;

import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		// 숫자가 하나만 입력되면 해당 숫자의 구구단을 출력하고 두개의 숫자가 입력되면 작은 수부터 큰수까지의 구구단을 출력하세요.

		Scanner scan = new Scanner(System.in);

		System.out.println("구구단에서 출력하고자 하는 단을 입력하세요.");
		System.out.print(">");

		int dan1 = Integer.parseInt(scan.nextLine());
		gugudan(dan1);

/////////////////////////////////////////////////////////////
		System.out.println("구구단 출력을 위해서 2개의 숫자를 입력하세요.");
		System.out.print(">");
		int dan2 = Integer.parseInt(scan.nextLine());
		System.out.print(">");
		int dan3 = Integer.parseInt(scan.nextLine());

		gugudan(dan2,dan3);

	}
	public static void gugudan(int n) {
		System.out.println(n+"단");
		for(int i=1;i<=9;i++) {
			System.out.println(n+"*"+i+"="+(n*i));
		}
	}
	public static void gugudan(int n, int m) {
		if(n < m) { // n~m
			for(int i=n;i<=m;i++) {
				System.out.println(i+"단");
				for(int j=1;j<=9;j++) {
					System.out.println(i+"*"+j+"="+(i*j));
				}
			}
		}else if(n > m){ //m~n
			for(int i=m;i<=n;i++) {
				System.out.println(i+"단");
				for(int j=1;j<=9;j++) {
					System.out.println(i+"*"+j+"="+(i*j));
				}
			}
		}else { // n=m
			for(int i=1;i<=9;i++) {
				System.out.println(n+"*"+i+"="+(n*i));
			}
		}
	}
}
