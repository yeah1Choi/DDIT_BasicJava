package ddit.chap11.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayEx02 {

	public static void main(String[] args) {
		ArrayList<Employees> list = new ArrayList<Employees>();
		// Employees 객체만 들어간다
		// 배열과 달리 공간의 크기의 제한이 없다

		list.add(new Employees("10101", "홍길동", 15000));
		list.add(new Employees("20222", "홍동길", 25000));
		list.add(new Employees("10365", "길홍동", 35000));
		list.add(new Employees("10409", "동홍길", 40000));

		// for문 사용
//		for (Employees emp : list) {
//			System.out.println(emp.eid + ", " + emp.name + ", " + emp.salary);
//		}

		// while문 사용
		Iterator<Employees> iter = list.iterator();
		// Iterator : 반복자 / iterator로 반환되는 것은 Object 타입
		while (iter.hasNext()) { // hasNext 메소드 : 자료 존재 여부를 확인
			Employees emp = iter.next(); // next 메소드 : 자료 꺼내는 메소드
			// System.out.println(emp.eid + " " + emp.name + " " + emp.salary);
			if(emp.eid.equals("10101")) {
				System.out.println(emp.eid + " " + emp.name + " " + emp.salary);
			}
		}
	}

}
