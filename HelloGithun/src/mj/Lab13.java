package mj;

public class Lab13 {

	public static void main(String[] args) {

		// 중첩 반복문 연습.

		for (int i = 1; i <= 14; i++) {
			for (int j = 1; j <= i; j++) {

				System.out.print("*");
			}
			System.out.println();
		}

	}
}