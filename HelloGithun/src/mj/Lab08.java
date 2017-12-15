package mj;

import java.io.IOException;
import java.util.Scanner;

public class Lab08 {

	public static void main(String[] args) throws IOException {

		// 23. 복권발행 프로그램.

		System.out.println("****LOTTERY에 오신걸 환영합니다****");
		System.out.println("복권 3자리를 숫자로 입력해주세요.");

		Scanner sc = new Scanner(System.in);

		int user1 = sc.nextInt();
		int user2 = sc.nextInt();
		int user3 = sc.nextInt();

		int com1 = (int) (Math.random() * 1000);
		int com2 = (int) (Math.random() * 1000);
		int com3 = (int) (Math.random() * 1000);

		System.out.println(com1);
		// test1은 로또1 숫자가 com과 같을
		boolean lotto1 = (user1 == com1 || user1 == com2 || user1 == com3);
		// test2은 로또2 숫자가 com과 같을
		boolean lotto2 = (user2 == com1 || user2 == com2 || user2 == com3);
		// test3은 로또1 숫자가 com과 같을
		boolean lotto3 = (user3 == com1 || user3 == com2 || user3 == com3);

		if (lotto1 && lotto2 && lotto3)

			System.out.println("로또에 당첨되었습니다!!! 상금 1백만원 지급됩니다");

		// else if(lotto1)

		// 연습문제 27.

		int number = 0;
		int sum = 0;

		while (number < 20) {
			number++;
			sum += number;

			if (sum >= 100)
				break;
		}
		System.out.printf("27번 코드 결과 값 : number = %d, sum = %d\n", number, sum);

		// 연습문제 28.

		number = 0;
		sum = 0;

		while (number < 20) {
			number++;
			if (number == 10 || number == 11)
				continue;
			// number가 10이거나 11일때는 sum에다가 더하지 않고 바로 while구문으로 올라간다.
			// continue문을 시행하면 밑에 줄은 시행하지 않는다.
			sum += number;
			// sum = 1+2+3+4+5+6+7+8+9+12+13+15+16+17+19
		}
		System.out.printf("28번 코드 결과 값 : number = %d, sum = %d\n", number, sum);

		// 30. 구구단 차트. - 민디가 만들은거에요

		System.out.println("----------------------------Multiplication Table----------------------------");
		System.out.println("\t1\t2\t3\t4\t5\t6\t7\t8\t9");
		System.out.println("----------------------------------------------------------------------------");

		for (int i = 1, j = 2; i <= 9; i++)
			System.out.print("\t" + i * j);
		System.out.println();

		for (int i = 1, j = 3; i <= 9; i++)
			System.out.print("\t" + i * j);
		System.out.println();

		for (int i = 1, j = 4; i <= 9; i++)
			System.out.print("\t" + i * j);
		System.out.println();

		for (int i = 1, j = 5; i <= 9; i++)
			System.out.print("\t" + i * j);
		System.out.println();

		for (int i = 1, j = 6; i <= 9; i++)
			System.out.print("\t" + i * j);
		System.out.println();

		for (int i = 1, j = 7; i <= 9; i++)
			System.out.print("\t" + i * j);
		System.out.println();

		for (int i = 1, j = 8; i <= 9; i++)
			System.out.print("\t" + i * j);
		System.out.println();

		for (int i = 1, j = 9; i <= 9; i++)
			System.out.print("\t" + i * j);

		// 30. 구구단 차트 - 선생님 해답. 1) 노동력 갑임
		System.out.println();
		System.out.println();
		String fmt;

		fmt = "\t   Multipliucation Table \n";
		// fmt = fmt + ""; 랑 똑같음.
		fmt += "        1   2   3   4   5   6   7   8   9\n";
		fmt += "-----------------------------------------\n";
		fmt += "1|      1   2   3   4   5   6   7   8   9\n";
		fmt += "2|      1   2   3   4   5   6   7   8   9\n";
		fmt += "3|      1   2   3   4   5   6   7   8   9\n";
		fmt += "4|      1   2   3   4   5   6   7   8   9\n";
		fmt += "5|      1   2   3   4   5   6   7   8   9\n";
		fmt += "6|      1   2   3   4   5   6   7   8   9\n";
		fmt += "7|      1   2   3   4   5   6   7   8   9\n";
		fmt += "8|      1   2   3   4   5   6   7   8   9\n";
		fmt += "9|      1   2   3   4   5   6   7   8   9\n";
		System.out.printf(fmt);

		// 30. 구구단 차트 - 선생님 해답. 2) for 구문
		System.out.println();
		System.out.println();

		fmt = "\t   Multipliucation Table \n";
		// fmt = fmt + ""; 랑 똑같음.
		fmt += "        1   2   3   4   5   6   7   8   9\n";
		fmt += "-----------------------------------------\n";
		System.out.println(fmt);

		for (int i = 1; i <= 9; ++i) {
			fmt += "%d  |  %3d  %2d  %2d  %2d  %2d  %2d  %2d  %2d  %2d\n";
			System.out.printf(fmt, i, 1 * i, 2 * i, 3 * i, 4 * i, 5 * i, 6 * i, 7 * i, 8 * i, 9 * i);

		}

	}
}
