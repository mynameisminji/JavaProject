package mj;

import java.util.Scanner;

public final class Lab05_2 {

	public static void main(String[] args) {
		// 예제 4-8번 문제

		System.out.println("당신의 주민번호를 입력하세요. (011231-111222)>");

		Scanner sc = new Scanner(System.in);

		String registerNo = sc.nextLine();

		int gender = registerNo.charAt(7); // 입력받은 번호의 8번째 자리 숫자를 gender에 저장하기.

		switch (gender) {
		case '1':
		case '3':
			System.out.println("당신은 남자입니다.");
			break;

		case '2':
		case '4':
			System.out.println("당신은 여자입니다.");
			break;

		default:
			System.out.println("유효하지 않은 주민번호입니다.");

		}
	}

}
