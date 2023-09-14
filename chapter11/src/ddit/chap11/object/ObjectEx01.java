package ddit.chap11.object;

public class ObjectEx01 {

	public static void main(String[] args) {
		Person p1 = new Person("������");
		Person p2 = new Person("������");

		System.out.println("p1 = " + p1);// �ڿ� toString() ���� �Ǿ��ִٴ� ���� ������� ���ٴ� ���� ���� �� �� �մ�
		System.out.println("p2 = " + p2);
//		System.out.println("p1 = " + p1.toString());
//		System.out.println(p1.classInfo());
		if (p1 == p2) {
			System.out.println("���� ��ü");
		} else {
			System.out.println("�ٸ� ��ü");
		}

		if (p1.toString().equals(p2.toString())) {
			System.out.println("���� ����");
		} else {
			System.out.println("�ٸ� ����");
		}
	}
}

class Person {
	String name;

	Person(String name) {
		this.name = name;
	}

	public String classInfo() {
		return getClass().getName() + '@' + hashCode();
	}

	@Override
	public String toString() {
		return name;
	}
}