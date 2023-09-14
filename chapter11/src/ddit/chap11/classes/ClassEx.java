package ddit.chap11.classes;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import ddit.chap11.object.ObjectEx02;

public class ClassEx {

	public static void main(String[] args) {
		Class c1 = ObjectEx02.class;
		Class c2 = Class.forName("ddit.chap07.sec03.Book");

		// 클래스명(패키지포함된) 반환 메소드 - getName()
		System.out.println(c1.getName()); // R: ddit.chap11.object.ObjectEx02

		// 단순 클래스명 반환 메소드 - getSimpleName()
		System.out.println(c1.getSimpleName()); // R: ObjectEx02

		// 패키지명 반환 메소드 - getPackage()
		System.out.println(c1.getPackage()); // R: package ddit.chap11.object

		// 생성자메소드 정보 반환 메소드 - getConstructors()
		// : Constructor 클래스 타입의 배열로 반환된다
		Constructor[] constructors = c2.getConstructors();

		for (Constructor c : constructors) {
			System.out.println("생성자 : " + c);
		}
		
		Field[] fields = c2.getFields(); // public 필드만 반환
		Field[] fieldInher = c2.getDeclaredFields(); // 상속받은 필드만 반환
		
		for (Method m:methods) {
			System.out.println("메서드 : " + m);
		}
		
		for(Field f:fields) {
			System.out.println("필드명 : "+f.getName());
			System.out.println("필드");
		}

	}

}
