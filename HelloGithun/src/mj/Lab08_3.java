package mj;

import java.util.Scanner;

public class Lab08_3 {
	public static void main(String[] args) {

		// 23. 복권발행 프로그램. - 밍디가 만든거

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

	}

}