package ddit.chap05.sec04;

public class Triangle {
	Point[] p; // point �迭Ÿ�� Ŭ����, �ǹ�: p�� ����� �迭�� �ּҸ� ���󰡸� point�� ������ (point�� point �ߺ�)
	// �迭�� p�� ���� �� �ֵ��� ��

	Triangle(Point[] p) {
		this.p = new Point[] { new Point(100, 100), new Point(500, 100), new Point(250, 250) };
	}
	// this.p = new Point[] ���⼭ �迭�� ����� ���� ,
	// new Point(100, 100) => ��ȣ�� ������ �̰��� Ŭ���� ��ü�� ���������, 100,100 ���� ���� �ʱ�ȭ�� �Ͼ��
	// �迭�� �����Ͱ� �� �� �ִ� ���� 3ĭ �̹Ƿ� �ʱ�ȭ�� ���� ���� 3���� �̷������ ���� �ƴ϶� �� �ٸ� ĭ�� �ϳ��� �ʱ�ȭ�Ǿ� ������
	// ���� ����

	public void draw() {
		System.out.println(p[0] + "�� " + p[1] + " �����մϴ�");
		System.out.println(p[1] + "�� " + p[2] + " �����մϴ�");
		System.out.println(p[2] + "�� " + p[0] + " �����մϴ�");
	}
}
