package ddit.chap07.sec04;

public abstract class Shape {
	String kind;

	Shape(String kind) {
		this.kind = kind;
	}

	public abstract void draw(); // 추상메소드 -얘가 있어서 문이 없다? - 객체생성할 수 없음

	@Override
	public String toString() {
		return kind;
	}
	// 오버라이딩할때는 접근제한자가 원본보다 같거나 커야한다, 더 좁혀질 수는 없음
}

class Circle extends Shape {
	private Point p;
	private int radius;

	Circle(String kind, Point p, int radius) {
		super(kind);
		this.p = p;
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("원점이 " + p + "이고 반지름이 " + radius + "인 원을 그린다");
	}
}
