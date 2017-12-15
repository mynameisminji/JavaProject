package mj;

import java.util.Scanner;

public class Lab07_1 {

	public static void main(String[] args) {

		// # 22. - 윤년 여부 확인.
		// 조건 1) 현재 연도가 400으로 나눠 떨어지는 것.
		// 조건 2) 현재 연도가 4로 나눠 떨어지지만 100으로는 나누어 떨어지지 않는 것은.

		Scanner sc = new Scanner(System.in);

		String fmt1 = "%d는 윤년입니다.";
		String fmt2 = "%d는 윤년이 아닙니다.";
		String wcm = "윤년 확인할 연도를 입력하세요";

		System.out.println(wcm);
		int year = sc.nextInt();

		if (year % 400 == 0) {
			System.out.printf(fmt1, year);
		}

		else if (year % 4 == 0 && !(year % 100 == 0)) {
			System.out.printf(fmt1, year);
		} else

			System.out.printf(fmt2, year);

		// 선생님 해답 코드.
		// 400으로 나누어 떨어지는 것 윤연 그리고 (||) 4로 떨어지는 것과 (&&) 100으로 떨어지지 않아야 하는 것을 조건 한 줄로 줌.

		if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)) {
			System.out.println("\n해답 코드를 사용할 경우 결과 = 윤년입니당");
		} else
			System.out.println("\n해답 코드를 사용할 경우 결과 = 윤년 아닙니당");

	}
}
