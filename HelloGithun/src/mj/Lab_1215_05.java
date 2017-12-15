package mj;

public class Lab_1215_05 {

	public static void main(String[] args) {
		// for 반복문 33번 문제.

		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < i + 1; j++)
				System.out.print("*");

			System.out.println();
		}

		for (int i = 0; i < 4; i++) {

			for (int j = 4; j > 0; j--)
				System.out.print("*");

			System.out.println();
		}
	}
}
