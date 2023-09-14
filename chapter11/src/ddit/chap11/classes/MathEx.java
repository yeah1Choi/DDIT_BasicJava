package ddit.chap11.classes;

import java.util.Arrays;

public class MathEx {

	public static void main(String[] args) {
		// 수학적 기능을 수행하는 메소드 제공 - random()

		// max(val1, val2) : 두 매개 변수 중 큰 값을 반환
		// : 오라클 db의 greatest 함수와 같은 방법으로 반환

		// 10명의 마일리지를 배열에 저장한 후 그 값이 1000미만이면 1000으로 반환
		// 자료 :1000,2300,3500,1700,6500,2700,800,1500,900,1100

		int[] mileage = { 1000, 2300, 3500, 1700, 6500, 2700, 800, 1500, 900, 1100 };
		System.out.println("원본: " + Arrays.toString(mileage));

		for (int i = 0; i < mileage.length; i++) {
			mileage[i] = Math.max(1000, mileage[i]);
		} // max 메소드의 단점: 두개 값만을 비교한다
		System.out.println("변경: " + Arrays.toString(mileage));

	}

}
