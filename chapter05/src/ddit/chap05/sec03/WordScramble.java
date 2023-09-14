package ddit.chap05.sec03;

import java.util.Scanner;

public class WordScramble {
	private String[] word = { "apple", "banana", "orange", "persimmon", "strawberry" };

	// word �迭 �� ������ �ܾ� ���� 0~4(5��) ������ ���� �߻�
	public String getWord() {
		int rnd = (int) (Math.random() * word.length); // word.length : 0���� ���۵� ������ ��Ȯ�� �ֱ� ����
		return word[rnd]; // ���� ���� ���� �ٽ� �ޱ� ���� ���ϻ��
	}

	public String shuffle(String str) {
		char[] ch = str.toCharArray(); // toCharArray : ���� ���ڿ��� �ɰ��� �迭�� �������
		for (int i = 0; i < 1000; i++) {
			int rnd = (int) (Math.random() * ch.length); // �� �ܾ���̰� �ٸ��� ������ ch.length
			char temp = ch[0]; // ��ü�Ǳ� �� �������� ������ ���� ���� ���� temp �����
			ch[0] = ch[rnd];
			ch[rnd] = temp;
		}
		return new String(ch); // ch ���ڹ迭�� ���ڿ��� �ٲ� ������
	}

	public void answer(String str) {
		int count = 0; // �õ�Ƚ��
		Scanner sc = new Scanner(System.in);
		String anStr = "";

		while (true) { // ���⶧���� ���ѷ���
			System.out.print("���� : ");
			anStr = sc.nextLine();
			count++; // Ʋ�������� �õ�Ƚ���� +1��
			if (str.equalsIgnoreCase(anStr)) { // equalsIgnoreCase �빮�� �ҹ��� �����ϰ� ���� ���� / == �Ⱦ��� ���� �ּҰ� �񱳸� �ϱ� ������
				System.out.println("*************************");
				System.out.println("�����Դϴ�");
				System.out.println("�õ�Ƚ�� : " + count);
				System.out.println("*************************");
				break;
			}
		}
		System.out.println("���α׷� ����");
	}
}
