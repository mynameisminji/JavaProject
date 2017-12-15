package mj;

import java.util.Scanner;

public class Lab08_4 {

	public static void main(String[] args) {
		// 23. 복권발행 프로그램. - if구문을 사용하기
		// 특정 범위를 포함하는 난수 생성.
		// 정수난수값 %((마지막값 - 시작값) +1) + 시작값
		// 복권 숫자 범위 : 100 -999
		// lotto : 657, lucky : 452 = 1개 일치
		// lotto : 657, lucky : 524 = 1개 일치
		// lotto : 657, lucky : 123 = 0개 일치
		// lotto : 657, lucky : 762 = 2개 일치
		// 자릿수와 상관 없이 숫자와 맞으면 되는 거임. 즉, 숫자 하나씩 뽑아내야함. CHAR.AT을 쓰면 됨.

		System.out.println("****밍디의 LOTTERY에 오신걸 환영합니다****");
		System.out.println("복권 3자리를 숫자로 입력해주세요.");

		Scanner sc = new Scanner(System.in);

		String user = sc.nextLine();
		int com = (int) (Math.random() * 100);
		// 랜덤으로 된 com의 변수를 %((999-100)+1) +100을 하게 되면 100 ~ 999까지의 숫자만 나오게 된다.
		int randomC = com % ((999 - 100) + 1) + 100;

		// user는 String이기 때문에 바로 charAt을 사용하여 자릿수를 뽑아낼 수 있다.
		// 하지만 randomC의 경우 int이기 때문에 int를 String으로 캐스팅 할 수 있는 메소드를 이용해야합니다.
		// 그 메소드가 바로 integer.toString();로 바꾸어야 합니다.
		// String lotto = Integer.toString(randomC);
		// System.out.println(lotto);

		char a = user.charAt(0);
		char b = user.charAt(1);
		char c = user.charAt(2);

		// int -> (integer.toString사용을 통해) string -> char(charAt의 사용을 통해) 변경한 것은 민지의 방법
		// int -> char로 바꾸는 방법은...! ("" +int형변수).charAt()을 쓰면 됩니당.
		// char a1 = lotto.charAt(0);
		// char b1 = lotto.charAt(1);
		// char c1 = lotto.charAt(2);
		char a1 = ("" + randomC).charAt(0);
		char b1 = ("" + randomC).charAt(1);
		char c1 = ("" + randomC).charAt(2);
		int match = 0;

		String lotto7 = "" + randomC;
		int size = lotto7.length();
		for (int i = 0; i < size; ++i)
			for (int j = 0; j < size; ++j)
				if (user.charAt(i) == lotto7.charAt(j))
					++match;

		// if 절로
		if (a == a1 || a == b1 || a == c1)
			++match;
		if (b == a1 || b == b1 || b == c1)
			++match;
		if (c == a1 || c == b1 || c == c1)
			++match;

		switch (match) {
		case 1:
			System.out.println("이번 복권당첨 숫자는 " + randomC + "입니다.");
			System.out.println("축하해요~~1만원 상당의 복권에 당첨되었습니다.");
			break;
		case 2:
			System.out.println("이번 복권당첨 숫자는 " + randomC + "입니다.");
			System.out.println("축하해요~~10만원 상당의 복권에 당첨되었습니다.");
			break;
		case 3:
			System.out.println("이번 복권당첨 숫자는 " + randomC + "입니다.");
			System.out.println("축하해요~~~100만원 상당의 복권에 당첨되었습니다.");
			break;

		// default를 써야지 case 1,2,3 이 아니게 되면 나오게 되는 실행문을 쓸 수 있다.
		default:
			System.out.println("꽝이에요. 왜냐하면 이번 복권당첨 숫자는 " + randomC);
		}
	}

}
