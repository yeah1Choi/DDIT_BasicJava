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
	private char[][] histo; // 여기서 멤버변수로 만들어 다른 블록에도 호출가능하도록함

	public ArrayConversion() {
		for (int i = 0; i < 50; i++) { // 난수 만듬
			// Math.random 보다 random.nextInt() 이런식으로 쓰는게 안정성있음
			// random 클래스의 nextInt() : 정수형 난수 하나 발생
			// nextInt(n) : 0 ~ (n-1) 사이의 정수형 난수 1개 발생
			int rnd = random.nextInt(6) + 1; // 1~6까지의 난수 발생
			dice[rnd - 1]++; // 발행된 횟수(-1 것은 인덱스는 0에서 시작)에서 +1씩 해야함
		}
	}

	public void histogram() { // 옆으로 횟수에 따른 그래프 만듬
		for (int i = 0; i < dice.length; i++) { // 1~6 번째
			System.out.print((i + 1) + "|");
			for (int j = 0; j < dice[i]; j++) { // dice의 수치의 갯수만큼 *을 인쇄
				System.out.print("*");
			}
			System.out.println(dice[i]);
		}
	}

	public int getMaxNum() { // 옆으로 누워있는 그래프를 세로로 세우기 위해 최대값을 행으로 주어야 해서 구한다
		int rowCount = dice[0]; // 임시최대값(행의 수)
		for (int i = 1; i < dice.length; i++) {
			if (rowCount < dice[i]) {
				rowCount = dice[i]; // 비교하면서 값을 교체하면서 제일 큰값을 갖게 만든다
			}
		}
		return rowCount;
	}

	public void conversion() { // 변환
		int r = getMaxNum(); // 행의 수

		// char[][] histo = new char[r][6]; // 2차원 배열변수가 지역변수가 됐으니 이것을 다른 블록에 호출해야한다
		histo = new char[r][6];

		for (int i = 0; i < dice.length; i++) { // 열 : dice.length: 1~6
			for (int j = 0; j < dice[i]; j++) { // 행 : dice[i] : 배열에 할당된 1~50 사이의 난수 값
				histo[j][i] = '*';
			}
		}
	}

	public void printHisto() {
		for (int i = histo.length - 1; i >= 0; i--) { 
			// histo.length : 행의 갯수, 인덱스이기때문에 -1을 함
			// i >= 0; i--  : 위로 올라가는게 아닌 최대를 찍고 아래로 하나씩 출력해야함
			System.out.print("|");
			for (int j = 0; j < histo[i].length; j++) {
				//histo[i].length : 각 배열에 들어간 
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