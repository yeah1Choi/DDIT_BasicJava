package ddit.chap05.sec03;

import java.util.Scanner;

public class WordScramble {
	private String[] word = { "apple", "banana", "orange", "persimmon", "strawberry" };

	// word 배열 중 임의의 단어 선택 0~4(5개) 사이의 난수 발생
	public String getWord() {
		int rnd = (int) (Math.random() * word.length); // word.length : 0부터 시작될 갯수를 정확히 주기 위해
		return word[rnd]; // 받은 값을 내가 다시 받기 위해 리턴사용
	}

	public String shuffle(String str) {
		char[] ch = str.toCharArray(); // toCharArray : 받은 문자열을 쪼개어 배열로 만들어줌
		for (int i = 0; i < 1000; i++) {
			int rnd = (int) (Math.random() * ch.length); // 각 단어길이가 다르기 때문에 ch.length
			char temp = ch[0]; // 교체되기 전 데이터의 삭제를 막기 위한 변수 temp 저장소
			ch[0] = ch[rnd];
			ch[rnd] = temp;
		}
		return new String(ch); // ch 문자배열을 문자열로 바꿔 돌려줌
	}

	public void answer(String str) {
		int count = 0; // 시도횟수
		Scanner sc = new Scanner(System.in);
		String anStr = "";

		while (true) { // 맞출때까지 무한루프
			System.out.print("정답 : ");
			anStr = sc.nextLine();
			count++; // 틀릴때마다 시도횟수를 +1씩
			if (str.equalsIgnoreCase(anStr)) { // equalsIgnoreCase 대문자 소문자 무시하고 값이 같다 / == 안쓰는 것은 주소값 비교를 하기 떄문에
				System.out.println("*************************");
				System.out.println("정답입니다");
				System.out.println("시도횟수 : " + count);
				System.out.println("*************************");
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}
