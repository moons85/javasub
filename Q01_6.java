package method;

public class Q01 {

	public static void main(String[] args) {
		// 구구단을 출력하는 메서드를 만들어 보세요.
		for(int i=2;i<=9;i++) {
			gugudan(i);
		}
	}
	public static void gugudan(int n) {
		System.out.println(n + "단");
		for(int i=1;i<=9;i++) {
			System.out.println(n + "*"+i + "="+(n*i));
		}
		System.out.println();
	}
}
