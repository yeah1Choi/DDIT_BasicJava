package ddit.chap11.object;

import java.util.Arrays;

public class ObjectEx02 {

	public static void main(String[] args) {
		objectClone();

	}

	public static void objectClone() {
		// �ڱ⺹��
		int[] num1 = { 10, 20, 30, 40, 50 };
		int[] num2 = num1.clone();

		System.out.println("num1 = " + Arrays.toString(num1));
		System.out.println("num1 = " + Arrays.toString(num2));

		Student s1 = new Student("�̼���");
		// ��ü�� clone()�� ����ϱ� ���ؼ���
		// �ش簴ü�� �������� Cloneable �������̽� �����ʿ�,
		// clone()�� �������ؾ���
		Student s2 = (Student) s1.clone();

		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
	}
}

class Student implements Cloneable {
	String name;

	Student(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public Object clone() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (Exception e) {
			return obj;
		}
		return obj;
	}
}
