package ddit.chap06.sec02;

//�Ǽ� Ÿ���� ���ο� ���θ� �Է¹޾� �簢���� �����
//Ŭ������ �����ϰ�, �簢���� ������ ����ϴ� �޼��带 ���Խ�Ű�ÿ�.

public class Rectangle {
	private double width;
	private double height;

//	Rectangle(double w, double h) {
//		width = w;
//		height = h;
//	} �̸��� Ʋ���� this �޼ҵ� �ʿ����, �̷� ���� �������� �ǹ̰� ��ȣ������ �� �Ⱦ�
	Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public void getArea() {
		double area = width * height;
		System.out.println("�簢���� ���� : " + area);
	}
}
