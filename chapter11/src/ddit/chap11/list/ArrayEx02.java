package ddit.chap11.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayEx02 {

	public static void main(String[] args) {
		ArrayList<Employees> list = new ArrayList<Employees>();
		// Employees ��ü�� ����
		// �迭�� �޸� ������ ũ���� ������ ����

		list.add(new Employees("10101", "ȫ�浿", 15000));
		list.add(new Employees("20222", "ȫ����", 25000));
		list.add(new Employees("10365", "��ȫ��", 35000));
		list.add(new Employees("10409", "��ȫ��", 40000));

		// for�� ���
//		for (Employees emp : list) {
//			System.out.println(emp.eid + ", " + emp.name + ", " + emp.salary);
//		}

		// while�� ���
		Iterator<Employees> iter = list.iterator();
		// Iterator : �ݺ��� / iterator�� ��ȯ�Ǵ� ���� Object Ÿ��
		while (iter.hasNext()) { // hasNext �޼ҵ� : �ڷ� ���� ���θ� Ȯ��
			Employees emp = iter.next(); // next �޼ҵ� : �ڷ� ������ �޼ҵ�
			// System.out.println(emp.eid + " " + emp.name + " " + emp.salary);
			if(emp.eid.equals("10101")) {
				System.out.println(emp.eid + " " + emp.name + " " + emp.salary);
			}
		}
	}

}
