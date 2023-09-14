package ddit.chap06.sec08;

public class SeasonEx {

	public static void main(String[] args) {
		Season s = Season.SUMMER;
		Season s1 = Season.WINTER;
		Season s2 = Season.WINTER;

		System.out.println(s == Season.SUMMER);
		System.out.println(s1 == s2);
	}

}
