package ddit.chap06.sec01;

// 문제 3 – 세 과목의 성적을 입력 받고 총점과 합을 출력할 수 있는 Grade class를 설계하시오.

public class Grade {
	int[] score;
	private int sum;
	private double avg;

	public int getSum() {
		for (int i = 0; i < score.length; i++) {
			sum = sum + score[i];
		}
		return sum;
	}

	public double getAvg() {
		return (double) sum / 3;
	}
}
