package mj;

public class Operators {

	// main method 쓰기.
	public static void main(String[] args) {

		// 연산자란 컴퓨터 프로그램 특정 기능을 수행할 작업들의 모음 이다.

		// 산술연산자 : +, -, *, /, %
		int x = 10, y = 4;
		System.out.printf("10 + 4 = %d \n", x + y);
		System.out.printf("10 - 4 = %d \n", x - y);
		System.out.printf("10 * 4 = %d \n", x * y);
		System.out.printf("10 / 4 = %d \n", x / y);
		System.out.printf("10 %% 4 = %d \n", x % y);
		// %가 특수기호라서 두번 씀.

		// 비교연산자 : >,<,==,!=

		System.out.printf("10 > 4 = %b \n", x > y);
		System.out.printf("10 < 4 = %b \n", x < y);
		System.out.printf("10 == 4 = %b \n", x == y);
		System.out.printf("10 != 4 = %b \n", x != y);

		String a = "Hello";
		String b = "hello";
		String c = "HELLO";
		String d = "Hello";
		String e = new String("Hello");

		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println(a == d);
		System.out.printf("a == d = %b \n", a == b);
		System.out.println(a == e);
		System.out.printf("d.equals(e) = %b \n", e.equals(d));
		// string은 ==이라는 연산자를 쓰지 않고 문자열은 equals라는 메소드를 사용함.

		// 논리연산자 : &&, ||, !

		int i = 5;
		int j = 13;
		System.out.printf("(i > 4 || j < 10) = %b \n", i > 4 || j < 10);
		// || 는 또는 이라는 뜻이기 때문에 하나라도 true이면 boolean값에서 true.

		System.out.printf("(i > 4 && j < 14) = %b \n", i > 4 && j < 14);
		// &&는 그리고 라는 뜻이기 때문에 둘다 ture여야지 true가 성립됨.\
		// &&, || 등은 단축 논리연산이 지원됨.

		// 줄여쓰는 공식임.

		int z = x + y;

		z = z + x;
		z += x;

		z = z + y;
		z += y;

		// 증감 연산자, 감소 연산자.
		i = 5;
		j = 5;
		j = ++i;
		System.out.printf("j = ++i 의 값은 %d \n", j);

		// j++는 후치.
		i = 5;
		j = 5;
		j = i++;
		System.out.printf("j = i++ 의 값은 %d \n", j);

		// 삼항연산자 - ? :
		// (논리식) ? (참일때처리) : (거짓일때처리)
		double avg = 296 / 2.0;
		// char grd = (avg >= 90) ? '수' : '우';
		// grd = (avg >= 80) ? '우' : '미';
		char grd = (avg >= 90) ? '수' : (avg >= 80) ? '우' : (avg >= 70) ? '미' : (avg >= 60) ? '양' : '가';

		double avg1 = 400 / 5.0;
		char score = (avg1 >= 90) ? 'a'
				: (avg1 >= 80) ? 'b' : (avg1 >= 70) ? 'c' : (avg1 >= 60) ? 'd' : (avg1 >= 50) ? 'e' : 'F';

		System.out.println(grd);
		System.out.println(score);

		// 연산자 우선순위
		// 표현식의 계산순서를 결정.
		int k = 1, l = 2, m = 3;
		int n = k + l + m;
		int o = (k + l) * m;

		System.out.println(n + "," + o);

		// 형변환 - 캐스트.
		// ()를 붙여서 명시적으로 변환 가능.

		double average = (double) 296 / 3;
		System.out.printf("296/3 = %f \n", average);

		// 확대변환
		byte p = 100;
		byte q = 100;
		// 수식을 넣게 되면 프로그래밍 디폴트인 인트로 쓰임.
		// 그래서 불가. p = p + q;
		// p = (byte) (p + q);

		System.out.println(p);

		// 확대변환
		int s = p; // byte -> int.

		// 축소변환 - 데이터 소실의 위험성 감수
		p = (byte) s; // int -> byte
		s = 2;

		System.out.println(p);
	}
}
