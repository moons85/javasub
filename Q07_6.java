package method;

import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
		// 크기 5의 배열의 값을 입력받아서 평균을 구하는 메서드를 만들어 보세요.  
				int[] arr = new int[5];
				Scanner scan = new Scanner(System.in);
				for(int i=0;i<arr.length;i++) {
					arr[i] = scan.nextInt();
				}
				int avg=avg(arr);
				System.out.println("입력된 배열의 평균은 : " + avg);
	}
	public static int avg(int[] a) {
		int sum =0;
		int count=0;
		int avg=0;
		for(int i=0;i<a.length;i++) {
			sum +=a[i];
			count++;
		}
		avg = sum/count;
		return avg;
	}
	

}
