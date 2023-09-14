package ddit.chap11.map;

import java.util.HashMap;
import java.util.Map.Entry;

// �й�(����), �̸�(���ڿ�) �ڷḦ �����ϴ� ��
public class HashMapEx {

	public static void main(String[] args) {
		mapMethod01();
	}

	public static void mapMethod01() {
		HashMap<Integer, String> map = new HashMap<Integer, String>();

		// �ڷ� ���� - put(k,v) �޼ҵ�
		map.put(1001, "ȫ�浿");
		map.put(1101, "������");
		map.put(2011, "�̼���");
		map.put(1903, "������");

		// map ��ü �ڷḦ ���
		System.out.println(map); // R: {1001=ȫ�浿, 2011=�̼���, 1101=������, 1903=������}

		// Key������ Value���� - get(key)
		System.out.println(map.get(2011)); // R: �̼���

		// Entry ��ü�� �̿��Ͽ� �����˻� : ���� for�����
		// getKey, getValue �޼ҵ带 �̿��ؼ� Ű�� ����� ���� ���� ������ ���� �� ����
		System.out.println(" �й�        �̸�");
		System.out.println("------------");
		for (Entry<Integer, String> entrySet : map.entrySet()) {
			// System.out.println(entrySet.getKey() + " " +entrySet.getValue());
			if (entrySet.getKey() == 1101) {
				System.out.println("�̸� : " + entrySet.getValue()); // R: �̸� : ������
			}
		}

		// map�� keySet()�� �̿��� �˻�
		// Ű�θ� �̷���� �V�� ���� Ű�� ȣ���ϸ� ����� �ϳ��� ������ �������
		for (Integer i : map.keySet()) { 
			System.out.println(i + " -> " + map.get(i));
		}
	}
}
