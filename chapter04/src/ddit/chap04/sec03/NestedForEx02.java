package ddit.chap04.sec03;

/*   1)           2)       3)          4)       5)            6)
 *   *            *        *****     *****           *        *********
 *   **          **        ****       ****          ***        *******
 *   ***        ***        ***         ***         *****        *****
 *   ****      ****        **           **        *******        ***
 *   *****    *****        *             *       *********        *
 */
public class NestedForEx02 {

	public static void main(String[] args) {
		// nestedForMathod01();
		// nestedForMathod02();
		// nestedForMathod03();
		// nestedForMathod04();
		// nestedForMathod05();
		nestedForMathod06();
	}

	public static void nestedForMathod01() {

		for (int i = 0; i < 11; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void nestedForMathod02() {

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4 - i; j++) { // 공백출력
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) { // "*" 출력
				System.out.print("*");
			}
			System.out.println(); // 줄바꿈
		}
	}

	public static void nestedForMathod03() {

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 - i; j++) { // "*" 출력
				System.out.print("*");
			}
			for (int j = 0; j <= i; j++) { // 공백출력
				System.out.print(" ");
			}
			System.out.println(); // 줄바꿈
		}
	}

	public static void nestedForMathod04() {

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) { // 공백출력
				System.out.print(" ");
			}
			for (int j = 0; j < 5 - i; j++) { // "*" 출력
				System.out.print("*");
			}
			System.out.println(); // 줄바꿈
		}
	}

	public static void nestedForMathod05() {

		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 4 - i; j++) { // 공백출력
				System.out.print(" ");
			}
			for (int j = 0; j < ((i + 1) * 2) - 1; j++) { // "*" 출력
				System.out.print("*");
			}
			for (int j = 0; j < 4 - i; j++) { // 공백출력
				System.out.print(" ");
			}

			System.out.println(); // 줄바꿈
		}
	}

	public static void nestedForMathod06() {

		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < i; j++) { // 공백출력
				System.out.print(" ");
			}
			for (int j = 0; j < ((5 - i) * 2) - 1; j++) { // "*" 출력
				System.out.print("*");
			}
			for (int j = 0; j < i; j++) { // 공백출력
				System.out.print(" ");
			}

			System.out.println(); // 줄바꿈
		}
	}
}
