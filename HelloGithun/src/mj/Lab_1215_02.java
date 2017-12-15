package mj;

import java.util.Scanner;

public class Lab_1215_02 {

	public static void main(String[] args) {
		// 31. 임의의 숫자 6자리를 입력하면 신용카드의 종류와 은행정보를 출력하는 프로그램을 작성해보자.

		Scanner sc = new Scanner(System.in);

		System.out.println("카드 번호 6자리를 입력해부세요.");
		String account = sc.nextLine();

		char account1 = account.charAt(0);
		char account2 = account.charAt(1);

		String cardty = "카드 정보 없음.";

		if (account1 == '4')
			cardty = "비자카드";

		else if (account1 == '5')
			cardty = "마스터카드";

		else if (account1 == '3' && account2 == '5')
			cardty = "JCB카드";

		// 은행정보 판별
		String bank = "은행정보 없뜸요";
		switch (account) {

		case "356317":
			bank = "NH 농협카드";
			break;

		case "404825":
			bank = "비씨카드";
			break;

		case "515594":
			bank = "신한카드";
			break;

		case "356901":
			bank = "신한카드";
			break;

		case "438676":
			bank = "신한카드";
			break;

		case "524353":
			bank = "외한카드";
			break;

		}

		System.out.printf("당신의 계좌 정보는 %s, %s, %s", cardty, account, bank);
	}

}
