package ddit.chap06.sec03;

// Circle은 반지름, 원주율(상수:3.1415926), 원의 면적을 반환하는 메서드 (getArea())

public class Circle { // 원의 넓이를 구하기 위한, 반환하기 위해 만든 class
	private double radius;
	private final double PI = 3.1415926; // 상수 만들때는 double 앞에 final을 씀

	Circle(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		// 원의 넓이 = 반지름*반지름*원주율
		return radius * radius * PI;
	}
}
