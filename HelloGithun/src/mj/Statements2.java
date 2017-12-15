package mj;

public class Statements2 {

	public static void main(String[] args) {

		// 애매모한 if 문
		String grds = "";
		int avg = 96;

		if (avg >= 90) {
			if (avg >= 96)
				grds = "A+";
		} else
			grds = "A0 또는 A-";

		System.out.println(grds);

		// switch : 연산식의 결과값에 따라 분기
		// 연산식 결과값 유형은
		// 정수, 문자열, 열거형 중 하나이어야 함.
		// switch (연산식) {
		// case 값 1 : 실행할 코드,; break;
		// case 값 2 : 실행할 코드,; break;
		// case 값 3 : 실행할 코드,; break;
		// case 값 4 : 실행할 코드,; break;
		// default : 실행할코드 ; break;

		int userLevel = 1;
		switch (userLevel) {
		case 1:
			System.out.println("관리자");
			break;
		case 2:
			System.out.println("사용자");
			break;
		case 3:
			System.out.println("매니저");
			break;
		default:
			System.out.println("비회원");
			break;
		}

		// JDK 5버전부터 SWITCH 문에 문자도 가능.
		String key = "research";
		switch (key) {
		case "CREATE":
		case "create":
			System.out.println("데이터 생성");
			break;
		case "RESEARCH":
		case "research":
			System.out.println("데이터 조회");
			break;
		case "EDIT":
		case "edit":
			System.out.println("데이터 수정");
			break;
		case "DELETE":
		case "delete":
			System.out.println("데이터 삭제");
			break;
		default:
			System.out.println("다시 한번 입력하세요.");
			break;

		}
		// 학점계산
		char grd;
		avg = 80;
		switch ((int) avg / 10) {
		case 10:
		case 9:
			grd = '수';
			break;
		case 8:
			grd = '우';
			break;
		case 7:
			grd = '미';
			break;
		case 6:
			grd = '양';
			break;
		default:
			grd = '가';
			break;

		}
		System.out.println(grd);

		// 난수 생성 - 로또 생성기.
		double lucky = Math.random();
		System.out.println(lucky);
		System.out.println((int) (lucky * 10));
		System.out.println((((int) (lucky * 100)) + 1) / 2); // 이 문장에서는 1~50까지 나옴.
	}
}