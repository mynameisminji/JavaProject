package mj;

public class Lab15 {

	public static void main(String[] args) {

		// [4-8] 2x+4y=10 방정식 의 모든 해를 구하시오 단 와 는 정수이고 각각의 범위는 0<=x<=10, 0<=y<=10 이다.

		for (int x = 0; x <= 10; x++)

			for (int y = 0; y <= 10; y++) {

				if ((2 * x + 4 * y) == 10) {

					System.out.printf("x = %d, y = %d\n", x, y);
					// 괄호 조심!!!
				}
			}
	}
}