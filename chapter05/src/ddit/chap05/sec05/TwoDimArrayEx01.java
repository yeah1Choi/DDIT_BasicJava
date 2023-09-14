package ddit.chap05.sec05;

// 5���� 3���� ������ ������ ����. �̸� �迭�� �����ϰ� ����Ͻÿ�
// [������]
/* ����    ����    ����
 *  75   80   65
 *  95   85   85
 *  65   85   85
 *  90   60   85
 *  95   90   95
 */

public class TwoDimArrayEx01 {

	static int[][] score;
	static String[] name;

	// static(�� ���� ����� ���� �޼ҵ��� static�� �Ȱ��� �� ���Ž����� �����ش�)

	public static void main(String[] args) {
		twoDimMethod01();
		printScore();
		sortdata();
	}

	public static void twoDimMethod01() {
		score = new int[][] { { 75, 80, 65, 0, 0, 1 }, 
			                  { 95, 85, 85, 0, 0, 1 }, 
			                  { 65, 85, 85, 0, 0, 1 },
			                  { 90, 60, 85, 0, 0, 1 }, 
			                  { 95, 90, 95, 0, 0, 1 } };
		// �հ�� ��� �̷��� ���ο� ���� �־��ַ��� �ϴ� 0�� �����Ϳ� �־ ������
		// �迭�� ĭ�� ���� �� �ִ�
		// ����� ���� �־��ַ��µ� ������� 0���� ��� �⺻���� 1�� �־���
		name = new String[] { "������", "�󸶹�", "�����", "��īŸ", "���ϰ�" }; // ������ �迭
		for (int i = 0; i < score.length; i++) { // ��
			for (int j = 0; j < 3; j++) { // ��
				score[i][3] = score[i][3] + score[i][j];
			}
			score[i][4] = score[i][3] / 3;
		}
		getLank();
	}

	public static void printScore() {
		System.out.println("--------------------------------------");
		System.out.println("   �� ��        ����    ����    ����   ����     ���     ���");
		System.out.println("--------------------------------------");
		for (int i = 0; i < score.length; i++) { // ��
			System.out.printf("[%-3s]", name[i]);
			for (int j = 0; j < score[i].length; j++) { // ��
				System.out.printf("%5d", score[i][j]);
			}
			System.out.println();
		}
		System.out.println("--------------------------------------");
	}

	public static void getLank() {
		for (int i = 0; i < score.length; i++) { // ���ذ� ��ġ
			for (int j = 0; j < score.length; j++) { // �񱳰� ��ġ
				if (score[i][3] < score[j][3])
					score[i][5]++;
			}
		}
	}

	public static void sortdata() { // ū ��������� �ٽ� ����
		// bubble sort
		for (int i = 0; i < score.length - 1; i++) {
			for (int j = 0; j < score.length - 1 - i; j++) {
				if (score[j][3] < score[j + 1][3]) {
					String temp = name[j]; // ���� ���� �ڹٲ����
					name[j] = name[j + 1];
					name[j + 1] = temp;
					for (int k = 0; k < score.length; k++) {
						int t = score[j][k];
						score[j][k] = score[j + 1][k];
						score[j + 1][k] = t;
					}
				}
			}
		}
		System.out.println("\n\n\n");
		printScore();
	}
}
