package chap01;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		// 1.세 개의 정수를 입력받아서 그 숫자의 최대값,
		// 최소값, 평균을 구해봅시다.
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		double avg = (num1 + num2 + num3) / 3.0;

		int max = num1;
		int min = num1;

		if (max < num2) {
			max = num2;
		}

		if (max < num3) {
			max = num3;
		}

		if (min > num2) {
			min = num2;
		}
		if (min > num3) {
			min = num3;
		}

		System.out.println("최댓값 : " + max);
		System.out.println("최소값 : " + min);
		System.out.println("평균 : " + avg);

		// 2.키가 150이상이라면 놀이기구 탑승 가능, 부모와 함께 있을 때 탑승 가능,
		// 부모와 함께 있지 않다면 탑승 불가를 출력해 봅시다.
		System.out.println("2번 문제 시작 키를 입력하세요.");
		int height = sc.nextInt();
		System.out.println("부모와 함께 왔습니까?  그렇다면 yes, 아니면 no를 입력하세요.");
		String parent = sc.next();

		if (height >= 150) {
			System.out.println("탑승가능");
		} else {
			if (parent.equals("yes")) {
				System.out.println("탑승가능");
			} else {
				System.out.println("탑승불가");
			}
		}

		// 3.어떤 수를 입력받아서 숫자가 7의 배수인지 판단해봅시다.
		System.out.println("3번문제 시작, 숫자를 입력하세요.");
		int num4 = sc.nextInt();
		if (num4 % 7 == 0) {
			System.out.println("7의 배수 맞음");
		} else {
			System.out.println("7의 배수가 아니다.");
		}

		// 4.1학년부터 4학년까지 중간고사 시험을 보았다.
		// 4학년은 70점 이상이면 합격, 그 이외의 학년은 60점 이상이면 합격.
		// 점수가 0미만 100초과이면 경고문구 출력해 봅시다.
		System.out.println("4번 시작, 학년과 점수를 입력하세요.");
		int grade = sc.nextInt();
		int score = sc.nextInt();
		if (score >= 0 && score <= 100) {
			if (grade == 4) {
				if (score >= 70) {
					System.out.println("합격");
				} else {
					System.out.println("불합격");
				}
			} else {
				if (score >= 60) {
					System.out.println("합격");
				} else {
					System.out.println("불합격");
				}
			}
		}else {
			System.out.println("잘못입력하였습니다.");
		}
	}

}
