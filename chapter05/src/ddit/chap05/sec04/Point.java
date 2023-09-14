package ddit.chap05.sec04;

public class Point {
	private int x;
	private int y;

	Point() {
		x = 0;
		y = 0;
	}

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override // �ϳ��� Ŭ�������� �߻��ϴ� ����, ������
	public String toString() { // toString �޼ҵ� : 
		return "(" + x + ", " + y + ")";
	}
}
