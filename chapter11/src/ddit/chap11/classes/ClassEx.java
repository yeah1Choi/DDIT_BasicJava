package ddit.chap11.classes;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import ddit.chap11.object.ObjectEx02;

public class ClassEx {

	public static void main(String[] args) {
		Class c1 = ObjectEx02.class;
		Class c2 = Class.forName("ddit.chap07.sec03.Book");

		// Ŭ������(��Ű�����Ե�) ��ȯ �޼ҵ� - getName()
		System.out.println(c1.getName()); // R: ddit.chap11.object.ObjectEx02

		// �ܼ� Ŭ������ ��ȯ �޼ҵ� - getSimpleName()
		System.out.println(c1.getSimpleName()); // R: ObjectEx02

		// ��Ű���� ��ȯ �޼ҵ� - getPackage()
		System.out.println(c1.getPackage()); // R: package ddit.chap11.object

		// �����ڸ޼ҵ� ���� ��ȯ �޼ҵ� - getConstructors()
		// : Constructor Ŭ���� Ÿ���� �迭�� ��ȯ�ȴ�
		Constructor[] constructors = c2.getConstructors();

		for (Constructor c : constructors) {
			System.out.println("������ : " + c);
		}
		
		Field[] fields = c2.getFields(); // public �ʵ常 ��ȯ
		Field[] fieldInher = c2.getDeclaredFields(); // ��ӹ��� �ʵ常 ��ȯ
		
		for (Method m:methods) {
			System.out.println("�޼��� : " + m);
		}
		
		for(Field f:fields) {
			System.out.println("�ʵ�� : "+f.getName());
			System.out.println("�ʵ�");
		}

	}

}
