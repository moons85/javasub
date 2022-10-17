package test;

public class Q01 {

	public static void main(String[] args) {
		//1. 가로가 3이고 세로가 6인 사각형의 넓이 
		int width = 3;
		int height =6;
		
		double Area = width*height;
		System.out.println("사각형의 넓이: "+Area);
		
		//1. 가로가 3이고 세로가 6인 삼각형의 넓이 
		Area = (width*height) / 2.0;
		System.out.println("삼각형의 넓이: "+Area);
		
		//3. 성적이 40, 30, 10 나왔다 평균은 ?
		int score1=40;
		int score2=30;
		int score3=10;
		int sum = score1+score2+score3;
		double avg = sum/3.0;
		System.out.println("평균: "+((score1+score2+score3)/3.0));
		
		//4. 월급이 100원이다 연봉은? (세금 20프로제외)
		int salary =100;
		double totalsalary = 100*12*0.8;
		System.out.println("세후 연봉: "+ totalsalary);
		
		//5. 286 초를 분초로 출력
		int time=286;
		int minute=time/60;
		int second=time%60;
		System.out.println("286 초는: "+ minute+"분,  "+second+"초");
		
		//6.결과 출력
		int x=10;
		int y=5;
		System.out.println((x>7) && (y<=5));
		System.out.println( (x%3==0) || (y%2 !=1) );
		
		//7. 534자루 연필을 30명의 학생들에게 똑같은 개수로 나누어 줄 때 학생당 몇 개를 가질 수 있고, 
		//최종적으로 몇 개가 남는지를 구하세요.
		int pencil = 534;
		int student = 30;
		
		int OneStudentPerPencil = pencil/student;
		int pencilLeft = pencil%student;
		
		System.out.println(OneStudentPerPencil+"와" +pencilLeft);
		
		//8.변수 value의 값이 356이라면 300이 나올 수 있도록 코드를 작성하세요.(산술 연산자만 사용하세요.)
		int value =356;
		
		System.out.println(value/100*100);
		
		
		//9.176840원 을 화폐매수대로 출력
		int money = 176840;
		int unit=50000;
		
		int ohMan = money/unit; //3
		money %= unit; // 26840
		unit /=5; //10000
		
		int man = money/unit; //2
		money %=unit; //6840
		unit /=2; //5000
		
		int ohChen = money/unit; //1
		money %=unit; //1840
		unit /=5; // 1000
		
		int chen = money/unit; //1
		money %= unit; //840
		unit /=2; //500
		
		int ohBack = money/unit; //1
		money %= unit; // 340
		unit /=5; //100
		
		int back = money/unit; //3
		money %= unit; //40
		unit /=2; // 50;
		
		int ohSip = money/unit; // 40;
		money %= unit; //40
		unit /=5; // 10;
		
		int sip =money/unit; //4;
		
		System.out.println("원래 금액 : 176840원");
		System.out.println("오만원권 갯수 : " + ohMan);
		System.out.println("만원권 갯수 : " + man);
		System.out.println("오천원권 갯수 : " + ohChen);
		System.out.println("천원권 갯수 : " + chen);
		System.out.println("오백원권 갯수 : " + ohBack);
		System.out.println("백원권 갯수 : " + back);
		System.out.println("오십원권 갯수 : " + ohSip);
		System.out.println("십원권 갯수 : " + sip);
		
		
		//10.점수에 따라 등급을 출력해보자
		int score=70;
		char grade = (score>=90)?'A':((score>=80)?'B':((score>=70)?'C':((score>=60)?'D':'F')));
		System.out.println("학점은: "+grade);
	}

}
