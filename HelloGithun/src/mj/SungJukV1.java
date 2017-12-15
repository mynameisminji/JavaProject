package mj;

import java.util.Scanner;

public class SungJukV1 {

	/*
	 * 성적 처리프로그램 V1 간단한 성적처리를 수행하는 프로그램 입력 : 이름, 국어, 영어, 수학 처리 : 총점, 평균, 학점 결과 : 이름,
	 * 국어, 영어, 수학, 총점, 평균, 학점
	 */

	public static void main(String[] args) {

		String name;
		int korean;
		int english;
		int math;

		Scanner sc = new Scanner(System.in);

		System.out.print("이름을 입력하세요.");
		name = sc.nextLine();
		System.out.print("국어 성적을 입력하세요.");
		korean = Integer.parseInt(sc.nextLine());
		System.out.print("영어 성적을 입력하세요.");
		english = Integer.parseInt(sc.nextLine());
		System.out.print("수학 성적을 입력하세요.");
		math = Integer.parseInt(sc.nextLine());

		// 변수 선언 후 게산 식은 뒤에다가 해야함.
		int total = (korean + english + math);
		int avg = total / 3;
		String score = (avg >= 90) ? "참 잘했어요."
				: (avg >= 80) ? "잘했어용" : (avg >= 70) ? "노력해요" : (avg >= 60) ? "분발해요" : "다시 하세용";

		System.out
				.println(name + "님의 성적입니다. \n" + "총 점수 : " + total + ", " + "평균 점수 : " + avg + ", " + "학점 : " + score);
	}

}
