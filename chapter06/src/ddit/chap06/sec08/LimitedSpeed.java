package ddit.chap06.sec08;

public enum LimitedSpeed {
	SchoolZone(30), DownTown(50), CountrySide(70);

//SchoolZone 상수에 30이라는 인덱스를 부여
	private final int values; // 인덱스 30, 50, 70을 보관하는 상수

	LimitedSpeed(int values) { // emun 클래스 생성자 메소드 (인덱스를 보유한 enum 클래스)
		this.values = values;
	}

	public int getValues() { // 해당 인덱스(values)를 enum 클래스를 호출한 위치에 반환
		return values;
	}
}
