package mj;

public class Lab10_ex30 {

	public static void main(String[] args) {
		// 문제 30.
		// Multiplication Table

		System.out.println("\t 1 \t 2 \t 3 \t 4 \t 5 \t 6 \t 7 \t 8 \t 9");
		System.out.println("-------------------------------------------------");

		int gugu1 = 0;
		int gugu2 = 0;
		int gugu3 = 0;
		int gugu4 = 0;
		int gugu5 = 0;
		int gugu6 = 0;
		int gugu7 = 0;
		int gugu8 = 0;
		int gugu9 = 0;

		for (int i = 1, j = 1; i < 10; i++) {
			gugu1 = i * j;

			System.out.print(" \t" + gugu1);
		}

		for (int i = 1, j = 2; i < 10; i++) {

			gugu2 = i * j;
			System.out.print("\t" + gugu2);
		}

		for (int i = 1, j = 3; i < 10; i++) {

			gugu3 = i * j;
			System.out.print(gugu3);
		}

		for (int i = 1, j = 4; i < 10; i++) {

			gugu4 = i * j;
			System.out.print(gugu4);
		}

		for (int i = 1, j = 5; i < 10; i++) {

			gugu5 = i * j;
			System.out.print(gugu5);

		}

	}
}
