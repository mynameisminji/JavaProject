package mj;

public class Statements5 {

	public static void main(String[] args) {

		// 반복의 중단 - break
		int i = 1;
		int sum = 0;
		String fmt = "i : %d, sum : %d \n";

		while (true) {

			sum += i++;
			// sum = sum + i++ 이라는 뜻임.
			// sum = 0 + 1 - 1
			// sum = 1 + 2 - 3
			// sum = 3 + 3 - 6
			// ...

			if (sum > 100)
				break;
			System.out.printf(fmt, i, sum);
		}

		// 반복의 재시작 - continue
		i = 1;
		while (i <= 100) {
			++i;
			if (i % 2 != 0)
				continue; // i가 2의 배수가 아니라면 i를 프린트 하지 말고 다시 돌려라(continue의 역할!!)
			System.out.println(i);
		}
	}
}
