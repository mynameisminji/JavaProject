package mj;

import java.util.Scanner;

public class SungJuk3 {

	public static void main(String[] args) {

		// 데이터 입력하기 위한 클래스를 import하기.
		// Scanner 클래스의 System.in이라는 동작을 실행하도록.

		String name;
		int korean;
		int english;
		int math;

		Scanner sc = new Scanner(System.in);
		System.out.println("*****점수프로그램에 오신 걸 환영합니다.******");
		System.out.print("이름을 알려주세요.");
		name = sc.nextLine();
		System.out.print("국어점수를 알려주세요.");
		korean = Integer.parseInt(sc.nextLine());
		// korean = sc.nextInt();로도 사용할 수 있음. 즉 korean자리에는 int타입만 쓸 수 있다는 것임.
		System.out.print("영어점수를 알려주세요.");
		english = Integer.parseInt(sc.nextLine());
		System.out.print("수학점수를 알려주세요.");
		math = Integer.parseInt(sc.nextLine());
		sc.close();

		int total = (korean + english + math);
		int avg = total / 3;
		String grade = (avg >= 90) ? "참 잘했어용" : (avg >= 80) ? "그냥 그저 그렇네요." : (avg >= 70) ? "노력 해요." : "당신은 재수강 F";

		System.out
				.println(name + "님의 결과를 알려 드리겠습니다. \n총 합점은 " + total + " \n평균 점수는 " + avg + "\n당신의 결과는... \n" + grade);

	}

}
