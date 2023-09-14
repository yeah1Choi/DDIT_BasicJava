package ddit.chap05.sec06;

import java.util.Arrays;

// 배열복사: 옅은 복사, 깊은 복사

public class ArrayCopyEx {

	public static void main(String[] args) {
		// forCapy();
		//cloneCapy();
		arrayCopy();
	}

	public static void forCapy() {
		int[] source = { 10, 20, 30, 40, 50 };
		int[] target = new int[source.length];

		for (int i = 0; i < source.length; i++) {
			target[i] = source[i];
		}
		target[1] = 9000; // 결과값에서 source에게 이 영향을 받지 않았다
		System.out.println("source : " + Arrays.toString(source));
		System.out.println("target : " + Arrays.toString(target));
	}

	public static void cloneCapy() {
		int[] source = { 10, 20, 30, 40, 50 };
		int[] target = source.clone(); 
		// 배열에는 클론이 제정되어 있어서 쉽게 쓸 수 있다
		// 클론메소드는 반환해주는 데이터 타입이 배열이여서 반드시 배열이여야한다
		System.out.println("source : " + Arrays.toString(source));
		System.out.println("target : " + Arrays.toString(target));
	}
	public static void arrayCopy() {
		int[] source = { 10, 20, 30, 40, 50 };
		// System.arraycopy(src, srcPos, dest, destPos, length);
		/*   src: 원본배열명
		 *   srcPos : 원본배열에서 복사해줄 위치
		 *   dest : 복사받을 배열명
		 *   destPos : 복사받을 배열 위치
		 *   length : 복사해줄 갯수
		 */
		int[] target = new int[10]; 
		System.arraycopy(source, 0, target, 4, source.length);
		
		System.out.println("source : " + Arrays.toString(source));
		System.out.println("target : " + Arrays.toString(target));
	}
}
