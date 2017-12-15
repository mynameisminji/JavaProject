package mj;

import java.util.Scanner;

public class Lab04 {

	public static void main(String[] args) {

		// #16.
		int n = 1;
		int k = 2;
		int r = n;

		if (k < n)
			r = k;
		System.out.println("16-a의 정답은 " + r);

		n = 1;
		k = 2;

		if (n < k)
			r = k;
		System.out.println("16-b의 정답은 " + r);

		n = 1;
		r = k;

		if (n < k)
			n = r;
		else
			k = n;
		System.out.println("16-c의 정답은 " + k);

		r = 3;

		if (r < n + k)
			r = 2 * n;
		else
			k = 2 * r;
		System.out.println("16-d의 정답은 " + k);

		// #17

		int x = 0;
		int y = 0;
		// if (x && y == 0) {
		// x = 1; y =1;
		// }

		if (1 <= x && x <= 10)
			System.out.println(x);

		// #18.

		int number = 35;
		if (number % 2 == 0)
			System.out.println(number + "is even.");
		System.out.println(number + "is odd.");

		int number1 = 30;
		if (number1 % 2 == 0)
			System.out.println(number1 + "is even");
		else
			System.out.println(number1 + "is odd");

		// #19.

		x = 3;
		y = 2;
		int z;

		if (x > 2) {
			if (y > 1) {
				z = x + y;
				System.out.println("x is " + z);
			} else
				System.out.println("x is " + x);
		}

		// #20.

		int a = 3;
		if (a++ == 3)
			System.out.println("three");
		else
			System.out.println("four");

		int b = 3;
		if (++b == 3)
			System.out.println("three");
		else
			System.out.println("four");

		int c = 3;
		c = ++c;
		if (c == 3) {
			System.out.println("three");
		} else
			System.out.println("four");

		Scanner sc = new Scanner(System.in);

		System.out.println("결헌여부를 입력하세요. 미혼 : 0, 기혼 : 1");
		System.out.println("연봉이 어떻게 되나요?");

		int isMarried = sc.nextInt();
		int salary = sc.nextInt();
		int tax = 0;

		if (isMarried == 0) {

			if (salary < 3000)
				tax = (int) (salary * 0.1);
			else
				tax = (int) (salary * 0.25);

		} else if (isMarried == 1) {
			if (salary < 3000)
				tax = (int) (salary * 0.2);
			else
				tax = (int) (salary * 0.1);

		}

		System.out.println("당신의 세금납부 금액은 " + tax + " 만원 나왔습니다.");
	}
}
