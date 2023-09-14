package ddit.chap06.sec03;

/*
 * ������ ������ Circle Ŭ������ ����� ������ �����ϴ� Cylinder Ŭ������ �ۼ��Ͻÿ�.
�� ������ ��Ÿ���� Cylinder Ŭ������ Circle���� ���� �Ǽ����� ���̸� �ʵ�� ����
�� �޼ҵ� getVolume()�� ������ ���Ǹ� ��ȯ
�� Cylinder Ŭ������ main() �޼ҵ忡�� �������� 2.8, ���̰� 5.6�� ������ ���Ǹ� ���
�� Circle�� ������, ������(���:3.1415926), ���� ������ ��ȯ�ϴ� �޼��� (getArea())
 */

public class Cylinder {
	Circle c; // ��Ӱ���� �ƴ����� ���԰��踦 ������ ���� ����ϱ� ����
	double height;

	Cylinder(Circle c, double height) {
		this.c = c;
		this.height = height;
	}

	public void getVolumn() { // ��ȯŸ���� ���� void ���
		System.out.println("������� ����: " + (c.getArea() * height));
	}
}
