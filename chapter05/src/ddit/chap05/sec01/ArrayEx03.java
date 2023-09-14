package ddit.chap05.sec01;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx03 {

	Scanner sc = new Scanner(System.in);
	// 멤버필드(직접 클래스에서 선언) : 과거의 static을 제외하고는 블록 밖에 선언되었기에 이 변수를 모두에서 사용가능하다

	public static void main(String[] args) {
		// 정수배열 10개 (score)를 선언하고 키보드를 통해 값을 입력된 값으로 초기화한 수
		// 최대값과 최소값을 구하시오
		int[] num = new ArrayEx03().setDate();
		new ArrayEx03().getMaxMin(num);
	}

	public int[] setDate() {
		int[] number = new int[10];
		for (int i = 0; i < number.length; i++) {
			System.out.print("number[" + i + "] = ");
			number[i] = Integer.parseInt(sc.nextLine());
			// nextLine() 메소드는 엔터(공백)이 생기기 전에 문장 전체를 입력받는다
		}
		return number;
		// 실행 중인 메서드 종료하고 호출한 메서드로 되돌아감
		// 이 number가 두개의 저장을 갖고 있지만 하나이기에 두 저장소의 number 값은 같다
		// 다른 곳에서 바뀌면 다른 쪽에서도 바뀐다 하나이기에
	}

	public void getMaxMin(int[] num) {
		int tmax = num[0]; // 임시최대값
		int tmin = num[0]; // 임시최소값

		for (int i = 1; i < num.length; i++) {
			if (tmax < num[i])
				tmax = num[i];
			if (tmin > num[i])
				tmin = num[i];
		}
		System.out.println("원본배열 : " + Arrays.toString(num));
		System.out.println("최대값 = " + tmax);
		System.out.println("최소값 = " + tmin);
	}
}
