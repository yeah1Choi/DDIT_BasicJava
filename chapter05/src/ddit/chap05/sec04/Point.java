package ddit.chap05.sec04;

public class Point {
	private int x;
	private int y;

	Point() {
		x = 0;
		y = 0;
	}

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override // 하나의 클래스에서 발생하는 개념, 재정의
	public String toString() { // toString 메소드 : 
		return "(" + x + ", " + y + ")";
	}
}
