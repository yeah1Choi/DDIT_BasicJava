package ddit.chap06.sec01;

public class GradeEx {

	public static void main(String[] args) {
		Grade g1 = new Grade();

		g1.score = new int[] { 1, 2, 3 };
		System.out.println("ÃÑÁ¡ : " + g1.getSum());
		System.out.println("Æò±Õ : " + g1.getAvg());

	}

}
