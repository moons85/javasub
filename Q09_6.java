package method;

public class Q09 {

	public static void main(String[] args) {
		//char[] 배열을 전달받아 배열 속의 공백(' ') 문자를 ','로 대치하는 메소드를 작성하라
		char[] arr=new char[] {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l','.'};
		prt(arr);
		replace(arr);
		prt(arr);
	
	}
	public static void replace(char a[]) {
		for(int i=0; i<a.length;i++) {
			if(a[i]==' ') {
				a[i] =',';
			}
		}
	}
	public static void prt(char a[]) {
		for(int i=0; i<a.length;i++) {
			System.out.print(a[i]);
		}
		System.out.println();
	}
}
