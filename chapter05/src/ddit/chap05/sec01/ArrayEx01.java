package ddit.chap05.sec01;

import java.util.Arrays;

public class ArrayEx01 {

	public static void main(String[] args) {
		int[] num = null;
		System.out.println("num = " + num);
		// 지역변수는 값을 지정하지 않으면 오류이다

		num = new int[5]; 
		// new 연산자는 객체를 생성할때 사용, heap 영역에 새로운 메모리 공간을 할당 후 주소값 반환, 같은 변수여도 서로 다른 메모리를 할당해 서로 다른 객체 
		System.out.println("num = " + num);

		num[0] = 50;
		num[1] = 20;
		num[2] = 90;
		num[3] = 80;
		num[4] = 60;
		System.out.println("num = " + Arrays.toString(num));

		for (int a : num) {
			System.out.printf("%3d", a);
		}

		for (int i = 0; i < num.length; i++) {
			System.out.printf("%3d", num[i]);
		}

	}

}
