package mj;

public class Arrays03 {

	public static void main(String[] args) {

		int[] abc = { 12, 34, 56, 78, 90 };

		for (int i = 0; i < abc.length; i++)
			System.out.print(abc[i] + "\t");
		System.out.println();

		// 향상된 for 문으로 배열 다루기.
		// for (배열요소타입 변수명 : 배열)

		for (int a : abc) {

			System.out.print(a + "\t");
		}

	}

}
