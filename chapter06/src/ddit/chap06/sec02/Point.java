package ddit.chap06.sec02;

public class Point {
	private int x;
	private int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	// this, super ������ ���� : �ּҰ��� ���� (�ڱⰡ ���Ե� �ڽ��� Ŭ������)
	// ���� ������ �޼ҵ忡�� ��� => ��������(�Ű������� ���޵Ǿ� ����)�� ����ʵ尡 �̸��� ������ �� ��������� ��ħ�ϱ� ����

//	public int getX() {
//		return x;
//	}
//	public void setX(int x) {
//		this.x = x;
//	}
//	public int getY() {
//		return y;
//	}
//	public void setY(int y) {
//		this.y = y;
//	}

	// @Override �����ϵǴ� �ּ� - �������Ѵ� : toString�� �������Ѵ�
	@Override
	public String toString() { // toString() : ��ü ������ ���ڿ��� ��ȯ�� �� ����ϴ� �޼ҵ�
		return "("+x+", "+y+")";
		//return getClass().getName() + '@' + Integer.toHexString(hashCode());
		//return getClass().getName() + '@' + hashCode();
	}
}
