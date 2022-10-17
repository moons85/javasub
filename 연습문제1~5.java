package tmp02;
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		//01.1부터 100까지의 합을 출력해 보세요.

				int sum =0;
				for(int i =0;i<=100;i++ ) {
					sum +=i;
				}
				System.out.println(sum);
				System.out.println("-----------------------------------------");
				
		//02.1부터 100까지의 합을 구하되 합계이 1000이 
		//넘어셔면 연산을 중단하고 그때의 합계를 출력해 보세요.
		    sum =0;
		for(int i =0;i<=100;i++ ) {
			sum +=i;
			if(sum>1000) {
				break;
			}
		}
		System.out.println(sum);
		System.out.println("-----------------------------------------");
		
		
		//03.로그인 기능을 구현하세요.
	    //저장된 아이디 : ‘green'
	    //저장된 비밀번호: ‘123456

       Scanner scan = new Scanner(System.in);
		
		//미리 저장된 Id,password
		String id = "green";
		String password = "123456";
		
		System.out.println("로그인 프로그램");
		System.out.print("아이디 : ");
		String userId = scan.nextLine();
		System.out.print("비밀번호 : ");
		String userPassword = scan.nextLine();
		
//		System.out.println("입력한 아이디 : "+userId);
//		System.out.println("입력한 비밀번호 : "+userPassword);
		
		// 로그인 처리 프로그램을 만들어 봅시다.
		// 아이디가 틀린 경우 "아이디가 존재하지 않습니다."
		// 비밀번호가 틀린 경우 "잘못된 비밀번호입니다."
		// 아이디,비밀번호가 일치하는 경우 "로그인 성공"

		/*
		 * 입력된 아이디하고 저장된 아이디하고 일치한다면{
		 * 	   입력된 비밀번호하고 저장된 비밀번호하고 일치한다면{
		 * 			=>  로그인 성공
		 *    }입력된 비밀번호하고 저장된 비밀번호하고 일치하지 않는다면{
		 * 			=>  잘못된 비밀번호
		 *    }
		 * }입력된 아이디하고 저장된 아이디하고 일치하지 않는다면{
		 *    => 아이디가 존재하지 않습니다.
		 * }
		 */
		
		if(id.equals(userId)){
			if(userPassword.equals(password)) {
				System.out.print("");
			}else {
				System.out.println("잘못된 비밀번호");
			}
		}else {
			System.out.println("아이디가 존재하지 않습니다.");
		}
		
		if((id.equals(userId)) && (userPassword.equals(password))) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
		
		System.out.println("-----------------------------------------");
		
		//04. 구구단 짝수단을 출력하세요.
		for(int i=2;i<=9;i++) {
			
			if(i%2==0) {
				System.out.println(i+"단");
				for(int j =1;j<=9;j++) {
					System.out.println(i+"x"+j+"="+(i*j));
				}
			}
		}
		//05.가위바위보 게임
		// 가위 바위 보중에 하나를 입력하면 컴퓨터가 생각한 가위바위보랑 비교해서 승,무,패를 출력하세요.
		Scanner sc = new Scanner(System.in);
		int computer =(int)(Math.random()*3+1);
		int me = 0;
		
		while(true) {
			System.out.println("1.가위 2.바위 3.보 선택하세요.");
			me =sc.nextInt();
			if(me>=4) {
				System.out.println("숫자를 입력하세요.");
			}
			else break;
		}
		System.out.println("컴퓨터가 낸것 : " + computer);
		if(computer==me) {
			System.out.println("무");
		}
		else if(computer==1 && me==2){
			System.out.println("승");
		}
		else if(computer==2 && me==3) { System.out.println("승");
		}
		else if(computer==3 && me==1) { System.out.println("승");
		}
		else System.out.println("패");

		
		
		
	}

}
