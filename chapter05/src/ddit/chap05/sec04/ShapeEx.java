package ddit.chap05.sec04;

public class ShapeEx {

	public static void main(String[] args) {
		Point[] p = new Point[3]; // �迭 point 3��¥���� ���� point�迭�� ���� p�� �־�
		Triangle t1 = new Triangle(p);
		// ���� p�� Triangle Ŭ������ ��ü�� ����� t1 ������ �������
		t1.draw();
	}

}
