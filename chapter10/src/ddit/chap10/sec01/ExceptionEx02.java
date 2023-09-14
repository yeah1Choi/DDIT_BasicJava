package ddit.chap10.sec01;

public class ExceptionEx02 {

	public static void main(String[] args) {
		exceptionMethod();

	}

	public static void exceptionMethod() {
		// 1/5 + 1/4 + 1/3 + 1/2 ... ?

		double sum = 0;
		try {
			for (int i = 5; i >= 0; i--) {
				sum = sum + (1 / i);
			}
			System.out.println("합 = " + sum);
		} catch(ArithmeticException e) {
			e.printStackTrace();
			// printStackTrace 메소드는 예외당시의 호출스택에 있던 메소드 정보와 결과를 화면출력
		} catch(Exception e) {
			System.out.println("예외발생");
			System.out.println(e.getMessage());
		} finally {
			System.out.println("예외처리 종료");
		}
	}
}
