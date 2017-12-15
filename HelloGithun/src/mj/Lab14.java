package mj;

public class Lab14 {

	public static void main(String[] args) {
		// 연습문제 4-4, 4-8, 4-13, 4-14, 4-15
		// [4-4] 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때 몇까지 더해야 총합이 100이상이 되는지 구해라.

		int sum = 0;

		for (int i = 0; i <= 1000; i++)
			if ((i % 2) != 0)
				// System.out.println(i);

				for (int j = -1; j >= -1000; --j)
					if ((j % 2) == 0)
					// System.out.println(j);
					{

						sum = (j + i);

						if (sum >= 100)
							break;
						System.out.printf("%d와 %d 일 때 %d가 되요\n", i, j, sum);
					}

	}
}
