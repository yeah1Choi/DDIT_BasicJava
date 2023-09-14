package ddit.chap10.sec01;

public class ExceptionEx03 {

	public static void main(String[] args) {
		ExceptionEx03 ex03 = new ExceptionEx03(); // static ����� ���Ϸ���
		try { // ���ܸ� �̷� �޼ҵ忡�� ������, ��� ����Ŭ������ �����ؾ��ϸ� ������ ���� �� ����
			ex03.sample();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
// �����ںδ��Ģ
	public void sample() throws Exception {
		// throws : sample() �޼ҵ带 ȣ���ϴ� ������ try-catch ó���� �ؾ���
		Person p1 = null;

		System.out.println("[ȸ������]");
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
		return "�̸� : " + name + "/n���� : " + age;
	}
}