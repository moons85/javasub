package Array;

public class Q08 {

	public static void main(String[] args) {
		//a�� ���� b�� ���� �����ư��鼭 c�� ����
		int a[] = {10,20,30};
		int b[] = {40,50,60};
		int[] c = new int[6];
		int index=0;
		for(int i =0; i<a.length;i++) {
			c[index]=a[i];
			c[index+1]=b[i];
			index += 2;
		}
		System.out.println("c�迭 ��: ");
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}
	}
}
