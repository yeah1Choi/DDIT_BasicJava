package ddit.chap05.sec05;

// 5명의 3과목 성적이 다음과 같다. 이를 배열에 저장하고 출력하시오
// [데이터]
/* 국어    영어    수학
 *  75   80   65
 *  95   85   85
 *  65   85   85
 *  90   60   85
 *  95   90   95
 */

public class TwoDimArrayEx01 {

	static int[][] score;
	static String[] name;

	// static(이 식을 사용할 밑의 메소드의 static을 똑같이 해 과거시점을 맞춰준다)

	public static void main(String[] args) {
		twoDimMethod01();
		printScore();
		sortdata();
	}

	public static void twoDimMethod01() {
		score = new int[][] { { 75, 80, 65, 0, 0, 1 }, 
			                  { 95, 85, 85, 0, 0, 1 }, 
			                  { 65, 85, 85, 0, 0, 1 },
			                  { 90, 60, 85, 0, 0, 1 }, 
			                  { 95, 90, 95, 0, 0, 1 } };
		// 합계와 평균 이러한 새로운 값을 넣어주려면 일단 0을 데이터에 넣어서 저장해
		// 배열의 칸을 얻을 수 있다
		// 등수를 새로 넣어주려는데 등수에는 0등이 없어서 기본값을 1로 넣어줌
		name = new String[] { "가나다", "라마바", "사아자", "차카타", "파하가" }; // 별도의 배열
		for (int i = 0; i < score.length; i++) { // 행
			for (int j = 0; j < 3; j++) { // 열
				score[i][3] = score[i][3] + score[i][j];
			}
			score[i][4] = score[i][3] / 3;
		}
		getLank();
	}

	public static void printScore() {
		System.out.println("--------------------------------------");
		System.out.println("   이 름        국어    영어    수학   총점     평균     등수");
		System.out.println("--------------------------------------");
		for (int i = 0; i < score.length; i++) { // 행
			System.out.printf("[%-3s]", name[i]);
			for (int j = 0; j < score[i].length; j++) { // 열
				System.out.printf("%5d", score[i][j]);
			}
			System.out.println();
		}
		System.out.println("--------------------------------------");
	}

	public static void getLank() {
		for (int i = 0; i < score.length; i++) { // 기준값 위치
			for (int j = 0; j < score.length; j++) { // 비교값 위치
				if (score[i][3] < score[j][3])
					score[i][5]++;
			}
		}
	}

	public static void sortdata() { // 큰 점수순대로 다시 정렬
		// bubble sort
		for (int i = 0; i < score.length - 1; i++) {
			for (int j = 0; j < score.length - 1 - i; j++) {
				if (score[j][3] < score[j + 1][3]) {
					String temp = name[j]; // 비교해 서로 뒤바뀌게함
					name[j] = name[j + 1];
					name[j + 1] = temp;
					for (int k = 0; k < score.length; k++) {
						int t = score[j][k];
						score[j][k] = score[j + 1][k];
						score[j + 1][k] = t;
					}
				}
			}
		}
		System.out.println("\n\n\n");
		printScore();
	}
}
