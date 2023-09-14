package ddit.chap05.sec02;

import java.util.Arrays;

public class SortEx {

	public static void main(String[] args) {
		BubbleSort bubbleSort = new BubbleSort(); // 클래스를 따로 만들어서 new으로 객체생성
		bubbleSort.sort(); // = bubbleSort에 있는 sort 실행
	}

}

class BubbleSort {
	private int[] number;
	// privite 접근제한자:클래스 벗어나면 참조할 수 없음, 클래스 안에서만 number 사용

	BubbleSort() {
		// 생성자메소드: 멤버필드(변수)초기화의 목적있음, 클래스인데 메소드임
		// 쓸 수 있는 방법은 new 객체생성
		number = new int[] { 27, 35, 19, 5, 47, 80, 15, 65, 50, 12 };
	}

	public void sort() {
		boolean flag = true;
		System.out.println("[원본 데이터");
		System.out.println(Arrays.toString(number));
		for (int i = 0; i < number.length - 1; i++) { // 회차를 위해 -1함, 회전수행은 n-1
			flag = true;
			for (int j = 0; j < number.length - 1 - i; j++) {
				// 회전이 끝나고 마지막은 큰수기에 다음 회전에선 비교제외를 위해 -i함
				if (number[j] > number[j + 1]) {
					int temp = number[j]; // temp의 목적은 빈 자리를 이 temp변수에 저장해 뒷수에게 자리바꿈을 위해
					number[j] = number[j + 1];
					number[j + 1] = temp;
					flag = false; // 자리바꿈이 일어나면 flag를 false로 값을 바꾼다
				}
			}
			if (flag == true)
				break; // flag가 참이면 break를 실행하게 하여 자리바꿈이 이제 더이상 되지 않을때 참이 되어 멈춘다
		}
		System.out.println("[정렬된 데이터]");
		System.out.println(Arrays.toString(number));

	}

	public class SelectionSort {
		private int[] num; // = new int[10]; // 이미 0이 10칸에 들어가있다 int 정수타입이라서
		// num 변수는 SelectionSort 클래스 안에서 어디든 사용가능

		public SelectionSort() { // 생성자 : 클래스인데 메소드: 인스턴스변수(num) 초기화의 목적
			num = new int[] { 35, 40, 70, 16, 95, 19, 27, 63, 88, 57 };
			// 불규칙정렬이라 앞서 직접 초기화로 new 연산자로 정렬을 생성하지 않아도 된다 "new int[10];"
			// 그래서 가져와 SelectionSort 메소드 안에서 생성했다(?
		}

		public void selectionSort() {
			System.out.println("[정렬 전 자료]");
			System.out.println(Arrays.toString(num));

			for (int i = 0; i < num.length - 1; i++) { // 회전 담당
				for (int j = i + 1; j < num.length; j++) { // 각 회전에서 비교 담당
					if (num[i] > num[j]) {
						int temp = num[i];
						num[i] = num[j];
						num[j] = temp;
					}
				}
			}
		}

		public void printDate() {
			System.out.println("[정렬 후 자료]");
			System.out.print("[");
			for (int su : num) {
				System.out.printf("%-2d", su);
			}
			System.out.print("]");
		}
	}
}
