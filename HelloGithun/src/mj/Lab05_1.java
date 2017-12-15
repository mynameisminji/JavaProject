package mj;

import java.util.Scanner;

public class Lab05_1 {

	public static void main(String[] args) {
		// 4-7문제. 가위 바위 보 문제.

		Scanner sc = new Scanner(System.in);
		System.out.println("가위(1), 바위(2), 보(3) 중 숫자로 하나를 입력하세요.");

		int user = sc.nextInt();
		int com = (int) (Math.random() * 3) + 1;
		// (int) (Math.random()*3)+1 의 값은 오로지 1,2,3 만 나오게 되어있다.
		// Math.random()은 실수형으로 소수로 나타낸 숫자이다.
		// Math.random()인 실수형에다 3을 곱하면 아무리 큰 숫자여도 3을 넘지 못하여 1을 더한다.
		// int는 0도 포함한다.

		System.out.println("당신이 낸 것은 " + user + " 입니다.");
		System.out.println("컴퓨터가 낸 것은 " + com + " 입니다.");

		switch (user - com) {
		case 2:
		case -1:
			System.out.println("You LOSE");
			break;
		case 1:
		case -2:
			System.out.println("You WIN");
			break;
		case 0:
			System.out.println("Draw!");
			break;

		}

	}

}
