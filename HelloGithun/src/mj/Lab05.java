package mj;

import java.util.Scanner;

public class Lab05 {

	public static void main(String[] args) {

		// 자바 정석 예제문제 4-6, 4-7, 4-8
		// 4-6 : 계절 출력 문제.

		Scanner sc = new Scanner(System.in);
		System.out.println("현재 월을 입력해보세요.");
		int month = sc.nextInt();
		// month 변수에 스케너 메소드를 사용하여 콘솔창에 입력한 값이 데이터로 되도록 함.

		switch (month) {
		case 12:
		case 1:
		case 2:
			System.out.println("현재의 게절은 겨울 입니다.");
			break;

		case 3:
		case 4:
		case 5:
			System.out.println("현재의 게절은 봄 입니다.");
			break;

		case 6:
		case 7:
		case 8:
			System.out.println("현재의 게절은 여름 입니다.");
			break;

		default:
			System.out.println("현재의 게절은 가을 입니다.");
		}

	}

}
