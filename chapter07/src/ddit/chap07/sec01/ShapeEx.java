package ddit.chap07.sec01;

public class ShapeEx {

	public static void main(String[] args) {
		Circle circle = new Circle("��", 10);
		System.out.println(circle.kind + "�� ���� : " + circle.calcurateArea());

		Triangle triangle = new Triangle("�ﰢ��", 25, 15);
		System.out.println(triangle.kind + "�� ���� : " + triangle.calcurateArea());

		Rectangle rectangle = new Rectangle("�ﰢ��", 13, 8);
		System.out.println(rectangle.kind + "�� ���� : " + rectangle.calcurateArea());
	}

}
