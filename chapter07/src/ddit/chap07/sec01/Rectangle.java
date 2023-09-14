package ddit.chap07.sec01;

//자식
public class Rectangle extends Shape {

	private int width; // 가로
	private int height; // 세로

	Rectangle(String kind, int width, int height) {
		super(kind);
		this.width = width;
		this.height = height;
	}

	@Override
	public double calcurateArea() {
		return width * height;
	}
}
