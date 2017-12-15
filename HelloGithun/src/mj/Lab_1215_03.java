package mj;

import java.util.Scanner;

public class Lab_1215_03 {

	public static void main(String[] args) {
		// 32번.

		Scanner sc = new Scanner(System.in);
		System.out.println("당신의 주민등록번호를 입력해주세요.");

		String idNo = sc.nextLine();

		int idNumber = 0;
		int sum = 0;
		// idNo의 length는 8.
		// cha를 int로 바꾸어야함.
		for (int i = 0; i < idNo.length(); i++)
			idNumber = (idNo.charAt(i) - 48);

		// for (int j = 2; j < 10; j++) {

		// idNumber = Integer.parseInt(idNo.charAt(i));
		// idNumber = (idNo.charAt(j) - 48);
		// int answer = (idNumber) * j;
		// sum += answer;
		System.out.println(idNumber);
		// System.out.printf("%d ,", answer);

	}
	// System.out.println();
	// System.out.println(sum);

	// int answer2 = (11 - (sum % 11)) % 10;
	// if (answer2 == idNo.charAt(12) - 48)
	// System.out.println("주민번호 검증 성공");

	// System.out.println(answer2);
}//
