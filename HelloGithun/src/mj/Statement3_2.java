package mj;

public class Statement3_2 {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; ++i) {
			for (int j = 1; j <= 10; ++j) {

				System.out.print("*");
			}
			System.out.print("\n");
		}

		// 직각 삼각형 그리기

		for (int i = 1; i <= 5; ++i) {
			for (int j = 1; j <= i; ++j) {

				System.out.print("*");
			}
			System.out.print("\n");
		}

		// 거꾸로 삼각형 그리기.
		// 1-5 2-4 3-3 4-2 5-1

		for (int i = 1; i <= 5; ++i) {
			for (int j = 5; j >= i; --j) {
				// for (int j = 1; j <= (6 - i); j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}