package ddit.chap11.stringclass;

public class StringEx {

	public static void main(String[] args) {
		// String 클래스 : 불변(immutable)의 문자열 자료 취급
		// 1. 부분문자열 추출 - substring(int startindex, int endindex)
		String str = "무궁화 꽃이 피었습니다.";
		System.out.println(str.substring(0, str.length() - 1)); // R: 무궁화 꽃이 피었습니다
		System.out.println(str.substring(0, 5)); // R: 무궁화 꽃
		System.out.println(str.substring(0, 6)); // R: 무궁화 꽃이

		// 기본타입 => 문자열
		// 1) String.valueOf(기본 타입 데이터);
		// 2) 기본 타입 데이터 + ""
		int num = 1001;
		String numStr = String.valueOf(num);
		System.out.println(numStr + 99);
		// 만약 정수였다면 연산이 되었겠지만 numStr이 문자열로 변환했기에 R: 100199
		System.out.println(num + "" + 99); // 문자타입이 먼저라서 99또한 문자열로 변환

		// 문자열 => 기본타입
		// Wrapper.parse 기본타입(문자열)
		String flag1 = "true";
		boolean flag = Boolean.parseBoolean(flag1);
		System.out.println(!flag);
	}

}
