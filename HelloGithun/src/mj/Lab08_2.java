package mj;

public class Lab08_2 {

	public static void main(String[] args) {

		// 30. 구구단 차트 - 선생님 해답. 2) for 구문
		String fmt;
		fmt = "\t   Multipliucation Table \n";
		// fmt = fmt + ""; 랑 똑같음.
		fmt += "        1   2   3   4   5   6   7   8   9\n";
		fmt += "-----------------------------------------\n";
		System.out.print(fmt);
		for (int i = 1; i <= 9; ++i) {
			fmt = "%d  |  %3d  %2d  %2d  %2d  %2d  %2d  %2d  %2d  %2d\n";
			System.out.printf(fmt, i, 1 * i, 2 * i, 3 * i, 4 * i, 5 * i, 6 * i, 7 * i, 8 * i, 9 * i);

		}
		System.out.println();
		System.out.println();

		// 30. 구구단 차트 - 선생님 해답. 3) for 구문 상 클래스

		fmt = "\t   Multipliucation Table \n";
		// fmt = fmt + ""; 랑 똑같음.
		fmt += "        1   2   3   4   5   6   7   8   9\n";
		fmt += "-----------------------------------------\n";
		// System.out.print(fmt);

		for (int i = 1; i <= 9; ++i) {
			System.out.printf("%d  |  %3d", i, i);

			for (int j = 2; j <= 9; j++) {

				System.out.printf(" %2d", i * j);
			}
			System.out.println();
		}
	}

}
