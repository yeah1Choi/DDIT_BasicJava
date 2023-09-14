package ddit.chap06.sec06;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FinalEx {

	public static void main(String[] args) {
		Final f1 = new Final("학교주변");
		System.out.println(f1.loc + "에서 허용된 속도 : " + f1);

		Final f2 = new Final("시내");
		System.out.println(f1.loc + "에서 허용된 속도 : " + f2);

		Final f3 = new Final("시외");
		System.out.println(f1.loc + "에서 허용된 속도 : " + f3);

		LocalDate now = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
		// 정적메소드는 class이름.메소드 / ofPattern()는 정적메소드 : 형식지정문자열출력
		String formatNow = now.format(formatter);
		System.out.println(now);
		System.out.println(formatNow);
	}

}

class Final {
	final int SCHOOL_ZONE_SPEED = 30;
	final int DOWN_TOWN_SPEED = 50;
	final int COUNTRY_SIDE_SPEED = 70;
	// 상수값은 보통 다른 실수와 문자를 구분하기 위해 대문자와 _를 사용
	// 상수를 초기화했기에 식의 오른쪽에만 올 수 있다
	String loc;

	Final(String loc) {
		this.loc = loc;
	}

	@Override
	public String toString() {
		int speed = 0;
		if (loc.equals("학교주변")) {
			speed = SCHOOL_ZONE_SPEED;
		} else if (loc.equals("시내")) {
			speed = DOWN_TOWN_SPEED;
		} else if (loc.equals("시외")) {
			speed = COUNTRY_SIDE_SPEED;
		}
		return speed + "km/h"; // return 문 문자열 반환
	}

}