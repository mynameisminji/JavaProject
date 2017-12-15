package mj;

import java.util.Scanner;

public class Excercise01 {

	public static void main(String[] args) {

		System.out.println("1, 2, 3 중 하나를 쓰세요");

		Scanner sc = new Scanner(System.in);

		int yourNo = sc.nextInt();
		int comNo = (int) (Math.random() * 3) + 1;

		System.out.println("당신이 낸 것은 " + yourNo + " 입니다.");
		System.out.println("컴퓨터가 낸 것은 " + comNo + " 입니다.");

		switch (yourNo - comNo) {
		case 2:
		case -1:
			System.out.println("Lose");
			break;
		case 1:
		case -2:
			System.out.println("Win");
			break;
		default:
			System.out.println("Draw");

		}
	}
}
