package ddit.chap11.map;

import java.util.HashMap;
import java.util.Map.Entry;

// 학번(정수), 이름(문자열) 자료를 저장하는 맵
public class HashMapEx {

	public static void main(String[] args) {
		mapMethod01();
	}

	public static void mapMethod01() {
		HashMap<Integer, String> map = new HashMap<Integer, String>();

		// 자료 저장 - put(k,v) 메소드
		map.put(1001, "홍길동");
		map.put(1101, "정몽주");
		map.put(2011, "이성계");
		map.put(1903, "임현우");

		// map 전체 자료를 출력
		System.out.println(map); // R: {1001=홍길동, 2011=이성계, 1101=정몽주, 1903=임현우}

		// Key값으로 Value추출 - get(key)
		System.out.println(map.get(2011)); // R: 이성계

		// Entry 객체를 이용하여 순차검색 : 보통 for문사용
		// getKey, getValue 메소드를 이용해서 키와 밸류의 값을 따로 추출해 꺼낼 수 있음
		System.out.println(" 학번        이름");
		System.out.println("------------");
		for (Entry<Integer, String> entrySet : map.entrySet()) {
			// System.out.println(entrySet.getKey() + " " +entrySet.getValue());
			if (entrySet.getKey() == 1101) {
				System.out.println("이름 : " + entrySet.getValue()); // R: 이름 : 정몽주
			}
		}

		// map의 keySet()을 이용한 검색
		// 키로만 이루어진 셑을 만들어서 키를 호출하면 밸류를 하나씩 꺼내게 만들었다
		for (Integer i : map.keySet()) { 
			System.out.println(i + " -> " + map.get(i));
		}
	}
}
