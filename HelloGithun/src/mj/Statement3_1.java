package mj;

public class Statement3_1 {

	public static void main(String[] args) {
		// 구구단
		// 5 * 1 = 5
		// 5 * 2 = 10
		// ...

		// 구구단 5단.
		String fmt = ("5*%d=%d \n");
		for (int i = 1, j = 5; i <= 9; i++) {
			System.out.println(j + "*" + i + "=" + i * j);

			System.out.printf(fmt, i, i * j);

		}
	}

}
