package ddit.chap04.sec02;

public class ForEx01 {

	public static void main(String[] args) {

		// forMethod01();
		// forMethod02();
		// forMethod03();
		forMethod04();

	}

	public static void forMethod01() {
		// 1~10 사이의 수를 붙여서 출력
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%-3d", i);

		}
	}

	public static void forMethod02() {
		// 알파벳 A ~ Z 까지 한줄에 출력하시오

		// for문은 문자열이 들어와도됨
		// for (char ch = 'A'; ch <= 'Z'; ch++) {
		for (int ch = 'A'; ch <= 'Z'; ch++) {
			// 정수형 타입의 변수를 주어도 가능, 조건식을 수행하기 전 'Z'를 정수로 형변환이 일어남
			System.out.printf("%2c", ch);
		}
	}

	public static void forMethod03() {
		// 0 ~ 50 사이의 fibonacci number 피보나치 수열 값을 구하시오
		// 피보나치 수열 : 첫번째와 두번쩨 수가 1로 주어지고
		// 세번째 수부터 전 두수의 합이 현재 수가 되는 수열 (1,1,2,3,5,8,13,...)

		int p = 1; // 전수
		int pp = 1; // 전전수
		int c = 0; // 현재수

		System.out.printf("%-3d %-3d", p, pp);
		for (int i = 0; i < 51; i++) {
			c = p + pp;
			if (c >= 50)
				break; // if문이 아니라 for문인 자기가 속한 반복문을 벗어남
			System.out.printf("%-3d", c);
			pp = p;
			p = c;
		}
	}

	public static void forMethod04() {
		// 1 + 1/2 + 1/3 + ... + 1/10 = ?

		double sum = 0.0;

		for (int i = 1; i < 11; i++) {
			sum = sum + (1 / (double) i);
		}
		System.out.printf("결과 = %7.3f", sum);
		// 7.3 : 총 7칸 중에 소수점을 3칸 사용하고 나머지 4칸은 정수 혹은 빈칸으로 사용
	}
}
