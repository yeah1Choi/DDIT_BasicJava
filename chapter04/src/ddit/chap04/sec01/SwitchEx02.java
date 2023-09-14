package ddit.chap04.sec01;

public class SwitchEx02 {

	public static void main(String[] args) {
		// 100~97 : A+
		// 96~93 : A0
		// 92~90 : A-
		// 89~87 : B+
		// 86~83 : B0
		// 82~80 : B-
		// 그 이하 : F

		int score = 92;
		String grade = "";

		switch (score / 10) {
		case 10:
			grade = "A+";
			break;
		case 9:
			grade = "A";
			switch (score % 10) {
			case 0:
			case 1:
			case 2:
				grade = grade + "-";
				break;
			case 3:
			case 4:
			case 5:
			case 6:
				grade = grade + "0";
			}
			break; // break는 자기가 속한 구간만을 벗어나기 때문에 case9에서 빠져나가기 위한 break가 존재해야한다
		case 8:
			grade = "B";
			switch (score % 10) {
			case 0:
			case 1:
			case 2:
				grade = grade + "-";
				break;
			case 3:
			case 4:
			case 5:
			case 6:
				grade = grade + "0";
				break;
			case 7:
			case 8:
			case 9:
				grade = grade + "+";
			}
			break;
		default:
			grade = "F";
		}
		System.out.println(score + "의 학점은 " + grade + "입니다");
	}

}
