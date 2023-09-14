package ddit.chap05.sec07;

import java.util.Random;

public class ArrayConversionEx {

	public static void main(String[] args) {
		ArrayConversion ac = new ArrayConversion();
		ac.histogram();
		System.out.println();
		ac.conversion();
		ac.printHisto();
	}

}

class ArrayConversion {
	private int[] dice = new int[6];
	private Random random = new Random();
	private char[][] histo; // ���⼭ ��������� ����� �ٸ� ��Ͽ��� ȣ�Ⱑ���ϵ�����

	public ArrayConversion() {
		for (int i = 0; i < 50; i++) { // ���� ����
			// Math.random ���� random.nextInt() �̷������� ���°� ����������
			// random Ŭ������ nextInt() : ������ ���� �ϳ� �߻�
			// nextInt(n) : 0 ~ (n-1) ������ ������ ���� 1�� �߻�
			int rnd = random.nextInt(6) + 1; // 1~6������ ���� �߻�
			dice[rnd - 1]++; // ����� Ƚ��(-1 ���� �ε����� 0���� ����)���� +1�� �ؾ���
		}
	}

	public void histogram() { // ������ Ƚ���� ���� �׷��� ����
		for (int i = 0; i < dice.length; i++) { // 1~6 ��°
			System.out.print((i + 1) + "|");
			for (int j = 0; j < dice[i]; j++) { // dice�� ��ġ�� ������ŭ *�� �μ�
				System.out.print("*");
			}
			System.out.println(dice[i]);
		}
	}

	public int getMaxNum() { // ������ �����ִ� �׷����� ���η� ����� ���� �ִ밪�� ������ �־�� �ؼ� ���Ѵ�
		int rowCount = dice[0]; // �ӽ��ִ밪(���� ��)
		for (int i = 1; i < dice.length; i++) {
			if (rowCount < dice[i]) {
				rowCount = dice[i]; // ���ϸ鼭 ���� ��ü�ϸ鼭 ���� ū���� ���� �����
			}
		}
		return rowCount;
	}

	public void conversion() { // ��ȯ
		int r = getMaxNum(); // ���� ��

		// char[][] histo = new char[r][6]; // 2���� �迭������ ���������� ������ �̰��� �ٸ� ��Ͽ� ȣ���ؾ��Ѵ�
		histo = new char[r][6];

		for (int i = 0; i < dice.length; i++) { // �� : dice.length: 1~6
			for (int j = 0; j < dice[i]; j++) { // �� : dice[i] : �迭�� �Ҵ�� 1~50 ������ ���� ��
				histo[j][i] = '*';
			}
		}
	}

	public void printHisto() {
		for (int i = histo.length - 1; i >= 0; i--) { 
			// histo.length : ���� ����, �ε����̱⶧���� -1�� ��
			// i >= 0; i--  : ���� �ö󰡴°� �ƴ� �ִ븦 ��� �Ʒ��� �ϳ��� ����ؾ���
			System.out.print("|");
			for (int j = 0; j < histo[i].length; j++) {
				//histo[i].length : �� �迭�� �� 
				System.out.printf("%5c", histo[i][j]);
			}
			System.out.println();
		}
		System.out.println("----------------------------------------");
		System.out.print(" ");
		for (int k = 1; k <= 6; k++) {
			System.out.printf("%5d", k);
		}
	}
}