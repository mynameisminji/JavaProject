package mj;

public class Statements1 {

	public static void main(String[] args) {
		// 문장 - 무엇인가를 하라는 지시를 의미.
		// 문장이 모여 프로그램을 구성합니당.

		/*
		 * 01. 조건문 if if (조건식) { 참일 때 실행할 문장 } if (조건식) { 참일 때 실행할 문장} else { 거짓일 때 실행할
		 * 문장} else if (조건식 2 ) { 참일 때 실행할 문장 - 거짓이면 다음 조건으로 넘어감} else if (조건식 3 ) { 참일
		 * 때 실행할 문장 - 거짓이면 다음 조건으로 넘어감} else {위에 조건이 모두 거짓일 때}
		 */
		if (3 < 5) {

			System.out.println("3은 5보다 크다");

		}

		int tot = 98 + 99 + 99;
		if (tot >= 270) {

			System.out.println("수");

		}

		// 어떤수가 2의 배수인지 알아보자요.
		int x = 14;
		if (x % 2 != 1) {
			System.out.println("2의배수");
		} else {

			System.out.println("2의 배수가 아이다잉");

		}

		// 범위 검사
		x = 95;
		if (x <= 100 && x >= 90)
			;
		{
			System.out.println("수");
		}

		// 값 비교.

		String userid = "zzzyyy";
		String passwd = "98765";

		// if (userid == "zzzyyy" && passwd == "98765") {
		// 문자열이 같다라는 것을 == 기호로 입력한 것은 정확치가 않음. 즉 String 타입의 변수를 비교할 때는
		// .equals()라는 메소드를 사용해야합니당.

		if (userid.equals("zzzyyy") && passwd.equals("98765")) {

			System.out.println("로그인 성공");

		} else {

			System.out.println("로그인 실패");

		}

		String userid1 = "qkralswl27";
		String passwd1 = "alswl258";

		if (userid1.equals("qkralswl27")) {

			if (passwd1.equals("qlqjs258")) {
				System.out.println("로그인에 성공하셨습니다.");
			} else {
				System.out.println("아이디는 맞는데 패스워드가 잘못됐어요");
			}

		} else {
			System.out.println("아이디가 틀렸습니다.");

		}

		// 문자 입력 확인
		char ch = 'q';
		if (ch == 'q' || ch == 'Q') {
			System.out.println("프로그램 종료");
		}

		// 입력된 문자가 알파벳 소문자 여부 확인
		// if (ch == 'a' || ch == 'b' || ... || ch=='z') { } - 이건 너무 길어서 비효율적임.

		// ch의 값이 소문자가 아닐 경우에 출력이 됨.
		ch = 'A';
		if (!(ch >= 'a' && ch <= 'z')) {

			System.out.println("ch는 알파벳 소문자가 아니다.");
		}

		char ch1 = 'x';
		if (ch1 >= 'a' && ch1 <= 'z') {

			System.out.println("ch1은 알파벳 소문자이다.");
		}

		char ch2 = 'd';
		if (!(ch2 >= 0 && ch2 <= 9)) {
			System.out.println("ch2는 숫자만 넣어야합니다.");
		}

		double avg = (double) tot / 3;
		char grd;

		if (avg <= 100 && avg >= 90) {
			grd = '수';
		} else if (avg < 90 && avg >= 80)
			grd = '우';
		else if (avg < 80 && avg >= 70)
			grd = '미';
		else if (avg < 70 && avg >= 60)
			grd = '양';
		else
			grd = '가';

		System.out.println(grd);

	}
}
