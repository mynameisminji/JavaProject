package mj;

class Lab06 {

	public static void main(String[] args) {

		int x = 2;
		int y = 5;
		char c = 'A'; // 'A' 65

		System.out.println(1 + x << 33);
		System.out.println(y >= 5 || x < 0 && x > 2);
		System.out.println(y += 10 - x++); // Y = Y+ 10 - X++
		System.out.println(x += 2); // X = X + 2 , 위에 프린트 때문에 X의 값이 2가 아닌 3으로 변형됨.
		System.out.println(!('A' <= c && c <= 'Z'));
		System.out.println('C' - c);
		System.out.println('5' - '0');
		System.out.println(c + 1);
		System.out.println(++c);
		System.out.println(c++);
		System.out.println(c);

		// 3-2 번 문제.

		int numOfApples = 123; // 사과의 개수 //
		int sizeOfBucket = 10; // 바구니의 크기 바구니에 담을 수 있는 사과의 개수 // ( )
		int numOfBucket = (numOfApples / sizeOfBucket + 1); // /* (1) */ 모든 사과를 담는데 필요한 바구니의 수
		System.out.println(" :" + numOfBucket);

		// 3-3번 문제.

		int num = -1;
		String test;
		test = (num == 0) ? "0" : (num >= 0) ? "양수" : "음수";
		System.out.println(test);

		// [4-1] 다음의 문장들을 조건식으로 표현하라.
		// int 형 변수 x가 10보다 크고 20 보다 작으면 true.
		x = 15;
		if (x >= 10 && 10 <= 20)
			System.out.println(true);
		else
			System.out.println(false);

		// char 형변수 ch가 공백이나 탭이 아닐 때 인 조건식
		char ch = '0';
		if (ch != 0)
			System.out.println(true);

	}
}