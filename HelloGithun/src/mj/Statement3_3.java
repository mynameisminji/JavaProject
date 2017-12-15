package mj;

import java.util.Scanner;

public class Statement3_3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("작업할 코드를 입력하세요");
			System.out.println("c)reate : 회원 등록");
			System.out.println("r)ead : 회원 조회");
			System.out.println("u)pdate : 회원 수정");
			System.out.println("d)elete : 회원 삭제");
			System.out.println("q) : 나감");
			System.out.println(">>>>>>>>>>>>>>>>");

			String job = sc.nextLine();

			// q가 입력되면 while 문에서 나감.
			// if (job.equals("q"))
			// break;

			switch (job) {
			case "c":
				System.out.println("회원등록 메뉴를 선택");
				break;
			case "r":
				System.out.println("회원조회 메뉴를 선택");
				break;
			case "u":
				System.out.println("회원수정 메뉴를 선택");
				break;
			case "d":
				System.out.println("회원삭제 메뉴를 선택");
				break;
			case "q":
				System.exit(0);
				break;
			}
		}

	}

}
