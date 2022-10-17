package method;

public class Q08 {

	public static void main(String[] args) {
		//주어진 두 배열의 같은 위치의 숫자를 합쳐서 하나의 배열로 출력하는 메서드를 만드세요.
		//단, 같은 위치에 숫자가 없다 해당 해당 위치의 숫자를 그냥 출력하세요.
		int[] arr1 = new int[] {78,54,89,57,84};
		int[] arr2 = new int[] {95,74,91,84};
		int[] arr3 = arrAdd(arr1, arr2);
		prt(arr3);
	}
	public static int[] arrAdd(int[] a, int[] b) {
		int[] result = null;
		if(a.length>b.length) {
			result = new int[a.length];
			for(int i =0; i<a.length;i++) {
				if(i<b.length) {
					result[i]=a[i]+b[i];
				}else {
					result[i]=a[i];
				}
			}
		}else {
			result = new int[b.length];
			for(int i=0; i<a.length;i++) {
				if(i<a.length) {
					result[i]=a[i]+b[i];
				}else {
					result[i]=b[i];
				}
			}
		}
		return result;
	}
	public static void prt(int[] a) {
		for(int i=0; i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}
