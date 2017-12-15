package mj;

public class SungJuk2 {

	public static void main(String[] args) {

		// 변수선언
		// 성적처리
		// 결과출력

		// 1. 변수 선언
		// 파란색은 클래스, 주황색은 변수 이름
		String name;
		int korean;
		int english;
		int math;
		int total;
		double average;
		String grade;

		// 2. 데이터 입력 - 입력자료는 하드코등이 있음. (이미 지정된 데이터가 있다는 것)

		name = "민지";
		korean = 90;
		english = 80;
		math = 88;
		total = (korean + english + math);
		average = (double) total / 3;
		grade = (average >= 90) ? "참 잘했어요"
				: (average >= 80) ? "잘 했어요" : (average >= 70) ? "보통이에요" : (average >= 60) ? "노력하세요" : "탈락입니다.";

		// 3. 결과 출력
		String result = "이름 : %s, 국어: %d, 영어: %d, 수학: %d";

		System.out.printf(result, name, korean, english, math, total, average);

	}

}
