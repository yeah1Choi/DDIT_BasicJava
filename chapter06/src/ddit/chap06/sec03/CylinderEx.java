package ddit.chap06.sec03;

public class CylinderEx {

	public static void main(String[] args) {
		Cylinder cylinder = new Cylinder(new Circle(2.8), 5.6);
		// = 반지름이 2.8이고 높이 5.6인 원통의 부피 출력
		cylinder.getVolumn();
	}

}
