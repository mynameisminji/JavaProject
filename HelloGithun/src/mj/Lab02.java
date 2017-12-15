package mj; //package 맨 처음 씀으로써 누가 코딩하는 것인지 출처를 알 수 있음.

public class Lab02 { // 클래스 선언!

	public static void main(String[] args) { // 클래스 선언 후 메인 메소드 쓰기.
		// 03 ~ 15
		// 03.
		int x = 3;
		int y = 6;
		int z = 3 * x;
		int f = (3 * x + 7);
		double l = (double) (x + y) / 7;
		double h = (double) (3 * x + y) / (z + 2);

		// 04 : 정수끼리 연산 결과는 정수.
		double nb = (1 / 3.0) * 3;
		System.out.println("4번 정답은 " + (double) nb);

		// 05
		int quotient, remainder;
		quotient = 7 / 3;
		remainder = 7 % 3;
		System.out.println(quotient);
		System.out.println(remainder);

		// 06.
		int result = 11;
		result /= 2; // result = result / 2;
		System.out.println("result는 " + result);

		// 07. 질문. double의 변수타입에는 똑같은 변수명을 쓰면 왜 에러?
		double a1 = 2.5;
		double a2 = -1.5;
		int a3 = 18;
		int a4 = 4;

		System.out.println(a1 + a4 * a2 - (a1 + a4) * a2);
		System.out.println(a3 / a4 + a3 % a4);
		System.out.println(5 * a1 - a4 / 5);
		System.out.println(1 - (1 - (1 - (1 - (1 - a4)))));

		// 08 - || 논리 연산자를 쓸 경우 하나의 true만 나오더라도 true이기 때문에 구지 뒤에 계산할 필요가 없는
		// 단축 평가가 나오게 된다.

		System.out.println(true || false && 3 < 4 || !(5 == 7)); // 단축 평가인 데스코드가 나옴.
		System.out.println(true || (3 < 5 && 6 >= 2));
		System.out.println(50 > 'A');
		System.out.println(7 % 4 + 3 - 2 / 6 * 'Z');
		System.out.println(7 % 4);

		// 09
		// 특정일의 요일을 알아내는 수식.

		// System.out.println(Year + (Year / 4) - (Year / 100) + (Year / 400) + (13 *
		// Month + 8) / 5 + Day % 7);
		System.out.println("hello there" + '9' + 7);
		// 문자열이 앞에 있으면 뒤에 것도 문자로 처리 해버림.
		System.out.print('H' + 'I' + "Reverse" + 'I' + 'T');
		// 문자 앞에 있는 HI는 아스키코드로 변환되어 숫자로 나오고 뒤에는 REVERSE라는 문자때문에 그대로 문자열로 처리됨.
		System.out.println();
		System.out.println("How about this one?" + '?' + "Huh?");
		System.out.println("No here is " + 1 + "More examples");

		// 10

		System.out.println(true && false && true || true);
		System.out.println(true || true && true && false);
		// System.out.println((true&&false)||(true&&true||true);

		// 12
		int n = (int) 3.9; // 축소형 변환
		System.out.println("12-1번 정답 . n == " + n);

		// 13
		int n1 = 3;
		n1++;
		System.out.println("13-1번 정답. n1 == " + n1);

		n1 = 3;
		System.out.println(++n1);

		n1--;
		System.out.println("13-2번 정답. n1 == " + n1);

		// 14 - 문자 연결.22가 나오는 것은 앞에 문자열이 있기 때문에 2를 그대로 문자로 받아드리게 된다.
		System.out.println("14-1번 정답. 2+2 =" + (2 + 2));
		System.out.println("14-2번 정답. 2+2 =" + 2 + 2); //

		// 15
		char a, b;
		a = 'b';
		System.out.println("15-1번 정답." + a);

		b = 'c';
		System.out.println("15-2번 정답." + b);

		a = b;
		System.out.println("15-3번 정답." + a);
	}
}
