package Array;

public class Q07 {

	public static void main(String[] args) {
		// �迭�� ��� ���ڸ� �о ���ڸ�ŭ *�� ��� ���α׷��� �ϼ��ϼ���.
		int[] arr = new int[]{3,2,5};

		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i];j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
