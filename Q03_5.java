package Array;

public class Q03 {

	public static void main(String[] args) {
		//���� 2���� �迭�� ��� ��� ������ ���հ� ����� ���ϴ� ���α׷��� �ϼ��ϼ���.
		int[][] arr = { 
		          {  5,  5,   5,   5,  5},
		          { 10, 10, 10, 10, 10}, 
		          { 20, 20, 20, 20, 20}, 
		          { 30, 30, 30, 30, 30} };
		int sum=0;
		int count=0;
		for(int i=0; i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				sum+=arr[i][j];
				count++;
			}
		}
		System.out.println("�հ�: "+ sum);
		System.out.println("���: " + (sum/count));
	}

}
