package ddit.chap06.sec03;

// Circle�� ������, ������(���:3.1415926), ���� ������ ��ȯ�ϴ� �޼��� (getArea())

public class Circle { // ���� ���̸� ���ϱ� ����, ��ȯ�ϱ� ���� ���� class
	private double radius;
	private final double PI = 3.1415926; // ��� ���鶧�� double �տ� final�� ��

	Circle(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		// ���� ���� = ������*������*������
		return radius * radius * PI;
	}
}
