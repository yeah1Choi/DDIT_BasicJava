package ddit.chap06.sec02;

//실수 타입의 가로와 세로를 입력받아 사각형을 만드는
//클래스를 설계하고, 사각형의 면적을 계산하는 메서드를 포함시키시오.

public class Rectangle {
	private double width;
	private double height;

//	Rectangle(double w, double h) {
//		width = w;
//		height = h;
//	} 이름이 틀리니 this 메소드 필요없음, 이런 식이 많아지면 의미가 모호해져서 잘 안씀
	Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public void getArea() {
		double area = width * height;
		System.out.println("사각형의 넓이 : " + area);
	}
}
