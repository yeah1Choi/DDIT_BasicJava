package ddit.chap11.list;

import java.util.ArrayList;

public class ArrayListEx {
	ArrayList list = new ArrayList();

	public static void main(String[] args) {
		ArrayListEx arrayList = new ArrayListEx();
		arrayList.addDate();
	}

	public void addDate() {
		list.add(100);
		list.add("ȫ���");
		list.add(false);
		list.add(12.5);

		// System.out.println(list);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}// size() : �������� �� ��ȯ �޼ҵ�
	}
}