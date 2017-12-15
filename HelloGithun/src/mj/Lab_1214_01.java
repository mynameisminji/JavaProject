package mj;

public class Lab_1214_01 {

	// fdsfasfsa

	public static void main(String[] args) {
		// 교재 소스 5-6, 5-10, 5-11, 5-20, 5-21

		// 5-6 정렬 예제.
		int[] score = { 100, 88, 91, 33, 10, 55, 95 };

		int max = score[0]; // 배열의 첫번째 값은 max라는 변수에 담기.
		int min = score[0]; // 배열의 첫번째 값은 min이라는 변수에 담기.

		// for을 통해 max변수와 min변수에 최대값과 최소값을 넣어보쟈요~

		for (int i = 0; i < score.length; i++) {

			if (score[i] > max)
				max = score[i];

			else if (score[i] < min)
				min = score[i];

		}
		System.out.printf("최대값은 %d, 최소값은 %d", max, min);
		System.out.println();
		System.out.println();

		// 5-10 정렬 예제.

		int[] numArr = new int[10];

		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] = (int) (Math.random() * 10));
		}
		System.out.println();

		// 질문 boolean의 역할이 뭔지 모르겠음...
		for (int i = 0; i < numArr.length - 1; i++) {
			boolean changed = false;
			// changed는 계랸된 코드.

			for (int j = 0; j < numArr.length - 1 - i; j++) {
				if (numArr[j] > numArr[j + 1]) {
					int temp = numArr[j + 1];
					numArr[j] = numArr[j + 1];
					numArr[j + 1] = temp;
					changed = true;

				}
			} // end for j
			if (!changed)
				break;

			for (int k = 0; k < numArr.length; k++)
				System.out.print(numArr[k]);
			System.out.println();

		} // end for i

		System.out.println();
		System.out.println();

		// 예제 5-11

		int[] num = new int[10];
		int[] counter = new int[10];

		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 10); // 0~9까지의 임의수를 num[10]안에다가 넣기.
			System.out.print(num[i]);
		} // num의 배열 숫자 완성!
		System.out.println();

		for (int i = 0; i < num.length; i++) {
			counter[num[i]]++;
			// counter라는 배열에 num의 임의의 값이 곧 인덱스..
			// counter의 인덱스는 0부터 9까지이며 랜덤수는 최대가 9이기 때문에 배열이 넘치지는 않는다.
			// ++ 붙은 이유는 1씩 더해줘야지 어느 숫자가 몇개인지 알 수 있으니깐.
		} // counter의 배열 숫자 완성!!

		for (int i = 0; i < num.length; i++) {
			System.out.println(i + "의 개수 :" + counter[i]);
		} // 하나씩 하나씩 돌려볼까나~?

	}
}