package mj;

public class Statements4 {

	public static void main(String[] args) {

		// while 구문 배우기.

		int i = 1; // 초기식
		while (i <= 5) { // 조건식
			i++; // 증감식
			System.out.println("오늘 너무 춥다요");
		}
		// 무한 루프
		// while (true) {
		// System.out.println("나는 무한으로 돌아요");
		// }

		// 구구단 한 단

		// i = 9;
		// while (i > 10) {
		// .out.println("while : 이글이 보이나요?");

		// do while

		// 별 출력.
		// *
		// **
		// ***
		// ****
		int i1 = 1;
		int j = 1;
		while (i1++ <= 5) {
			while (j++ <= 5) {
				System.out.print("*");

			}
			j = 1;
			System.out.print("\n");
		}
	}

}
