package mj;

import java.util.Scanner;

public class Lab01 {
	public static void main(String[] args) {

		System.out.println("*   *   **    ****    ****   *     *    ///////   ");
		System.out.println("*   *  *  *   *   *   *   *   *   *     | o o |   ");
		System.out.println("***** *    *  *****   *****     *      (|     |)  ");
		System.out.println("*   * ******  *    *  *    *    *       | [_] |   ");
		System.out.println("*   * *    *  *     * *     *   *        _____    ");

		System.out.println("                +---+");
		System.out.println("                |   |");
		System.out.println("            +---+---+");
		System.out.println("            |   |   |");
		System.out.println("        +---+---+---+        /\\_/\\      -----  ");
		System.out.println("        |   |   |   |       ( ' ' )   / Hello \\  ");
		System.out.println("    +---+---+---+---+       (  -  )  <  Junior | ");
		System.out.println("    |   |   |   |   |        | | |    \\ Coder!/  ");
		System.out.println("+---+---+---+---+---+       (__|__)     -----    ");

		/*
		 * [2-2] 주민등록번호를 숫자로 저장하고자 한다 이 값을 저장하기 위해서는 어떤 자료형을 선택해야 할까 라는 이름의 변수를 선언하고 자신의
		 * 주민등록번호로 (data type) ? regNo 초기화 하는 한 줄의 코드를 적으시오.
		 */

		long birthdate = 930715L;
		long rgtnumber = 12345656L;

		System.out.println("당신의 주민등록 번호는 " + birthdate + " - " + rgtnumber);

		/*
		 * [2-5] 다음 문장들의 출력결과를 적으세요 오류가 있는 문장의 경우 괄호 안에 오 . , ‘ 류 라고 적으시오 ’ .
		 */

		// 오류 System.out.println(“1” + “2”);
		// 오류 System.out.println(true + “”) ;
		// 오류 System.out.println(‘A' + 'B');
		System.out.println("1" + 2);
		System.out.println('1' + '2');
		// 오류 System.out.println('J' + “ava”) ;
		// 오류 System.out.println(true + null);

		System.out.println(1 + '3');

		// 변수 / 상수 이름
		// 변수는 일반적으로 소문자. 만일 이름 두단어로 구성하는 경우 카멜표기법.
		long juminCode;
		String sayHello;

		// 상수는 모두 대문자로 작성
		// 두 단어 이상인 경우에는 _ 로 이어주기
		final double PI = 3.14;
		final int THIS_YEAR = 2017;
		final String USER_ID = "ZZZTZ";

		// JDK7부터 도입된 자릿수 표시 : _
		juminCode = 1_234_234_234_234L;

		System.out.println(juminCode);

		// 문자와 숫자 간 변환

		char cha = '민';
		System.out.println((int) cha);
		System.out.println((int) '1');

		String myname = "민지";
		// System.out.println(myname + " = " + (int) myname);
		// string은 int로 캐스팅이 안된다...
		System.out.println((int) myname.charAt(0));
		// myname이라는 변수의 값인 '민지'라는 문자열 첫 번째를 뽑아내려는 함수인
		// charAt()이라는 메소드를 사용하면 가능하다.

		int cha1 = 10000000;
		System.out.println((char) cha1);

		// 특수문자 표현 - escape sequence
		System.out.println("가\t\t나"); // 탭문자는 8번 띄워쓰기임
		System.out.println("가\n나"); // 줄바꿈 특수문자임.
		System.out.println("가\"나"); // 큰 따움표 문자.
		System.out.println("가\'나"); // 작은 따움표

		System.out.println('A' + 'B' + 'C');
		// + 연산자를 쓰게 되면 int로 캐스팅 되어 출력됨.

		System.out.println((int) 'A');
		System.out.println((int) 'B');
		System.out.println((int) 'C');

		int jumin = 123123;
		String id = "qkralswl27";
		String passwd = "alswl";
		String name = "민지";
		int age = 25;

		System.out
				.println("당신의 아이디는 " + id + " 입니다. " + "\n당신의 이름은 " + name + " 입니다. " + "\n당신의 나이는 " + age + "살 입니다.");

		// 서식화된 출력 - printf
		System.out.printf("아이디 : %s \n비밀번호 : %s \n이름 : %s \n나이 : %d", id, passwd, name, age);

		String fmt = "아이디 : %s \n비밀번호 : %s \n이름 : %s \n나이 : %d";
		System.out.printf(fmt, id, passwd, name, age);

		// %s는 스티링 타입의 데이터를 넣는다. %d는 인트형 타입의 데이터를 넣는다는 뜻.

		// double vs float : 오차범위 주의
		float avg1 = 296 / 3.0f;
		double avg2 = 296 / 3.0;
		System.out.println((int) avg1);
		System.out.println(avg2);

		// 키보드로 문자 입력받기.
		// 외부기능인 함수?를 컴파일에게 사용하도록 알리는 것이 import를 사용함.
		// Scanner라는 클래스를 import로 불러와서 사용하게 됨.
		// scanner라는 클래스의 변수 이름은 sc 이며 Scanner라는 객체 생성됨.

		Scanner sc = new Scanner(System.in);
		System.out.print("아이디를 입력하세요.");
		id = sc.nextLine();
		System.out.print("비번을 입력하세요.");
		passwd = sc.nextLine();
		System.out.print("이름을 입력하세요.");
		name = sc.nextLine();
		// .뒤에 메서드가 들어갈 수 있는 것임.즉 값의 규칙을 지정하기 위해 사용됨.
		// 여기서 nextLine은 하나의 단어만 넣어야 하는 규칙을 메소드를 통해 선언!
		System.out.print("나이를 입력하세요.");
		age = Integer.parseInt(sc.nextLine());

		System.out.printf(fmt, id, passwd, name, age);

	}
}
