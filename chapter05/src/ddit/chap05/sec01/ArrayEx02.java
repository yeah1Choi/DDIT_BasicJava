package ddit.chap05.sec01;

import java.util.Arrays;

public class ArrayEx02 {

	public static void main(String[] args) {
		// 5명의 친구이름을 배열로 저장(name)하고 3번째 저장된 친구이름을 출력

		/*
		 * //1) String[] friends = null; name[0] = "예원"; name[1] = "예윤"; name[2] = "예진";
		 * name[3] = "현식"; name[4] = "메이"; System.out.println(friends[2]);
		 */
		/*
		 * //2) String[] friends = new String[] { "예원", "예윤", "예진", "현식", "메이" };
		 * System.out.println(friends[2]);
		 */
		// 3)
		String[] friends = { "예원", "예윤", "예진", "현식", "메이" };
		System.out.println(friends[2]);
	}
}
