 package Array;

import java.util.Scanner;

public class Q06 {

	public static void main(String[] args) {
		//�迭�� �ݺ����� �̿��ؼ� ���α׷��� �ۼ��غ���
		int [] unit = {50000, 10000,5000, 1000, 500, 100, 50, 10, 1}; // ȯ���� ���� ����
		while(true){
			System.out.print("�ݾ��� �Է��Ͻÿ�(������:-1) : "); // 59080
			Scanner sd = new Scanner(System.in);
			int money = sd.nextInt();
			if(money==-1){
				break;
			}
			for(int i=0;i<unit.length;i++){
				System.out.println(unit[i]+"�� : "+ (money/unit[i]));
				money%=unit[i];
			}
		}
	}

}
