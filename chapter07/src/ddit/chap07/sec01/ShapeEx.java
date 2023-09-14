package ddit.chap07.sec01;

public class ShapeEx {

	public static void main(String[] args) {
		Circle circle = new Circle("¿ø", 10);
		System.out.println(circle.kind + "ÀÇ ³ÐÀÌ : " + circle.calcurateArea());

		Triangle triangle = new Triangle("»ï°¢Çü", 25, 15);
		System.out.println(triangle.kind + "ÀÇ ³ÐÀÌ : " + triangle.calcurateArea());

		Rectangle rectangle = new Rectangle("»ï°¢Çü", 13, 8);
		System.out.println(rectangle.kind + "ÀÇ ³ÐÀÌ : " + rectangle.calcurateArea());
	}

}
