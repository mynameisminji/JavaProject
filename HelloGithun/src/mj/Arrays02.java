package mj;

public class Arrays02 {

	public static void main(String args[]) {

		// 2차원 배열. : [][] - 행열
		int[][] lotto = new int[3][6];
		lotto[0][0] = 15;
		lotto[2][5] = 15;

		// 문제! 1~45의 정수 6개를 출력하는 난수 코드 작성.

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 6; j++) {

				// int random = (int) (Math.random() * 45) + 1; // 이거는 비추. 왜냐면 나오는 숫자만 나오는 경향이
				// 있음.
				int rand = (int) (Math.random() * 100) + 1;// 이 값은 1~100까지로 나옴.
				int lotto645 = rand % ((45 - 1) + 1) + 1; // ()안에 끝나는 숫자가 앞에 - 맨 처음 나오는 숫자 1. 외우기.

				// System.out.printf("%d ", random);
				lotto[i][j] = lotto645;

				System.out.printf(" %2d ", lotto[i][j]);
				// System.out.println();

			} // for j

			System.out.println();

		} // for i

		// 2차원 배열에 대한 향상된 for문 사용.
		for (int[] row : lotto) {
			for (int col : row) {
				System.out.printf(" %2d ", col);

			}
			System.out.println();
		}

	}

}
