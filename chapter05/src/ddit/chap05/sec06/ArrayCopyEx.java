package ddit.chap05.sec06;

import java.util.Arrays;

// �迭����: ���� ����, ���� ����

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
		target[1] = 9000; // ��������� source���� �� ������ ���� �ʾҴ�
		System.out.println("source : " + Arrays.toString(source));
		System.out.println("target : " + Arrays.toString(target));
	}

	public static void cloneCapy() {
		int[] source = { 10, 20, 30, 40, 50 };
		int[] target = source.clone(); 
		// �迭���� Ŭ���� �����Ǿ� �־ ���� �� �� �ִ�
		// Ŭ�и޼ҵ�� ��ȯ���ִ� ������ Ÿ���� �迭�̿��� �ݵ�� �迭�̿����Ѵ�
		System.out.println("source : " + Arrays.toString(source));
		System.out.println("target : " + Arrays.toString(target));
	}
	public static void arrayCopy() {
		int[] source = { 10, 20, 30, 40, 50 };
		// System.arraycopy(src, srcPos, dest, destPos, length);
		/*   src: �����迭��
		 *   srcPos : �����迭���� �������� ��ġ
		 *   dest : ������� �迭��
		 *   destPos : ������� �迭 ��ġ
		 *   length : �������� ����
		 */
		int[] target = new int[10]; 
		System.arraycopy(source, 0, target, 4, source.length);
		
		System.out.println("source : " + Arrays.toString(source));
		System.out.println("target : " + Arrays.toString(target));
	}
}
