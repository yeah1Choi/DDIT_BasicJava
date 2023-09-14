package ddit.chap10.sec01;

public class ExceptionEx05 {

	public static void main(String[] arg) throws Exception { // 좋은 방법은 아님
		ExceptionEx05 ex05 = new ExceptionEx05();
//		try {
//			ex05.method01();
//		} catch(Exception e) {	
//		}
		ex05.method01();
	}

	public void method01() throws Exception {
		method02();
	}

	public void method02() throws Exception {
		method03();
	}

	public void method03() throws Exception {
		Class c1 = Class.forName("ddit.chap06.sec02.Circle");
	}
}
