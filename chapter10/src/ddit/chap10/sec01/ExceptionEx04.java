package ddit.chap10.sec01;

// 사용자 예외 클래스 생성
// 사용형식
// 접근지정자 class 예외클래스명 extends Exception|RuntimeException {
//		예외클래스명(String message){ // 예외원인을 출력
//			super(message);
// 		}
// }
// ** 예외클래스 호출
// throw 예외클래스 객체명      (ex) throw new Exception();
public class ExceptionEx04 {
	public static void main(String[] args) throws RuntimeException {
		try {
			exceptionSample("genious");
			exceptionSample("fool");
		} catch(MyException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램종료"); // 이 문을 실행하기 위한 예외처리
	}

	public static void exceptionSample(String nickName) throws MyException{
		if ("fool".equals(nickName)) {
			throw new MyException("사용자정의 예외");
		}
		System.out.println("별명은 " + nickName + "입니다...");
	}
}

// 사용자가 정의한 클래스
class MyException extends RuntimeException {
	MyException(String msg) {
		super(msg);
	}
}
