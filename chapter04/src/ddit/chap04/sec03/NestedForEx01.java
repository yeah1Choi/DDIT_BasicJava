package ddit.chap04.sec03;

public class NestedForEx01 {

	public static void main(String[] args) {
		// nestedForMethod01();
		nestedForMethod02();
	}

	public static void nestedForMethod01() {
		// 1 ~ 10 사이의 수를 붙여서 5줄 출력

		for (int i = 0; i < 5; i++) { // 줄을 담당
			for (int j = 0; j < 10; j++) { // 밖의 변수 i의 영역이기 때문에 중복선언을 피하려고 j를 선언
				System.out.print(j + 1);
			}
			System.out.println();
			// 줄바꿈, 안의 포문만을 실행하면 줄바꿈이 되지 않고 한줄에 5묶음의 1~0이 실행됨
		}
	}

	public static void nestedForMethod02() {
		// 구구단의 2단~9단 까지 출력

		for (int i = 2; i < 10; i++) { // 구구단의 단을 담당
			System.out.println("[[ " + i + "단 ]]");
			for (int j = 1; j < 10; j++) { // 곱해지는 수(승수)
				System.out.println(i + " * " + j + " = " + (i * j));
			}
			System.out.println(); // 공백 줄바꿈 : 단과 단 사이의
		}
	}
}
