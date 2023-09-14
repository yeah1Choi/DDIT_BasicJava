package ddit.chap07.sec04;

public abstract class Shape {
	String kind;

	Shape(String kind) {
		this.kind = kind;
	}

	public abstract void draw(); // �߻�޼ҵ� -�갡 �־ ���� ����? - ��ü������ �� ����

	@Override
	public String toString() {
		return kind;
	}
	// �������̵��Ҷ��� ���������ڰ� �������� ���ų� Ŀ���Ѵ�, �� ������ ���� ����
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
		System.out.println("������ " + p + "�̰� �������� " + radius + "�� ���� �׸���");
	}
}
