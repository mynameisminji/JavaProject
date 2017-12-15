package mj;

public class Lab_1214_02 {

	public static void main(String[] args) {
		// 교재연습문제 5-1, 5-4, 5-5, 5-10
		// 5-1. 다음은 배열을 선언하거나 초기화한 것이다 잘못된 것을 고르고 그 이유를 설명 하시오.
		int[] arr[];
		int[] arr1 = { 1, 2, 3, };
		int[] arr2 = new int[5];
		// int[] arr3 = new int[5]{1,2,3,4,5};
		// int arr4 [5];
		int[] arr5[] = new int[3][];

		// 5-4
		int[][] arr6 = { { 5, 5, 5, 5, 5 }, { 10, 10, 10 }, { 20, 20, 20, 20 }, { 30, 30 } };

		System.out.println(arr6[3].length); // 반대로는?
		System.out.println();
		System.out.println();

		// [5-5] 다음은 1 과 9사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프로그램이다 에 알맞은 코드를 넣어서 프로그램을
		// 완성하시오

		int[] ballArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] ball3 = new int[3];

		// 배열의 임의의 요소를 골라서 위치를 바꾼다
		for (int i = 0; i < ballArr.length; i++) { // i= 0~8

			int j = (int) (Math.random() * ballArr.length); // j = 0~8?

			// System.out.print(j);

		}
		// ballarr배열 의 앞에서 3개의 수를 배열 ball3로 복사한다

		for (int i = 0; i < ball3.length; i++) {

			// System.out.print(ball3[i]);

		}
	} // end of main

}
