package mj;

import java.util.Scanner;

public class Lab11_ex24 {

	public static void main(String[] args) {

		// 구구단 문제.

		String welcome = "구구단을 외자 구구단을 외자!!!";
		String fmt = "%2d x %2d = %3d \n";
		Scanner sc = new Scanner(System.in);

		System.out.println(welcome);
		int dan = sc.nextInt();

		for (int i = 1, j = dan; i <= 19; i++)

			System.out.printf(fmt, j, i, i * j);

	}
}
