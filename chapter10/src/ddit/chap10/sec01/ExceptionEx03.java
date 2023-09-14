package ddit.chap10.sec01;

public class ExceptionEx03 {

	public static void main(String[] args) {
		ExceptionEx03 ex03 = new ExceptionEx03(); // static 사용을 안하려고
		try { // 예외를 미룬 메소드에서 정의함, 모든 예외클래스를 정의해야하며 범위를 좁힐 수 없다
			ex03.sample();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
// 수익자부담원칙
	public void sample() throws Exception {
		// throws : sample() 메소드를 호출하는 곳에서 try-catch 처리를 해야함
		Person p1 = null;

		System.out.println("[회원정보]");
		System.out.println(p1.toString());
	}

}

class Person {
	int age;
	String name;

	Person(int age, String name) {
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "이름 : " + name + "/n나이 : " + age;
	}
}