package ddit.chap05.sec01;

import java.util.Scanner;

public class ArrayEx04 {

	public static void main(String[] args) {
		// 키보드로 1000원단위의 돈을 입력받아그 액수만큼의 로또번호를 출력하시오

		int[] lotto = new int[45];
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1; // 로또의 시작은 배열처럼 0이 아니기 때문에
		}
		shuffle(lotto);
		Scanner sc = new Scanner(System.in);
		System.out.print("구입액수(1000) : ");
		int money = sc.nextInt();

		getLottoNumber(lotto, money);
	}

	public static void shuffle(int[] lotto) {
		for (int i = 0; i < 100000000; i++) {
			int rnd = (int) (Math.random() * lotto.length);
			int temp = lotto[0]; // 배열은 값이 바뀌면 원래 값이 사라지는 성질이 있음 배열 0을 temp 변수라는 임시저장을 함
			lotto[0] = lotto[rnd]; // 임의의 배열이 그 0번에 들어감
			lotto[rnd] = temp; // 임의의 배열이 옮겨가 그 자리가 비었으니 거기에 배열 0이 저장된 temp 변수가 와서 0이 됨
		}
	}

	public static void getLottoNumber(int[] lotto, int money) {
		for (int i = 0; i < money / 1000; i++) { // 줄바꿈
			shuffle(lotto); // 셔플로 바꿈
			System.out.print((i + 1) * 1000 + "원 : [");
			for (int j = 0; j < 6; j++) { // 6개의 숫자를 출력하기 위해
				System.out.printf("%3d", lotto[j]);
			}
			System.out.println(" ]");
		}
	}	
}
