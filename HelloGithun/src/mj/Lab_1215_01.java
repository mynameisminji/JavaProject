package mj;

import java.util.Scanner;

public class Lab_1215_01 {

	public static void main(String[] args) {
		// 26- 숫자맞추기.

		// 입력 메소드 호출
		Scanner sc = new Scanner(System.in);
		System.out.println("2자리 숫자를 입력해주세요.");

		// 임의의 숫자가 만들어지는 것은 while 문 안에 들어가 있으면 숫자가 다시 만들어지기 때문에
		// while 문 밖에서 만들고 입력값을 안에다가 넣기!!!
		int num2 = (int) (Math.random() * 100) + 1;

		while (true) {

			int num1 = sc.nextInt();

			if (num1 > num2)
				System.out.println("숫자가 큽니다요");

			else if (num1 < num2)
				System.out.println("숫자가 작습니다요");

			else if (num1 == num2) {
				System.out.println("숫자가 같습니다요");
				break;
			}
		}

	}
}