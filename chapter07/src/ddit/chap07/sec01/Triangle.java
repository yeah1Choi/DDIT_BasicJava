package ddit.chap07.sec01;
//�ڽ�
public class Triangle extends Shape {

	private int width; // �غ�
	private int height; // ����

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
