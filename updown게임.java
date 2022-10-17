 package tmp02;

import java.util.Scanner;

public class Qquize {

	public static void main(String[] args) {
		boolean flag = true;
		int count = 0; // 시도횟수
		
		int randomNumber = (int)(Math.random() * 100 + 1);	//랜덤 숫자값 받아옴
		
		while(flag) {
			
			System.out.print("숫자를 입력하세요 : ");
			Scanner scan = new Scanner(System.in);
			int myNumber = scan.nextInt();	//내가 입력한 값
			
			count++;
			
			if(myNumber > randomNumber) {
				System.out.println("Down");
			} else if(myNumber < randomNumber) {
				System.out.println("Up");
			} else {
				flag = false;
			}
		}
		System.out.println("축하합니다. 시도횟수는 : " + count);
	}

}
