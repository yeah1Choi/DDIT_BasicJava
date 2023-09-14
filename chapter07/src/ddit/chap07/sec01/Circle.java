package ddit.chap07.sec01;
// 자식
public class Circle extends Shape {

	private int radius; // 반지름
	private final double PI = 3.1415926;

	Circle(String kind, int radius) {
		super(kind);
		this.radius = radius;
	}

	@Override // 부모 메소드 재정의
	public double calcurateArea() {
		return radius * radius * PI;
	}

}
