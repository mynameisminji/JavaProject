package mj;

import java.util.Scanner;

public class Lab_1215_04 {

	public static void main(String[] args) {
		// 35번.
		// 잔돈 돌려주기 프로그래밍.
		// 1) 총 가격이 얼만지 입력 2) 얼마 내가 내는 지 입력.

		Scanner sc = new Scanner(System.in);

		System.out.println("가격이 총 얼마 나왔나요?");
		int price = sc.nextInt();

		System.out.println("돈을 총 얼마 낼 건가요?");
		int money = sc.nextInt();

		int cost = (money - price);
		int ten = 10;

		int change = (int) (cost / ten);

		String change1 = Integer.toString(change);

		System.out.printf("잔돈은 총 %d 나왔습니다. \n", cost);

		// 예 잔돈이 99800원이라면...

		char thous = change1.charAt(0);
		System.out.printf("10000원 짜리 지페 %s받아가세요.", thous);
		System.out.println();

		char hund = change1.charAt(1);
		System.out.printf("1000원 짜리  %s받아가세요.", hund);
		System.out.println();

		char tens = change1.charAt(2);
		System.out.printf("100원 짜리  %s받아가세요.", tens);
		System.out.println();

		char one = change1.charAt(3);
		System.out.printf("10원 짜리  %s받아가세요.", one);

	}

}
