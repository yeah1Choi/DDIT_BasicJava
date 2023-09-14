package ddit.chap07.sec01;
//자식
public class Triangle extends Shape {

	private int width; // 밑변
	private int height; // 높이

	Triangle(String kind, int width, int height) {
		super(kind);
		this.width = width;
		this.height = height;
	}

	@Override
	public double calcurateArea() {
		return (((double) width * height) / 2);
	}
}
